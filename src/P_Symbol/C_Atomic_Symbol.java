/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Symbol;

/**
 *
 * @author devcrack
 */
public class C_Atomic_Symbol {
    protected String symbol;
    
    public C_Atomic_Symbol()
    {
        this.symbol = new String();
    }

    /**
     * @return the simbolos
     */
    public String get_Atomic_Symbol() {
        return symbol;
    }

    /**
     * @param simbolos the simbolos to set
     */
    public void set_Atomic_Symbol(String symbol) {
        this.symbol = symbol;
    }
    
    protected boolean is_META_character()
    {
        String metacharacters =  " + * < > | \\\\";
        
        if(metacharacters.contains(this.symbol))
             return true;
        else 
            return false;
    }
}
