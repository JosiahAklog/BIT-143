// This program reads a Reverse Polish Notation mathematical Expression
// and evaluates it.  The program will show each step if the user chooses that
// otherwise the program will only print out the end result
//

import java.util.*;

public class ReversePolishNotationCalculator {

    private static Scanner printRemainingExpression(Stack<Double> numbers, Scanner scExpression) {
        String remainderOfExpr = scExpression.nextLine();
        System.out.println("Remaining expression: " + remainderOfExpr + " Stack: " + numbers);
        scExpression.close();
        return new Scanner(remainderOfExpr + "\n");
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char evalAgain = 'y';

        ShouldWeTryAgain: while (evalAgain == 'y') {
            Stack<Double> numbers = new Stack<>();
            double nextNumber = 0;

            System.out.println("\nRPN calculator");
            System.out.println("\tSupported operators: + - * /");
            System.out.print("Type your RPN expression in so that it can be evaluated: ");
            String rpnExpr = keyboard.nextLine();

            boolean explain = false;
            System.out.print(
                    "Would you like me to explain how to expression is evaluated? (y or Y for yes, anything else means no) ");
            String szExplain = keyboard.nextLine().trim().toLowerCase();
            if (szExplain.length() == 1 && szExplain.charAt(0) == 'y') {
                System.out.println("We WILL explain the evaluation, step by step");
                explain = true;
            }

            Scanner scExpr = new Scanner(rpnExpr + "\n");
            while (scExpr.hasNext()) {
                if (explain) {
                    scExpr = printRemainingExpression(numbers, scExpr);
                }

                if (scExpr.hasNextDouble()) {
                    nextNumber = scExpr.nextDouble();
                    if (explain) {
                        System.out.println("\tPushing " + nextNumber + " onto the stack of operands (numbers)");
                    }
                    numbers.push(nextNumber);
                } else {
                    String operator = scExpr.next();
                    if (numbers.size() < 2) {
                        System.err.println(
                                "ERROR! Expected to find 2 operands (numbers) but we don't have enough numbers on the stack!");
                        System.out.println(
                                "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                        continue ShouldWeTryAgain;
                    }

                    double operand2 = numbers.pop();
                    double operand1 = numbers.pop();

                    switch (operator) {
                        case "+":
                            numbers.push(operand1 + operand2);
                            break;
                        case "-":
                            numbers.push(operand1 - operand2);
                            break;
                        case "*":
                            numbers.push(operand1 * operand2);
                            break;
                        case "/":
                            numbers.push(operand1 / operand2);
                            break;
                        default:
                            System.err.println("ERROR! Operator not recognized: " + operator);
                            System.out.println(
                                    "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                            continue ShouldWeTryAgain;
                    }

                    if (explain) {
                        System.out.println("\tPopping " + operand1 + " and " + operand2 + " then applying "
                                + operator + " to them, then pushing the result back onto the stack");
                    }
                }
            }

            if (numbers.size() != 1) {
                System.err.println("ERROR! Ran out of operators before we used up all the operands (numbers):");
                for (double operand : numbers) {
                    System.err.println("\t" + operand);
                }
            }

            System.out.println("END RESULT: " + numbers.peek());

            System.out.print(
                    "\nWould you like to evaluate another expression? (y or Y for yes, anything else to exit) ");
            String repeat = keyboard.nextLine().trim().toLowerCase();
            if (repeat.length() == 1 && repeat.charAt(0) == 'y')
                evalAgain = 'y';
            else
                evalAgain = 'n';
        }
        System.out.println("Thank you for using RPN Calculator!");
    }
}
