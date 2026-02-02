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
