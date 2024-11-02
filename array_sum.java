import java.util.*;
public class array_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int odd = 0;
            int even = 0;
            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    even += arr[i];
                }else{
                    odd += arr[i];
                }
                sum += arr[i];
            }
            if(sum%2 == 0 || sum==1){
                System.out.println("YES");
            }else{
                if(odd%2 == 0 || even%2 == 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}