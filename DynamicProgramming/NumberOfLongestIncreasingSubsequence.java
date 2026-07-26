package DynamicProgramming;

public class NumberOfLongestIncreasingSubsequence {
    public void main(String[] args) {
        int[] nums={1,3,5,4,7};
        System.out.println(findNumberOfLIS(nums));
    }
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            count[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[i] < dp[j] + 1) {
                    dp[i] = 1 + dp[j];
                    count[i] = count[j];
                } else if (nums[j] < nums[i] && dp[i] == dp[j] + 1) {
                    count[i] = count[i] + count[j];
                }
            }
            max = Math.max(max, dp[i]);
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) {
                cnt += count[i];
            }
        }
        return cnt;
    }
}
