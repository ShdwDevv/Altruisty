import java.util.*;
public class Solution{
    public static boolean isStep(int num){
        if(num < 10) return true;
        int prev = -1;
        while(num > 0){
            int d = num % 10;
            if(prev != -1 && Math.abs(prev - d) != 1) return false;
            num = num / 10;
            prev = d;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter M : ");
        int m = sc.nextInt();
        for(int val = n;val <= m;val++){
            if(isStep(val))System.out.print(val+" ");
        }
        sc.close();
    }
}