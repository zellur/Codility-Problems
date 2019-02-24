package toptal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
public class StringCf {
    
    public static String solution(String s1, String s2) {
        if (s1.equals(s2)) {
          return "SAME";
        }
        String result = checkIfInsertionMakesStringsEqual(s1, s2);
        if (result != null) { 
            return "INSERT " + result;
        }
        result = checkIfDeletionMakesStringsEqual(s1, s2);
        if (result != null) {
            return "DELETE " + result;
        }
        result = checkIfSwappingMakesStringsEqual(s1, s2);
        if (result != null) {
            return "SWAP " + result;
        }
        return "IMPOSSIBLE";
    }

    private static String checkIfInsertionMakesStringsEqual(final String s1, final String s2) {
        if (s1.length() + 1 != s2.length()) {
            return null;
        }
        final char[] s1AsCharArr = s1.toCharArray();
          final char[] s2AsCharArr = s2.toCharArray();

        for (int s2CharIndex = 0; s2CharIndex < s2AsCharArr.length; s2CharIndex++) {
            if (s2CharIndex == s2AsCharArr.length-1) { //deal with corner case, at last char in s2
                final String s1WithCharInserted = s1 + s2AsCharArr[s2CharIndex];
                if (s1WithCharInserted.equals(s2)) {
                  return String.valueOf(s2AsCharArr[s2CharIndex]);
                } else {
                  return null;
                }
            }
            if (s1AsCharArr[s2CharIndex] != s2AsCharArr[s2CharIndex]) {
                final String s1WithCharInserted = 
                    s1.substring(0, s2CharIndex) + s2AsCharArr[s2CharIndex] + s1.substring(s2CharIndex, s1AsCharArr.length);
                if (s1WithCharInserted.equals(s2)) {
                  return String.valueOf(s2AsCharArr[s2CharIndex]);
                } else {
                  return null;
                }
            } else {
             
            }
        }

        return null;
    }

  private static String checkIfDeletionMakesStringsEqual(final String s1, final String s2) {
        if (s1.length() - 1 != s2.length()) {
            return null;
        }
        final char[] s1AsCharArr = s1.toCharArray();
          final char[] s2AsCharArr = s2.toCharArray();

        for (int s1CharIndex = 0; s1CharIndex < s1AsCharArr.length; s1CharIndex++) {
            if (s1CharIndex == s1AsCharArr.length-1) { //deal with corner case, at last char in s1
                final String s1WithCharDeleted = s1.substring(0, s1AsCharArr.length-1);
                if (s1WithCharDeleted.equals(s2)) {
                  return String.valueOf(s1AsCharArr[s1CharIndex]);
                } else {
                  return null;
                }
            }
            if (s1AsCharArr[s1CharIndex] != s2AsCharArr[s1CharIndex]) {
                final String s1WithCharDeleted = 
                    s1.substring(0, s1CharIndex) + s1.substring(s1CharIndex+1, s1AsCharArr.length);
                if (s1WithCharDeleted.equals(s2)) {
                  return String.valueOf(s1AsCharArr[s1CharIndex]);
                } else {
                  return null;
                }
            } else {
            }
        }

        return null;
    }

    private static String checkIfSwappingMakesStringsEqual(final String s1, final String s2) {
        if (s1.length() != s2.length()) {
            return null;
        }
        final char[] s1AsCharArr = s1.toCharArray();
        for (int s1CharIndex = 0; s1CharIndex < s1AsCharArr.length - 1; s1CharIndex++) {
            swapArrElements(s1AsCharArr, s1CharIndex, s1CharIndex + 1);
            if (s2.equals(new String(s1AsCharArr))) {
                return s1AsCharArr[s1CharIndex + 1] + " " + s1AsCharArr[s1CharIndex];
            }
            swapArrElements(s1AsCharArr, s1CharIndex, s1CharIndex + 1); //reverse back to normal
        }
        return null;
    }

     private static void swapArrElements(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
