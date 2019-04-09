package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> palindromes = new HashSet<>();
        for(int i = 0 ; i < string.length(); i++){
            for(int j = i +1; j <= string.length(); j++){
                if(isPalindrome(string.substring(i,j))) {
                    palindromes.add(string.substring(i, j));
                }
            }
        }
        int length = palindromes.size();
        String arr[] = new String[length];
        int i = 0;
        for(String pal : palindromes)
            arr[i++] = pal;
        return arr;
    }

    public static Boolean isPalindrome(String string) {
        String reversed = reverseString(string);
        if(string.equals(reversed)){
            return true;
        }

        return false;
    }

    public static String reverseString(String string) {
        char[] toChar = string.toCharArray();
        String reversed = "";
        for(int i = toChar.length-1; i>= 0; i--){
            reversed += Character.toString(toChar[i]);
        }
        return reversed;
    }
}

