/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Token;

/**
 *
 * @author devcrack
 */
public class C_Token 
{
    private C_NT nt;
    private C_T   t;
    
    public C_Token()
    {
        this.nt = new C_NT();
        this.t = new C_T();
    }

    /**
     * @return the nt
     */
    public C_NT getNt() {
        return nt;
    }

    /**
     * @return the t
     */
    public C_T getT() {
        return t;
    }
}
