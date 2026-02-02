public class Weapon {
    String weaponName;
    int damage;
    int durability;
    String rarity;
 
Weapon(String weaponName, int damage, int durability, String rarity) {
        this.weaponName = weaponName;
        this.damage = 
        damage;
        this.durability = durability;
        this.rarity = rarity;
    }
        void useWeapon() {
    }

    String identity() {
        return "I am the Weapon class. I define what the player uses to fight.";
    }
}


