// Import libraries here
import java.util.Scanner;
// emmet spaeth


public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    String inputString, reversedString = "";
    double temperatureInFahrenheit, temperatureInCelsius;
    final int RANDOM_NUMBER_RANGE = (16384 - 32);

    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("EEEEEEEE        SSSSSSS");
    System.out.println("EEEEEEEE      SSSSS    ");
    System.out.println("EEE           SSSSS    ");
    System.out.println("EEEEEEEE        SSSSS  ");
    System.out.println("EEE               SSSSS");
    System.out.println("EEEEEEEE          SSSSS");
    System.out.println("EEEEEEEE      SSSSSSS  ");
    System.out.println();


    System.out.println("Please enter a number in Fahrenheit:");
    temperatureInFahrenheit = scan.nextDouble();

    temperatureInCelsius = (temperatureInFahrenheit - 32) * ((double)5/(double)9);

    //rounding to two decimal places
    temperatureInCelsius = (double)Math.round(temperatureInCelsius * 100) / 100;


  
    System.out.println("Please enter a 5-character string:");
    inputString = scan.next();

    inputString = inputString.substring(1, inputString.length() - 1);

    for(int i = inputString.length(); i > 0; i--) {
      reversedString += inputString.toCharArray()[i - 1];
    }



    int randomNum = (int)(Math.random() * RANDOM_NUMBER_RANGE) + 32;

    System.out.println("Random number generated. Continuing...");
    System.out.println(temperatureInCelsius + reversedString + randomNum);

    scan.close();
  }
}
