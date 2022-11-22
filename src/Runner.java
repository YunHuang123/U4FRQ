public class Runner {
    public static void main(String[] args) {

        FRQSolutions frq = new FRQSolutions();
        frq.printNums(7, 6);

        System.out.println();
        System.out.println(frq.longestStreak("CCAAAAATTT!"));
        System.out.println(frq.longestStreak("CCCCAAATTT!"));
    }


}
