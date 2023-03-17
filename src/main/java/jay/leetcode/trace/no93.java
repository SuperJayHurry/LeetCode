package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.List;

public class no93 {
    List<String> target = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    public List<String> restoreIpAddresses(String s) {
        trace(s,0,0);
        return target;
    }

    public void trace(String s,int start,int pointNum){
        if(start==s.length() && pointNum==3 && path.lastIndexOf(".")!=path.length()-1){
            target.add(path.toString());
            return;
        }

        for(int i = start; i < s.length() && i - start < 3 && Integer.parseInt(s.substring(start, i + 1)) >= 0
                && Integer.parseInt(s.substring(start, i + 1)) <= 255; i++){
            if(i > start && s.charAt(start)=='0')
                return;
            path.append(s.substring(start,i+1));
            if(pointNum<3)
                path.append(".");
            if(pointNum<3)
                trace(s,i+1,pointNum+1);
            if(i==s.length()-1 && pointNum==3)
                target.add(path.toString());
            path.delete(start+pointNum,i+pointNum+3);
        }
    }

    public static void main(String[] args) {
        String s = "101023";
        no93 no93 = new no93();
        no93.restoreIpAddresses(s);
    }
}
