import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int[] arr = new int[2 * n + 2];
        for(int i = 0; i < 2* n + 2;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> hash = new HashMap<>();
        for(int v : arr){
            hash.put(v,hash.getOrDefault(v,0)+1);
        }
        System.out.print("Result : ");
        for(int v : arr){
            if(hash.get(v) == 1) System.out.print(v+" ");
        }
        sc.close();
    }
}