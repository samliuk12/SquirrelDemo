package squirrel;

class Squirrel {

  int intAge;
  int intKids;
  String strName;
  String strColour;

  public Squirrel(int newAge, int newKids, String newName, String newColour) {

    this.intAge = newAge;
    this.intKids = newKids;
    this.strName = newName;
    this.strColour = newColour;

  }

  public void jump(int intHeight) {
    System.out.println(this.strName + " jumps to a height of " + intHeight + " metres!");
  }

  public void superhero() {
    System.out.println(this.strName + " performs a superhero landing!");
  }

  public void dead() {
    System.out.println(this.strName + " is pretending to be dead for no reason!");
  }

}