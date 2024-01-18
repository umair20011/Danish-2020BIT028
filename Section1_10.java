import java.util.*;
public class Section1_10 {
    ;public static int solve(int n){
        if(n==0){
            return 1;
        }
        return n*solve(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value to find factorial:");
        int n=sc.nextInt();
        int ans=solve(n);
        System.out.println("factorial of entered number is:"+ans);
    }
}
