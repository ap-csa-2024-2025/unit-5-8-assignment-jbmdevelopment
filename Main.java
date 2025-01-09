import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    while (!input.equals("q"))
    {
      System.out.println("Input the make of the car, \"default\" to create a default car or \"q\" to quit:");
      input = sc.nextLine();
      if (input.equals("default"))
      {
        Car car = new Car();
        // create default car
      }
      else
      {
        String make = input;
        String name;
        int year;
        double mpg;
        a
        // ask for model, year, miles per gallon
      }

      System.out.println(); // print out the car object
    }
  }
}
