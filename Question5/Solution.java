import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int[] prices=new int[n];
        for(int i = 0;i < n;i++) prices[i] = sc.nextInt();
        System.out.println();
        System.out.print("Enter Money : ");
        int money = sc.nextInt();
        int l = 0,r=0,sum=0,maxLen = 0;
        while(r < n){
            sum += prices[r];
            if(sum > money) {
                sum -= prices[l];
                l++;
            }
            maxLen = Math.max(maxLen,(r - l + 1));
            r++;
        }
        System.out.println(maxLen);
        sc.close();
    }
}