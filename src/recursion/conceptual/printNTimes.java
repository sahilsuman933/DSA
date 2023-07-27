package recursion.conceptual;

public class printNTimes {
    public static void printNtimes(int n) {
        if (n < 1) {
            return;
        }

        System.out.print("Coding Ninjas ");
        printNtimes(n - 1);
    }
}
