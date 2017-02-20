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
    
    public void load_production(String str)
    {
        C_Token nw_token; 
        String[] pr = str.split("->");
        
        nw_token = new C_Token();
        nw_token.getNt().setSymbol(pr[0]);
        int dmb = 0;
    }
}






///VeroGarcia123
