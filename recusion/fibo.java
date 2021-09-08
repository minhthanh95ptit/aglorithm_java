package recusion;

public class fibo {
        public static int Fibo(int n){
            // Bai toan co so
            if(n == 1 || n == 2)
                return 1;
            // Cong thuc quy nap
            return Fibo(n - 1) + Fibo(n - 2);
        }
        public static void main(String[] args) {
            System.out.println(Fibo(10));
        }   
}
