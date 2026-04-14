import java.util.*;

public class ArrayMinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        List<Integer> res = getMinMax(a);
        System.out.println(res);
    }

    public static List<Integer> getMinMax(int[] a) {

        int min = a[0];
        int max = a[0];

        for(int i = 0; i < a.length; ++i) {

            if(a[i] < min) {
                min = a[i];
            }

            if(a[i] > max) {
                max = a[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        return list;
    }
}