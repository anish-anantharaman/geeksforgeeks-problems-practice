import java.util.Scanner;

class LargestInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        int largest = solveLargestElement(a);
        System.out.println(largest);
    }

    private static int solveLargestElement(int[] a) {
        int largest = a[0];

        for(int i = 1; i < a.length; ++i) {
            if(a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }
}