package easy;

public class StepsCounter {
    public static void main(String[] args) {
        int n =3;

        //output = 1+1+1; 2+1; 1+2;

        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=2;

        for(int i=2; i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println("Total Steps required is: " + dp[n]);
        System.out.println("Total Combination of Steps required is: " + dp[n-1]);

    }
}
