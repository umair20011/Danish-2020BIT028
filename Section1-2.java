import java.util.*;
class Test{
    public static ArrayList<Integer> solve(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter length of array:");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.err.println("Enter array elements:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        ArrayList<Integer> list=new ArrayList<>();
        list=solve(arr);
        System.err.print("list of even elements from array: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.err.println();
    }
}
