public class Boss {
    public Boss(String name, int health, Weapon weapon) {
    }

    protected void printInfo() {
    }

    class boss extends GameEntity {
    private Weapon weapon;

    public boss(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("boss: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}
}
