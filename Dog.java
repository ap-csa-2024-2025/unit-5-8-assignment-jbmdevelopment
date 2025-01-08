public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;
  // Non-default Dog constructor
  public Dog(String n) {
    this.name = n;
    numDogs++;
    this.ID = numDogs;
  }
  // Default Dog constructor

  // Setters - instance variables only
  public void setName(String n) {
    name = n;
  }
  public void setID(int id) {
    ID = id;
  }
  // Getters - instance variables only
  public int getID() {
    return ID;
  }
  public String getName() {
    return name;
  }
  // method getNumDogs
}
