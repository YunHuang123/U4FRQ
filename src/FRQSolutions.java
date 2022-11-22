public class FRQSolutions {

    public FRQSolutions () {}

    public void printNums(int value, int numRounds) {
        for (int i = 0; i < numRounds; i ++) {
            int random = 0;
            while (random != value) {
                random = (int)(Math.random() * 10);
                System.out.print(random);
            }
            System.out.println();
        }
    }

    public String longestStreak(String str) {
        String current = "";
        int count = 1;
        int longest = 0;

        for (int i = 0; i < str.length() - 1; i ++) {
            String character = str.substring(i, i + 1);
            String next = str.substring(i + 1, i + 2);
            if (next.equals(character)) {
                count ++;
                if (count > longest) {
                    longest = count;
                    current = character;
                }
            }
            else {
                count = 1;
            }
        }
        return current + longest;
    }



}
