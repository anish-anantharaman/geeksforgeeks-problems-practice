import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class ArraySubset {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int a[] = new int[n1];

        for(int i = 0 ; i < n1; ++i) {
            a[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] b = new int[n2];

        for(int i = 0; i < n2; ++i) {
            b[i] = scanner.nextInt();
        }

        System.out.println(isSubset(a, b));
    }

    private static boolean isSubset(int[] a, int[] b) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < a.length; ++i) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for(int i = 0; i < b.length; ++i) {
            if(!map.containsKey(b[i]) || map.get(b[i]) == 0) {
                return false;
            } else {
                map.put(b[i], map.get(b[i]) - 1);
            }
        }
        return true;
    }
}