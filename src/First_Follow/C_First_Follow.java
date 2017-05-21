/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First_Follow;

import P_Grammar_things.C_Grammar;
import P_Symbol.C_Symbol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
/**
 *
 * @author devcrack
 */
public class C_First_Follow {
    /**
     * The number of sets is given for the number of Terminals in function of their respective productions;
     */
//    ArrayList<ArrayList<C_Symbol>>first_set;
    HashMap<String, ArrayList<C_Symbol>> first_set;
    C_Grammar grammar;
    
    
    
    /**
     * Few to moment, Initalize a Firts set in function of the number of productions;
     * @param nmr_trmls Number of productions that do not repeat in the grammar;
     */
    public C_First_Follow(C_Grammar g) {
        this.grammar = g;
        
        Iterator it = g.get_Non_Terminals().iterator();
        
        this.first_set = new HashMap<String,ArrayList<C_Symbol>>();        
        while(it.hasNext()) 
            first_set.put((String) it.next(),new ArrayList<C_Symbol>());
    }
     
    
    public void calculate_first_set() {
        boolean change_it = true;
        Iterator map_iterator;
        ArrayList<Integer>indexs = new ArrayList<Integer>();
        C_Symbol first;
        
        while(change_it) {
            map_iterator = this.first_set.entrySet().iterator();
            while(map_iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) map_iterator.next();
                indexs = this.grammar.get_indexs((String) entry.getKey());
                for(int i : indexs) {
                    first = this.grammar.get_First(i);
                    if(first !=null)
                        ((ArrayList<C_Symbol>)entry.getValue()).add(first);
                }
            }
        }
    }
    
    
    
}
