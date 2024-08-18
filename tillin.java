public class tillin {
    public static int tillingproblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tillingproblem(n-1);
        int fnm2=tillingproblem(n-2);
        int totways=fnm1+fnm2;
        return totways;

   }
    public static void main(String[] args) {
        System.out.println(tillingproblem(3));
    }
}
