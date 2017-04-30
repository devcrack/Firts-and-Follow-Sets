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
public class C_Symbol 
{
    private C_NT nt;
    private C_T   t;
    private C_Epsilon epsilon;
    
    public C_Symbol()
    {
        this.nt = new C_NT();
        this.t = new C_T();
        this.epsilon = new C_Epsilon();
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
    
    
    /**
     * Set the corresponding String to Terminal Symbol
     * @param str_T 
     */
    public void set_T(String str_T)
    {
        this.t.set_Atomic_Symbol(str_T);
    }
    
    /**
     * Set the correponding string to No Terminal Symbol
     * @param str_NT Given String for set to the No terminal Symbol
     */
    public void set_NT(String str_NT)
    {
        this.nt.set_Atomic_Symbol(str_NT);
    }

    /**
     * @return the epsilon
     */
    public C_Epsilon getEpsilon() {
        return epsilon;
    }

    /**
     * @param epsilon the epsilon to set
     */
    public void setEpsilon(String s_epsilon) {
        this.epsilon.set_Atomic_Symbol(s_epsilon);
    }
    
}
