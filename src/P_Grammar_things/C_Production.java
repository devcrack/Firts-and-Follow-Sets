/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_Grammar_things;

import P_Symbol.C_Set_Symbol;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author devcrack
 */
public class C_Production {
    private ArrayList<C_Set_Symbol>left;
    private ArrayList<C_Set_Symbol>right;
    
    
    public C_Production()
    {
        this.left = new ArrayList<C_Set_Symbol>();
        this.right = new ArrayList<C_Set_Symbol>();
    }

    
    /**
     * @return the left
     */
    public ArrayList<C_Set_Symbol> getLeft() {
        return left;
    }
    

    /**
     * @return the right
     */
    public ArrayList<C_Set_Symbol> getRight() {
        return right;
    }
    
    
    public static boolean check_production(String str)
    {
        String meta_chars = "(\\\\\\*|\\\\\\+|\\\\>|\\\\\\\\|\\\\\\||\\\\<|\\\\-)";
        String t = "(((\\w)+_*(\\w)*|\\(|\\)|(\\w)*_*(\\w)+|\\w|)'?)";
        String NT_right = "(<" + t + "+" + ">)";
        String left_side = "(" + meta_chars + "*" + t  + "+" + "|"+ meta_chars + "+" + t + "*)+";
        Matcher matcher;
        boolean flag;

        if(count_epsilon(str) > 1)
            return false;
        matcher = Pattern.compile("^("+left_side + "->~)$").matcher(str);
        flag = matcher.matches();
        
        if(flag)
            return flag;
        if(str.charAt(str.length() -1) =='|' && str.charAt(str.length() - 2) !='\\'  && str.length() > 1)
            return false ;
        else
        {
            String right_side = "(" +
                    "("+t +"*" + NT_right + "+|" + t +"+" + NT_right + "*)+"+meta_chars + "*"
                    + "|" +
                    "("+t +"*" + NT_right + "+|" + t +"+" + NT_right + "*)*"+meta_chars + "+"+ ")+";
            
            String regex = "^(" + left_side + "->" + right_side + "(\\|("+"~|" + right_side+ ")" + ")*)$"; //regex = "^(" + left_side + "->" + right_side + ")$";

            matcher = Pattern.compile(regex).matcher(str);
            return matcher.matches();
        }
        
        //return false;
    }
    
    private static Integer count_epsilon(String str)
    {
        int cc = 0;
        for(char c: str.toCharArray())
        {
            if(c =='~')
                cc++;
            if(cc>1)
                return cc;
        }
        return cc;
    }
    
    
    public void ld_production(String str)
    {
        char crrt_symbol;
        StringBuilder str_blr = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++)
        {
            
            crrt_symbol = str.charAt(i);
           int j;
            j = 0;
            if( (this.is_Metacharecter(crrt_symbol) == true && i > 0 && str.charAt(i - 1) == '\\') || is_valid_symbol(crrt_symbol))
                    str_blr.append(crrt_symbol);
        }
    }
    
    private boolean is_Metacharecter(char c)
    {
        String metacharacters =  " + * < > | \\\\";
        
        if(metacharacters.contains("" + c + ""))
             return true;
        else 
            return false;
        //return (metacharacters.contains("" + c + "")) ?true : false;
    }
    
    private boolean is_reserve_symbol(char c)
    {
        String reserve_symbol =  "| < >";
        
        if(reserve_symbol.contains("" + c + ""))
             return true;
        else 
            return false;        
    }
    
    private boolean is_valid_symbol(char c)
    {
        if((c >= '0' && c <= '9') || c == '\'' || c == '~')
            return true;
        if( (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
            return true;
        return false;
    }
}






///VeroGarcia123
