package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    private static void combinationWithSum2(
        int[] arr, int idx,int target, List<List<Integer>> ans, List<Integer> temp){
            if(target==0){ans.add(new ArrayList<>(temp));return;}
            for(int i=idx;i<arr.length;i++){
                if(i>idx && arr[i]==arr[i-1])continue;
                if(arr[i]>target)break;

                temp.add(arr[i]);
                combinationWithSum2(arr,i+1,target-arr[i],ans,temp);
                temp.remove(temp.size()-1);
            }
    }

    public static List<List<Integer>> combinationWithSum2(int[] arr, int target){
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        combinationWithSum2(arr,0,target,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        System.out.println(
            combinationWithSum2(arr,8)
        );
    }
}
