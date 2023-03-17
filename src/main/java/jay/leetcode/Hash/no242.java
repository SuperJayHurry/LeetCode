package jay.leetcode.Hash;

import java.util.HashMap;
import java.util.Set;

public class no242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Object, Object> map = new HashMap<>();
        int[] record = new int[26];
        for(int i=0;i<s.length();++i){
            ++record[Integer.valueOf(s.charAt(i))-97];
        }
        for(int i=0;i<t.length();++i){
            --record[Integer.valueOf(t.charAt(i))-97];
        }
        for(int i: record){
            if(i != 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abc","abc"));
    }
}
