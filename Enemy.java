public class Enemy {
    String type;
    int health;
    int strength;
    int stamina;

     Enemy(String type, int health, int strength, int stamina) {
        this.type = type;
        this.health = health;
        this.strength = strength;
        this.stamina = stamina;
    }
    
      void attack() {
    }

    void defend() {
    }
    
     String identity() {
        return "I am an Enemy class. I represent opponents in the game.";
    }
}





