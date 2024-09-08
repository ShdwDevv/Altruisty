import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] dict = new String[n];
        for(int i = 0;i < n;i++) dict[i] = sc.nextLine();
        System.out.print("Enter S : ");
        String s = sc.nextLine();
        int length = s.length();
        int idx = 0;
        while(idx < length){
            boolean found = false;
            for(String word : dict){
                if(s.startsWith(word,idx)){
                    found = true;
                    idx += (word.length());
                }
            }
            if(!found) break;
        }
        if(idx == length) System.out.println(1);
        else System.out.println(0);
        sc.close();
    }
}