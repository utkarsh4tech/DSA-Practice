package recursion;

import java.util.Arrays;

class reversal {
    
    private static void revArr(int[] arr, int start, int end){
        if(start>=end)return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        revArr(arr, start+1, end-1);
    }

    public static void revArr(int[] arr){
        revArr(arr,0,arr.length-1);
    }

    private static boolean isPalindrome(String s, int start){
        if(start>=s.length()/2 || s=="")return true;
        if(s.charAt(start)!=s.charAt(s.length()-start-1))return false;
        else return isPalindrome(s,start+1);
    }

    public static boolean isPalindrome(String s){
        return isPalindrome(s,0);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(a));
        revArr(a);
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(isPalindrome("ssdss"));
    }

}
