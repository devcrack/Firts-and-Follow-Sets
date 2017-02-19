/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Grammar_things;

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
}
