package recursion;

import java.util.ArrayList;

public class subsequence {

    private static void printAllSubsequence(int[] arr, int index, ArrayList<Integer> path) {
        if (index == arr.length && path.size()>=0) 
            System.out.println(path);
        else {
            // Main intuition is Take & Dont take

            printAllSubsequence(arr, index + 1, path);
            path.add(arr[index]);

            printAllSubsequence(arr, index + 1, path);
            path.remove(path.size() - 1);
        }return;
    }

    public static void printAllSubsequence(int[] a) {
        printAllSubsequence(a,0,new ArrayList<Integer>());
    }

    private static void subsequenceWithSum(
        int index, ArrayList<Integer> path, int curSum,int targetSum,int[] arr){
            if(index==arr.length){
                if(curSum==targetSum)System.out.println(path);
                return;
            }
            path.add(arr[index]);
            curSum+=arr[index];
            subsequenceWithSum(index+1,path,curSum,targetSum,arr);
            path.remove(path.size()-1);
            curSum-=arr[index];
            subsequenceWithSum(index+1,path,curSum,targetSum,arr);
        }

    public static void subsequenceWithSum(int[] arr, int target){
        subsequenceWithSum(0,new ArrayList<>(),0,target,arr);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        printAllSubsequence(arr);
        System.out.println();
        subsequenceWithSum(arr,4);
    }
}
