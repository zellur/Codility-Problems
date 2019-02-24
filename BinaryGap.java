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
public class BinaryGap {
    
     public static int solution(int N) {
        String bin_str = "";
        while(N != 0){
           bin_str = N%2 + bin_str;
           N = N/2;
        }
        int i = bin_str.length()-1;
        while(bin_str.charAt(i)=='0') {
            i--;
        }
        int length = 0;
        int ctr = 0;
        for(; i>=0; i--) {
            if(bin_str.charAt(i)=='1') {
                length = Math.max(length, ctr);
                ctr = 0;
            } else {
                ctr++;
            }
        }
        length = Math.max(length, ctr);
        
        return length;
    }
}
