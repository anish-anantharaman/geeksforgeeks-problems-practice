import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(findSum(n));
    }

    private static int findSum(int n) {
        return (n * (n+1))/2;
    }
}