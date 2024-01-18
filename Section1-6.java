import java.util.*;
class Test {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter the array elements:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         Arrays.sort(arr);
         System.out.println("Enter target value from array:");
         int target=sc.nextInt();
         int low=0,high=arr.length-1;
         int ans=-1;
         while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         if(ans==-1){
            System.out.println("target not present in the given array");
         }
         else{
            System.out.println("target is at index: "+ans);
         }
    }
}
