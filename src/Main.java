public class Main {
    public static void main(String[] args) {
        Weapon bow = new Weapon(WeaponType.BOW, "Elven Bow");
        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 50, bow, 10);
        Skeleton skeleton2 = new Skeleton("Skeleton Sniper", 60, bow, 20);

        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}