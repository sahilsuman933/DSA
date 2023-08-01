package recursion.problems;

public class Subset {
    public static void Subset(String data, int N) {
        if (data.length() == N) {
            System.out.print(data + " ");
            return;
        }
        data += "1";
        Subset(data, N);
        data = data.substring(0, data.length() - 1);
        data += "0";
        Subset(data, N);
    }

    public static void main(String[] args) {
        Subset("", 3);
    }
}
