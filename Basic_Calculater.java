import java.util.Scanner;

class Basic_Calculater {
    public static void main(String[] args) {
        char expes;
        @SuppressWarnings("resource")
        Scanner numScanner = new Scanner(System.in);//
        @SuppressWarnings("resource")
        Scanner comfirmScanner = new Scanner(System.in);
        String loopString = "y";

        while (loopString.equals("y")) {
            System.out.println("Hello User");
            System.out.println("Welcome to Basic Java Calculater");
            System.out.println("Please enter your first number: ");
            Double num1 = numScanner.nextDouble();
            if (num1 > 2000000 || num1 < -2000000) {
                System.out.println("Error: Number entered should be between -2000 and 2000000.");
                continue;
            }
            System.out.println("Please enter your second number: ");
            Double num2 = numScanner.nextDouble();
            if (num2 > 2000000 || num2 < -2000) {
                System.out.println("Error: Number entered should be between -2000 and 2000000.");
                continue;
            }

            try {
                if (num2 == 0) {
                    throw new ArithmeticException("Error: Division by 0 is not allowed.");

                }
                System.out.println("Please pick one for the following operatorss: / , * , + , -");
                expes = numScanner.next().charAt(0);//This was made by Liam Lloyd

                switch (expes) {
                    case '/':
                        System.out.println("Your answer is ");
                        System.out.println(num1 / num2);

                        break;
                    case '+':
                        System.out.println("Your answer is ");
                        System.out.println(num1 + num2);
                        break;
                    case '-':
                        System.out.println("Your answer is ");
                        System.out.println(num1 - num2);
                        break;
                    case '*':
                        System.out.println("Your answer is ");
                        System.out.println(num1 * num2);
                        break;
                    default:
                        System.out.println("Error: Please enter the correct operators");//pront the user to enter a correct operators
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());//displays an error message to console

            }

            System.out.println("Would you like to continue: y/n ");//asks the user if they would like to continue to use the calculater
            loopString = comfirmScanner.nextLine();
        }
    }
}


//This was made by Liam Lloyd