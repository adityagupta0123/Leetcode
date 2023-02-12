class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
	 Set<String> dict = new HashSet<>(wordDict);
    // important: we use a non-primitive because indices' values are initialized to null
    // this allows us to memoize optimal solutions for subproblems
    Boolean[] memo = new Boolean[s.length()];
    return helper(s, dict, 0, memo);
  }
  
  private boolean helper(String s, Set<String> dict, int start, Boolean[] memo) {
    if (start == s.length()) return true;
    if (memo[start] != null) return memo[start];
    boolean isValid = false;
    for (int i = start; i < s.length(); i++) {
      if (dict.contains(s.substring(start, i+1))) {
        if (helper(s, dict, i+1, memo)) {
          isValid = true;
          break;
        }
      }
    }
    memo[start] = isValid;
    return memo[start];
  }
}