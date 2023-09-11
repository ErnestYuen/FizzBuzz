public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int numDivis = 0;

        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy5) {
                numDivis++;
            }
            if (divisibleBy3) {
                numDivis++;
            }
            i++;
        }
        System.out.println(numDivis);

    }
}
