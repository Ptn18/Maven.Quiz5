package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> listSub = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i +1; j <= string.length(); j++){
                String sub = string.substring(i,j);
                listSub.add(sub);
            }
        }
        String[] allSub = new String[listSub.size()];

        return listSub.toArray(allSub);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] string1Arr = getAllSubstrings(string1);
        String[] string2Arr = getAllSubstrings(string2);
        List<String> stringCommon = new ArrayList<>();
        for(int i = 0; i < string1Arr.length; i++){
            for(int j = 0 ; j< string2Arr.length; j++){
                if(string1Arr[i].equals(string2Arr[j])){
                    stringCommon.add(string1Arr[i]);
                }
            }
        }
        String[] common = new String[stringCommon.size()];
        return stringCommon.toArray(common);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] common = getCommonSubstrings(string1,string2);
        String largestComSub = common[0];
        for(int i = 0; i < common.length-1; i++){
            if(common[i].length()> common[i +1].length())

                largestComSub = common[i];
            }
        return largestComSub;
    }
}
