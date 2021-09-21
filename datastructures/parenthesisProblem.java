import java.util.*;
public class parenthesisProblem {
    public static void main(String[] args) {
        
    }
    static void isExpressionBalanced(String s)
    {
       //using arraylists for stack implementation
        ArrayList<String> al = new ArrayList<String>(); 
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                al.add(Character.toString(s.charAt(i)));
            }
            
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(al.size() != 0 && al.get(al.size()-1).equals("(") && s.charAt(i) == ')')
                {
                    al.remove(al.size()-1);
                }
                else if(al.size() != 0 && al.get(al.size()-1).equals("{") && s.charAt(i) == '}')
                {
                    al.remove(al.size()-1);
                }
                else if(al.size() != 0 && al.get(al.size()-1).equals("[") && s.charAt(i) == ']')
                {
                    al.remove(al.size()-1);
                }
                else
                {
                    System.out.println("Entered expression is not balanced!");
                }
            }
            
        }
        if(al.isEmpty() == true)
        {
            System.out.println("Entered expression is balanced!");
        }
    
    }
}

