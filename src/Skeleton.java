public class Skeleton {
    public Skeleton(String skeletonArcher, int i, Weapon bow, int i1) {
    }

    public void printInfo() {
    }

    class skeleton extends Boss {
        private int arrowCount;

        public skeleton(String name, int health, Weapon weapon, int arrowCount) {
            super(name, health, weapon);
            this.arrowCount = arrowCount;
        }

        public int getArrowCount() {
            return arrowCount;
        }

        public void setArrowCount(int arrowCount) {
            this.arrowCount = arrowCount;
        }
        
        public void printInfo() {
            super.printInfo();
            System.out.println("Arrow Count: " + arrowCount);
        }
    }
}
