public class fittiles {
    public static int tilingproblem (int n) {
        if (n==0 ||n==1) {
            return 1;
        }
        int fnm1 = tilingproblem(n-1);
        int fnm2 = tilingproblem(n-2);
        int total = fnm1+fnm2;
        return total;
    }
    public static void main (String args[]) {
        System.out.println(tilingproblem(3));
    } 
}