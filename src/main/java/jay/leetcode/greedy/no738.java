package jay.leetcode.greedy;

public class no738 {
    public int monotoneIncreasingDigits(int n) {
            String s = String.valueOf(n);
            char[] chars = s.toCharArray();
            int start = s.length();
            for (int i = s.length() - 2; i >= 0; i--) {
                if (chars[i] > chars[i + 1]) {
                    chars[i]--;
                    start = i+1;
                }
            }
            for (int i = start; i < s.length(); i++) {
                chars[i] = '9';
            }
            return Integer.parseInt(String.valueOf(chars));
    }

    public static void main(String[] args) {
        no738 no738 = new no738();
        System.out.println(no738.monotoneIncreasingDigits(332));
    }
}
