package recursion.problems;

public class validParenthesis {
    public static void Subset(String data, int N, int open, int close) {
        if (open == N && close == N) {
            System.out.print(data + " ");
            return;
        }

        if (open >= close && open < N) {
            data += "(";
            Subset(data, N, open + 1, close);
            data = data.substring(data.length() - 1);
            data = ")";
            Subset(data, N, open, close + 1);
        } else {
            data += ")";
            Subset(data, N, open, close + 1);
            data = data.substring(data.length() - 1);
            data = "(";
            Subset(data, N, open + 1, close);
        }


    }

    public static void main(String[] args) {
        Subset("", 2, 0, 0);
    }
}
