package recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    private static void combinationWithSum(
        int idx, int[] arr, List<List<Integer>> ans, int target,List<Integer> temp){
            if(idx==arr.length){
                if(target==0)
                    ans.add(new ArrayList<>(temp));
                return;
            }
            if(arr[idx]<=target){
                temp.add(arr[idx]);
                combinationWithSum(idx,arr,ans,target-arr[idx],temp);
                temp.remove(temp.size()-1);
            }
            combinationWithSum(idx+1,arr,ans,target,temp);
    }
    public static List<List<Integer>> combinationWithSum(int[] arr, int target){
        List<List<Integer>> ans=new ArrayList<>();
        combinationWithSum(0, arr, ans, target, new ArrayList<Integer>());
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        System.out.println(combinationWithSum(arr,7));
    }
}
