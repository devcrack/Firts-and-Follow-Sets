/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Grammar_things;

import P_Token.C_Token;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author devcrack
 */
public class C_Production {
    private ArrayList<C_Token>left;
    private ArrayList<C_Token>right;
    
    
    public C_Production()
    {
        this.left = new ArrayList<C_Token>();
        this.right = new ArrayList<C_Token>();
    }

    
    /**
     * @return the left
     */
    public ArrayList<C_Token> getLeft() {
        return left;
    }
    

    /**
     * @return the right
     */
    public ArrayList<C_Token> getRight() {
        return right;
    }
    
    
    public static boolean check_production(String str)
    {
        String meta_chars = "(\\\\\\*|\\\\\\+|\\\\>|\\\\\\\\|\\\\\\||\\\\<|\\\\-)";
        String t = "(((\\w)+_*(\\w)* | (\\w)*_*(\\w)+|\\w)'?)";
        String NT_right = "(<" + t + "+" + ">)";            
        String left_side = "(" + meta_chars + "*" + t  + "+" + "|"+ meta_chars + "+" + t + "*)+";
        String right_side = "(" + 
                "("+t +"*" + NT_right + "+|" + t +"+" + NT_right + "*)+"+meta_chars + "*" 
                + "|" +
                "("+t +"*" + NT_right + "+|" + t +"+" + NT_right + "*)*"+meta_chars + "+"
                + ")+";
        String regex = "^(" + left_side + "->" + right_side + ")$";
        
        regex = "^(" + left_side + "->" + right_side + "(\\|("+"~|" + right_side+ ")" + ")*)$";
        //regex = "\\|";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    
}
