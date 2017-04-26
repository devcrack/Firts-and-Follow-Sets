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
public class C_Set_Symbol 
{
    private C_NT nt;
    private C_T   t;
    
    public C_Set_Symbol()
    {
        this.nt = new C_NT();
        this.t = new C_T();
    }

    /**
     * @return the nt
     */
    public String getNt() {
        return nt.get_NT();
    }

    /**
     * @return the t
     */
    public String getT() {
        return t.get_CT();
    }
}
