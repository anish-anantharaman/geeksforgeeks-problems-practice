import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();

        int res = searchElement(a, num);
        System.out.println(res);
    }

    private static int searchElement(int[] a, int num) {
        for(int i = 0; i < a.length; ++i) {
            if(a[i] == num) {
                return i;
            }
        }
        return -1;
    }
}