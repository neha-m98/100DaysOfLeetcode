class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        Set<String> dict = new HashSet<>(wordDict);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        List<String> result = new ArrayList<>();
        if (dp[n]) {
            dfs(s, dict, n, new ArrayList<>(), result);
        }
        return result;
    }
    
    private void dfs(String s, Set<String> dict, int end, List<String> path, List<String> result) {
        if (end == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = path.size() - 1; i >= 0; i--) {
                sb.append(path.get(i));
                if (i > 0) {
                    sb.append(" ");
                }
            }
            result.add(sb.toString());
            return;
        }
        for (int i = end - 1; i >= 0; i--) {
            String word = s.substring(i, end);
            if (dict.contains(word)) {
                path.add(word);
                dfs(s, dict, i, path, result);
                path.remove(path.size() - 1);
            }
        }
    }
}
