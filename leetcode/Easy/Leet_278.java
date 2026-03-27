// 278. First Bad Version
package Leetcode.Easy;

public class Leet_278 {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public boolean isBadVersion(int version) {
        return true;
    }

    public static void main(String[] args) {
        Leet_278 obj = new Leet_278();
        int n = 5;
        System.out.println(obj.firstBadVersion(n));
    }
}
