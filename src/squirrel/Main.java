package squirrel;

import squirrel.Squirrel.*;

public class Main {

  public static void main(String[] args) {

    Squirrel s1, s2, s3;
    s1 = new Squirrel(3, 0, "Alvin", "purple");
    s2 = new Squirrel(7, 2, "George", "brown");
    s3 = new Squirrel(5, 1, "Melany", "rainbow");

    // call methods
    s1.jump(3);
    s2.superhero();
    s3.superhero();
    s2.dead();
    s1.dead();

  }

}