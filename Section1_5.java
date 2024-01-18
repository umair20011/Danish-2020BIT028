import java.util.*;
class Section1_5{
    public static ArrayList<ArrayList<Integer>> solve(int arr[],int target){
         Arrays.sort(arr);
         int low=0,high=arr.length-1;
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         while(low<high){
            if(arr[low]+arr[high]==target){
                 ArrayList<Integer> list=new ArrayList<>();
                 list.add(arr[low]);
                 list.add(arr[high]);
                 ans.add(list);
                 low++;high--;
            }
            else if(arr[low]+arr[high]>target){
                high--;
            }
            else{
                low++;
            }
         }
         return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter the array elements:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.out.println("Enter target value from array:");
         int target=sc.nextInt();
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         ans=solve(arr,target);
         System.out.println("All pairs sum up to target:");
         for(int i=0;i<ans.size();i++){
            System.out.println("("+ans.get(i).get(0)+","+ans.get(i).get(1)+")");
         }
    }
}
