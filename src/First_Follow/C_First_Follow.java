/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First_Follow;

import P_Grammar_things.C_Grammar;
import P_Symbol.C_Symbol;
import java.util.ArrayList;
/**
 *
 * @author devcrack
 */
public class C_First_Follow {
    /**
     * The number of sets is given for the number of Terminals in function of their respective productions;
     */
    ArrayList<ArrayList<C_Symbol>>first_set;
    
    /**
     * Few to moment, Initalize a Firts set in function of the number of productions;
     * @param nmr_trmls Number of productions that do not repeat in the grammar;
     */
    public C_First_Follow(int nmr_trmls) {
        this.first_set = new ArrayList<ArrayList<C_Symbol>>();
        for(int i = 0; i < nmr_trmls; i++)
            this.first_set.add(new ArrayList<C_Symbol>());
    }
     
    
    public void calculate_first_set(C_Grammar gram) {
        boolean change_it = true;
        
        while(change_it) {
            change_it = false;
            
        }
    }
    
}
