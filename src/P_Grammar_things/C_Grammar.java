/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Grammar_things;

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
    
    private void ld_production(String NoT, String right_sd) {
        C_Production nw_pr = new C_Production();
        nw_pr.set_Left(NoT);
        nw_pr.ld_production(right_sd);
        this.grammar.add(nw_pr);
    }
    
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
    
    private boolean check_NoT_inGrammar(String NonTerminal) {
        for(C_Production pr : this.grammar) {
            if(pr.getLeft().compareTo(NonTerminal) == 0)
                return true;
        }        
        return false;
    }
}
