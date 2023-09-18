// Import libraries here
import java.util.Scanner;
// emmet spaeth
import java.util.concurrent.ThreadLocalRandom;


public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    

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
    double temperatureInFahrenheit = scan.nextDouble();

    double temperatureInCelsius = (temperatureInFahrenheit - 32) * ((double)5/(double)9);

    temperatureInCelsius = (double)Math.round(temperatureInCelsius * 100) / 100;


    System.out.println("Please enter a 5-character string:");
    String inputString = scan.next();
    String reversedString = "";

    inputString = inputString.substring(1, inputString.length() - 1);

    for(int i = inputString.length(); i > 0; i--) {
      reversedString += inputString.toCharArray()[i - 1];
    }



    int randomNum = ThreadLocalRandom.current().nextInt(32, 16384 + 1);

    System.out.println("Random number generated. Continuing...");
    System.out.println(temperatureInCelsius + reversedString + randomNum);
  }
}
