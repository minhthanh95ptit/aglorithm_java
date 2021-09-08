package recusion;

public class giaithua {
    public static int GiaiThua(int n){
        // Bai toan co so
        if(n == 0)
            return 1;
        // Cong thuc quy nap
        return n * GiaiThua(n-1);
    }
    public static void main(String[] args) {
        System.out.println(GiaiThua(1));
        System.out.println(GiaiThua(2));
        System.out.println(GiaiThua(3));
        System.out.println(GiaiThua(4));
        System.out.println(GiaiThua(5));
        System.out.println(GiaiThua(6));
    }
    
}
