public class Human {

    private int defense, health, attack;

    public Human() {
        defense = 10;
        health = 100;
        attack = 8;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Human {" +
                "attack =" + attack +
                ", health =" + health +
                '}';
    }
}
