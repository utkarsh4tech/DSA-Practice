package recursion;

public class basics{
    
    public static void print1toN(int N){
        if(N==1){
            System.out.println(N);
            return;
        }else {
            print1toN(N-1);
            System.out.println(N);
        }
    }

    public static void printNto1(int N){
        if(N==1){
            System.out.println(N);
        }else {
            System.out.println(N);
            printNto1(N-1);
        }
    }

    public static int sum(int N){
        if(N==1)return 1;
        return N+sum(N-1);
    }

    public static int factorial(int N){
        if(N==1)return 1;
        return N*factorial(N-1);
    }

    public static void main(String[] args) {
        print1toN(6);
        System.out.println();
        printNto1(6);
        System.out.println();
        System.out.println(sum(6));
        System.out.println();
        System.out.println(factorial(5));
    }
}