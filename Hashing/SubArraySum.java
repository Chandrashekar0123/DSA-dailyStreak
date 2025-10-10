import java.util.HashMap;

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);  // Prefix sum 0 occurs once
        int ans = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];  // Update current prefix sum

            // Check if there is a prefix with sum = sum - k
            if(map.containsKey(sum - k)){
                ans += map.get(sum - k);
            }

            // Store/update current prefix sum in map
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ans;
    }

    // For quick testing
    public static void main(String[] args) {
        SubArraySum obj = new SubArraySum();
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(obj.subarraySum(arr, k)); // Output should be 3
    }
}


/*
OUTPUT
3
 */