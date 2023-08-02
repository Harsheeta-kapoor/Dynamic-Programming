/*The Climbing Stairs problem
This is one of the most popular coding problems which can be solved using the Dynamic Programming technique. In this problem, you are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. The question is, in how many distinct ways can you climb to the top?
Note: Given n will be a positive integer. 
Example :
        Input: 3
        Output: 3
    Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step.        */

/**
 * ClimbingStareProblem solved using memoization
 */
public class ClimbingStairsProblem {

    public static int ClimbStair(int n) {
        int[] dp = new int[n + 1];
        int output = rec(n, dp);
        return output;
    }

    public static int rec(int n, int[] dp) {
        if (n <= 1) return 1;
        if (dp[n] > 0) return dp[n];
        int a = rec(n - 1, dp);
        int b = rec(n - 2, dp);
        dp[n] = a + b;
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(ClimbStair(7));
    }
}
