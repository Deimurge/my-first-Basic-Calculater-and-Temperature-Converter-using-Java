import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner TempScanner = new Scanner(System.in);
        String loopString;
        do {
            System.out.println("Which Temperature would you like to calculate (C/F): ");
            String Temp = TempScanner.next().toUpperCase();
            switch (Temp) {
                case "C":
                    System.out.println("Kindly enter your temperature in celsius: ");
                    int Cel = TempScanner.nextInt();
                    int totalC = (int) (Cel * 9 / 5.0) + 32;
                    System.out.println("The answer is " + totalC + "°F");
                    break;
                case "F":
                    System.out.println("Kindly enter your temperature in fahrenheit: ");
                    int F = TempScanner.nextInt();
                    int totalF = (F - 32) * 5 / 9;
                    System.out.println("The answer is " + totalF + "°C");
                    break;
                default:
                    System.out.println("Invalid input. Please enter either 'C' or 'F'.");
                    break;
            }
            System.out.println("Do you want to continue? (y/n)");
            loopString = TempScanner.next().toLowerCase();
        } while (loopString.equals("y"));
        TempScanner.close();
    }
}