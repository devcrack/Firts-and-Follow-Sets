/*This class is use to define a Terminal Simbol. 
As we can se this inherits from Symbol Class
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Token;

/**
 *
 * @author devcrack
 */
public class C_T  extends C_Symbol { 
    
    public C_T(){ super(); } 
    
    /**
     * Gets the terminal 
     * @return 
     */
    public String get_CT() {
        return super.getSymbol();
    }
}
