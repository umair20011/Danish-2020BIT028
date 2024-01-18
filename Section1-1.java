import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s=sc.nextLine();
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        System.out.println("original string: "+s);
        System.out.println("reversed string: "+ans);
    }
}