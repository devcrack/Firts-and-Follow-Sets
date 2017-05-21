/*Autor: Devcrack JAHA: Jesus Aurelio Hernandez Aguilar.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Grammar_things;

import P_Symbol.C_Atomic_Symbol;
import P_Symbol.C_Symbol;
import java.util.ArrayList;

/**
 *
 * @author devcrack
 */
public class C_Grammar {
    private ArrayList<C_Production> grammar;
    
    public C_Grammar() { this.grammar = new ArrayList<C_Production>(); }

    /**
     * @return the grammar
     */
    public ArrayList<C_Production> getGrammar() {
        return grammar;
    }

    /**
     * @param grammar the grammar to set
     */
    public void setGrammar(ArrayList<C_Production> grammar) {
        this.grammar = grammar;
    }
    
    /**
     * Add a production to the grammar.
     * @param pr 
     */
    public void add_production(C_Production pr) {
        this.grammar.add(pr);
    }
    
    public void load_grammar(String NT, String rest_of)
    {
        StringBuilder bldr = new StringBuilder();
        char c = '\0';
        
        for(int i = 0; i < rest_of.length(); i++) {
            c = rest_of.charAt(i);
            if( c == '|' && i > 0  && rest_of.charAt(i -1) != '\\')
            {
                this.ld_production(NT, bldr.toString());
                bldr = new StringBuilder();
            }
            else
                bldr.append(c);                
        }
        if(bldr.length() > 0)
            this.ld_production(NT, bldr.toString());
    }
    
    /**
     * Load a production fromm a String with Production format
     * @param NoT No terminal that leads the production
     * @param right_sd  Set of terminals and non terminals of the production.
     */
    private void ld_production(String NoT, String right_sd) {
        C_Production nw_pr = new C_Production();
        nw_pr.set_Left(NoT);
        nw_pr.ld_production(right_sd);
        this.grammar.add(nw_pr);
    }
    
    /**
     * Checks if the production is valid by verify  all Non terminals
     * @return true if the grammar is valid.
     */
    public boolean is_valid_grammar() {
        for(C_Production pr : this.grammar) {
            for(C_Symbol smbl : pr.getRight()) {
                if(!smbl.is_NT_EMPTY())
                    if(!this.check_NoT_inGrammar(smbl.getNt()))
                        return false;
            }
        }
        return true;
    }
    
    /**
     * Check if a given non terminal is content in the productions.
     * @param NonTerminal
     * @return true if the terminal is found it.
     */
    private boolean check_NoT_inGrammar(String NonTerminal) {
        for(C_Production pr : this.grammar) {
            if(pr.getLeft().compareTo(NonTerminal) == 0)
                return true;
        }        
        return false;
    }
    
    
    /**
     * 
     * @return List of NonTerminals that leads the production in the grammar.
     */
    public ArrayList<String>get_Non_Terminals()
    {
        ArrayList<String>list = new ArrayList<String>();
        String str = "";
        
        for(C_Production pr : this.grammar) {
            str = pr.getLeft();
            if(list.contains(str) == false)
                list.add(str);
        }
        
        return list;
    }
    
    /**
     * Determine the number of Non Terminals that does not have repitition in the grammar.
     * @return The number of Productions that have a terminal without repitition.
     */
    public int number_Terminals_leads() {
        int cont = 0;
        String prev_Non_Terminal = "";
        
        for(C_Production pr : this.grammar) {
            if(prev_Non_Terminal.compareTo(pr.getLeft()) != 0)
                cont++;
            prev_Non_Terminal = pr.getLeft();
        }
        
        return cont;
    }
    
    /**
     * Get a list with the index that corresponds to a given NonTerminal.
     * @param NonTerminal
     * @return A list with the indexs of the production.
     */
    public ArrayList<Integer> get_indexs(String NonTerminal)
    {
        ArrayList<Integer> indexs = new ArrayList<Integer>();
        int i = 0;
        
        for(C_Production pr : this.grammar) {
            if(NonTerminal.compareTo(pr.getLeft()) == 0)
                indexs.add(i);
            i++;
        }        
        return indexs;
    }
    
    /**
     * Get first of a production of the grammar in function of a given index.
     * @param index position of the Production in the grammar.
     * @return The symbol that correspond to first if this production have it directly if else returns NULL.
     */
    public C_Symbol get_First(int index) { return this.grammar.get(index).get_first(); }
}
