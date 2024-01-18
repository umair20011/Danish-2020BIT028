import java.util.*;
public class Section1_9 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String s=arr[0];
        String ans="";
        int a=0;
        for(int i=1;i<arr.length;i++){
            String z="";
            int p=0;
            while(p<s.length()&&p<arr[i].length()&&s.charAt(p)==arr[i].charAt(p)){
                p++;
            }
            z=s.substring(0,p);
            if(a==0){
                //z=s.substring(0, p+1);
                ans=z;
                a=1;
            }
            else{
                if(z.length()<ans.length()){
                    ans=z;
                }
            }
        }
        System.out.println(ans);
    }
}
