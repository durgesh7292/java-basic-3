public class xpowernnn {
    public static int optimizepower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpowersq=optimizepower(a, n/2)*optimizepower(a, n/2);
        if(n%2!=0){
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(optimizepower(a, n));
    }
}
