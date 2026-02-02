public class Level {
    String levelName;
    int difficulty;
    Enemy enemy;   // Aggregation

    Level(String levelName, int difficulty, Enemy enemy) {
        this.levelName = levelName;
        this.difficulty = difficulty;
        this.enemy = enemy;
    }

    void startLevel() {
    }

    void endLevel() {
    }

