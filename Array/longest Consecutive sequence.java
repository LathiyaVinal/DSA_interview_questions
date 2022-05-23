class Solution {
    public int longestConsecutive(int[] nums) {
        
      int n = nums.length;
      if(n == 0){
        return n;
      }
      
      HashSet<Integer> hashmap = new HashSet<>();
      for(int i = 0 ; i < n ; i++){
        hashmap.add(nums[i]);
      }
      
      int ans = 1;
      int count = 1;
      
      for(int i = 0 ; i < n ; i++){
        if(!hashmap.contains(nums[i] - 1)){
          int temp = nums[i];
          count =1;
          
          while(hashmap.contains(temp+1)){
            count++;
            temp = temp + 1;
          }
          
          ans = Math.max(ans, count);
        }
      }
      
      return ans;
    }
}