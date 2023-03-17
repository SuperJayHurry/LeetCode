package jay.leetcode.Hash;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class no383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        for(int i=0;i<magazine.length();++i){
            ++record[Integer.valueOf(magazine.charAt(i))-97];
        }
        for(int i=0;i<ransomNote.length();++i) {
            --record[Integer.valueOf(ransomNote.charAt(i)) - 97];
        }
        for(int i : record){
            if(i<0){
                return false;
            }
        }
        return true;
    }
}

