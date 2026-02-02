public class Player {
    String name;
    int health;
    int stamina;
    String skill;
    Weapon weapon;   // Composition

    Player(String name, int health, int stamina, String skill, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.skill = skill;
        this.weapon = weapon;
    }
 void attack() {
    }

    void sprint() {
    }

    void useSkill() {
    }

    String identity() {
        return "I am the Player class. I represent the main character.";
    }
}
