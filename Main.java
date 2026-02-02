public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("Sword", 25, 100, "Rare");

        Player player = new Player("Hero", 100, 50, "Fire Slash", weapon);

        Enemy enemy = new Enemy("Goblin", 60, 15, 30);
