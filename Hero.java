public class Hero { 
  String name;
  String position;
  int health;
  int damage;
  int experience;

  public Hero() {
    this.name = "Hero";
    this.position = "00";
    this.health = 100;
    this.damage = 5;
    this.experience = 0;
  }

  public Hero(String name) {
    this();
    this.name = name;
  }
}