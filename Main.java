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
        String model;
        int year;
        double mpg;
        System.out.println("Input the model");
        model = sc.nextLine();
        System.out.println("Input the year");
        year = sc.nextInt();
        System.out.println("Input the MPGr");
        mpg = sc.nextDouble();
        Car car = new Car(make, model, year, mpg);
        System.out.print(car.toString());
        // ask for model, year, miles per gallon
      }

      //System.out.println(Car.toString()); // print out the car object
    }
  }
}
