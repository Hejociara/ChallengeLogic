public class ChallengeLogic {
    /**
     * @author : Hejociara
     */
    public static void main(String[] args) {
        boolean job1 = true;
        boolean job2 = false;

        boolean boughtTv50 = job1 && job2;
        boolean boughtTv32 = job1 || job2;
        boolean boughtIceCream = job1 || job2;

        System.out.println("Bought 50 inch television? " + boughtTv50);
        System.out.println("Bought 32 inch television? " + boughtTv32);
        System.out.println("Bought Ice cream? " + boughtIceCream);
        System.out.println("It's healthy? " + !boughtIceCream);

    }
}
