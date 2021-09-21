import java.util.*;

public class parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression:");
        String exp = sc.nextLine(); // *reads the whole expression

        // *using arraylist to implement stack
        ArrayList<String> a = new ArrayList<String>();

        for (int i = 0; i < exp.length(); i++) {
            // ?check if ith index of the string contains the parenthesis or not!
            if (exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '(') {
                // ?convert character to string before storing into the stack.
                String chartoString = Character.toString(exp.charAt(i));

                // ?push into stack
                a.add(chartoString);

                // ?pop from stack
            } else if (exp.charAt(i) == '}' || exp.charAt(i) == ']' || exp.charAt(i) == ')') {
                // *this condition checks, stack isn't empty and check that if '(' is present or
                // not. If yes, then remove it from stack.
                if (a.size() != 0 && a.get(a.size() - 1).equals("(") && exp.charAt(i) == ')') {
                    a.remove(a.size() - 1);
                }
                // *this condition checks, stack isn't empty and check that if '{' is present or
                // not. If yes, then remove it from stack.
                else if (a.size() != 0 && a.get(a.size() - 1).equals("{") && exp.charAt(i) == '}') {
                    a.remove(a.size() - 1);
                }
                // *this condition checks, stack isn't empty and check that if '[' is present or
                // not. If yes, then remove it from stack.
                else if (a.size() != 0 && a.get(a.size() - 1).equals("[") && exp.charAt(i) == ']') {
                    a.remove(a.size() - 1);
                }

            }

        }
        // ?If stack empty, then all characters of expression matched!
        if (a.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

}
