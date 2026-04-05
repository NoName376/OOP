package practice5;

import java.util.*;

public class Example4
{
    public static void main(String[] args) {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+-*/ ", true);

       while (tokenizer.hasMoreTokens()) {
           try {
               leftString = tokenizer.nextToken().trim();
               if (leftString.isEmpty()) continue;

               operator = tokenizer.nextToken().trim();
               rightString = tokenizer.nextToken().trim();

               try {
                   leftOperand = Double.parseDouble(leftString);
               } catch (NumberFormatException nfe) {
                   System.out.println("Error: '" + leftString + "' is not a number");
                   continue; 
               }

               try {
                   rightOperand = Double.parseDouble(rightString);
               } catch (NumberFormatException nfe) {
                   System.out.println("Error: '" + rightString + "' is not a number");
                   continue;
               }

               if (operator.equals("+")) {
                   result = leftOperand + rightOperand;
               } else if (operator.equals("-")) {
                   result = leftOperand - rightOperand;
               } else if (operator.equals("*")) {
                   result = leftOperand * rightOperand;
               } else if (operator.equals("/")) {
                   if (rightOperand == 0) 
                	   		throw new ArithmeticException("Division by zero");
                   result = leftOperand / rightOperand;
               } else {
                   System.out.println("Unknown operator: " + operator);
                   continue;
               }

               System.out.println(leftOperand + " " + operator + " " + rightOperand + " = " + result);

           } catch (NoSuchElementException nsee) {
               System.out.println("Invalid syntax: incomplete expression");
               break;
           }    
       }
    }
}
