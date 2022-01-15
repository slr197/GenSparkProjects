public class Goblin {
    private int attack, health;

    public Goblin() {
        attack = 5;
        health = 100;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Goblins {" +
                "attack = " + attack +
                ", health = " + health +
                '}';
    }
}
