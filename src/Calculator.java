import Calc.Calculate;

import java.util.Scanner;


public class Calculator {



            public static void main(String[] args) {
                Calculate cs = new Calculate();


                System.out.println("Functions avaliable: +, -, *, /, ^, sin, cos, tan, mod(%),(WIP)");



                Scanner sc = new Scanner(System.in);

            System.out.print("Please enter your first number: ");
            double a = sc.nextInt();

            System.out.print("Please enter your se-cond number: ");
            double b = sc.nextInt();

            // random error fix
            sc.nextLine();

            // initialize the result variable "c"
            double c = 0;

            System.out.print("Please enter your function: ");
            String func = sc.nextLine();

            switch (func) {
                // text function is add, subtract ...

                default:
                    System.out.println("The function you have entered has been misspelled or has not yet been implemented!");

                case "help":
                    System.out.println("Functions avaliable: +, -, *, /, ^, sin, cos, tan, mod(%),(WIP)");
                    break;
                case "add":
                    c = cs.add(a,b);
                    break;

                case "subtract":
                    c = cs.subtract(a,b);
                    break;

                case "multiply":
                    c = cs.multiply(a,b);
                    break;

                case "divide":
                    c = cs.divide(a,b);
                    break;

                // same as above except with symbols
                case "+":
                    c = cs.add(a,b);
                    break;

                case "-":
                    c = cs.subtract(a,b);
                    break;

                case "*":
                    c = cs.multiply(a,b);
                    break;

                case "/":
                    c = cs.divide(a,b);
                    break;

                case "sin":
                    System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
                    String sinChoice = sc.next();

                    if (sinChoice.equals("a")) {
                        a = Math.toRadians(a);
                        c = Math.sin(a);
                    }

                    if (sinChoice.equals("b")) {
                        b = Math.toRadians(b);
                        c = Math.sin(b);
                    }

                    break;

                case "cos":
                    System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
                    String cosChoice = sc.next();

                    if (cosChoice.equals("a")) {
                        a = Math.toRadians(a);
                        c = Math.cos(a);
                    }

                    if (cosChoice.equals("b")) {
                        b = Math.toRadians(b);
                        c = Math.cos(b);
                    }

                    break;

                case "tan":
                    System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
                    String tanChoice = sc.next();

                    if (tanChoice.equals("a")) {
                        a = Math.toRadians(a);
                        c = Math.tan(a);
                    }

                    if (tanChoice.equals("b")) {
                        b = Math.toRadians(b);
                        c = Math.tan(b);
                    }

                    break;

                case "sqrt":
                    System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
                    String sqrtChoice = sc.next();

                    if (sqrtChoice.equals("a")){
                        c = Math.sqrt(a);
                    }
                    if (sqrtChoice.equals("b")){
                        c = Math.sqrt(b);
                    }
                    break;

                case "^":
                    System.out.print("(a) "+ a + "^" + b + ", or (b) " + b + "^" + a + "? ");
                    String powerChoice = sc.next();
                    if (powerChoice.equals("a")){
                        c = Math.pow(a, b);
                    }
                    if (powerChoice.equals("b")){
                        c = Math.pow(b, a);


                    }
                    break;
                case "%":
                    System.out.print("(a) "+ a + "%" + b + ", or (b) " + b + "%" + a + "? ");
                    String modSymbolChoice = sc.next();
                    if (modSymbolChoice.equals("a")){
                        c = a % b;
                    }
                    if (modSymbolChoice.equals("b")){
                        c = b % a;
                    }
                    break;

                case "mod":
                    System.out.print("(a) "+ a + " mod " + b + ", or (b) " + b + " mod " + a + "? ");
                    String modChoice = sc.next();
                    if (modChoice.equals("a")){
                        c = a % b;
                    }
                    if (modChoice.equals("b")){
                        c = b % a;
                    }
                    break;

            }

            // TODO for more functions!
            System.out.println("Answer: " + c);

        }

    }

