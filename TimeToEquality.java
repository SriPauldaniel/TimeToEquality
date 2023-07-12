
import java.util.Scanner;
public class TimeToEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSeconds(arr, n));
    }

    static int findSeconds(int[] arr,int n) {
        int max = Integer.MIN_VALUE,num = 0;
        for(int i=0;i<n;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++) {
            num += max-arr[i];
        }
        return num;
    }
}