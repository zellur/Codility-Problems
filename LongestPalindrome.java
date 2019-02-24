/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toptal;

/**
 *
 * @author rakib
 */
public class LongestPalindrome {
     static int EVEN = 1;
    static int ODD = 2;
    
    public static String longestPalindrome(String s){

    int size = s.length();
        int max = size - 2;
        String longestPalindrome = "";
        
        if(size == 1) {
            return s;
        } else if(size == 2) {
            if(s.charAt(0) == s.charAt(1)){
                return s;
            } else {
                return "";
            }
        }
        
        for(int i = 0; i < max; i++){
            String tmp = new String();
            if(s.charAt(i) == s.charAt(i+1)){
                tmp = getPalindrome(s, i, EVEN);
            }
            
            if (s.charAt(i+1) == s.charAt(i+2)) {
                String tmp1 = getPalindrome(s, i+1, EVEN);
                if(tmp1.length() >= tmp.length()) {
                    tmp = tmp1;
                }
            }

            if (s.charAt(i) == s.charAt(i+2)) {
                String tmp1 = getPalindrome(s, i+1, ODD);
                if(tmp1.length() >= tmp.length()) {
                    tmp = tmp1;
                }
            }

            if (tmp.length() >= longestPalindrome.length()){
                longestPalindrome = new String(tmp);
            }
        }
        
        return longestPalindrome;

  }

  public static String getPalindrome(String s, int center, int type){
    int c1 = 0;
    int c2 = 0;
    int size = s.length();
    if(type == EVEN) {
            c1 = center;
            c2 = center + 1;
        } else {
            c1 = center - 1;
            c2 = center + 1;
        }
        while(c1 >= 0 && c2 < size && s.charAt(c1) == s.charAt(c2)) {
            c1--;
            c2++;
        }
        
        String substring = new String(s.substring(++c1, c2));
        
        return substring;
  }
  
  
  
  public static String getLongestPalindromeAlternate(String s){
        String longPalindrome = "";
      if(s.length() <= 1) return s;
      for(int i = 0; i<s.length(); i++){
         for(int j = s.length(); j>i; j--){
          String temp = s.substring(i,j);
          if(isPalindrome(temp)){
            if(temp.length() >= longPalindrome.length()) longPalindrome = temp;
          }
          
         }
         
      }
      return longPalindrome;
  }
  
  
  public static boolean isPalindrome(String s){
      char temp[] = s.toCharArray();
      int j= 0;
      for(int i = s.length()-1; i >= 0; i--){
          if(s.charAt(i) != temp[j]) return false;
          j++;
      }
      
      return true;
  }
  
  
    
}
