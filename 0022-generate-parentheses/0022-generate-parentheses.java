class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        combinations (ans, "", n, n);
        return ans;
    }
    public void combinations (List<String> ans, String comb, int ob, int cb) {
        if (ob==0 && cb==0) {
            ans.add(comb);
        }
        if (ob>0) {
            combinations (ans, comb+"(", ob-1, cb);
        }
        if (cb>ob) {
            combinations (ans, comb+")", ob, cb-1);
        }
    }
}