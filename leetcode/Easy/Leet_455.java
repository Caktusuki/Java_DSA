package Leetcode.Easy;

public class Leet_455 {
    public static void main(String[] args) {
        Leet_455 leet = new Leet_455();
        int[] g = {1,2,3};
        int[] s = {1,1};
        int result = leet.findContentChildren(g, s);
        System.out.println(result);
    }

    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
