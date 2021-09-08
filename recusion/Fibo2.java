package recusion;

public class Fibo2 {
   
    static int[] F = new int[1000];
    
    public static int Fibo(int n){
        if(F[n] != 0)
            return F[n];
        System.out.println("Can tinh F["+n+"]");
        if(n <= 2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        int Fn = Fibo(n -1) + Fibo(n -2);
        return Fn;
    }


    public static void main(String[] args) {
        Fibo(200);
    }
}