import java.util.*;
public class Section1_8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            else if(s.charAt(i)>=65&&s.charAt(i)<=90){
                temp=temp+s.charAt(i);
            }
            
        }
        // char c=(char)(90);
        // System.out.println(c);
    }
}
