public class Car
{
  private String make;
  private String model;
  private int year;
  private double MPG; 
  private static int ID;
  public Car(String make, String model, int year, double mpg) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.MPG = mpg;
    ID++;
  }
  public Car() {
    this("None", "None", 2000, 0);
  }
  public String toString() {
    String formatted = "ID: " + ID + "\n Make: " + this.make + "\n Model " + 
    this.model + "\n Year: " + this.year + "\n MPG: " + this.mpg;
    return formatted;
  }
}
