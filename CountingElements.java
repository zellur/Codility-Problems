/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toptal;

import java.util.Arrays;

/**
 *
 * @author rakib
 */
public class CountingElements {
    
     public int solution(int[] A) {
         Arrays.sort(A);
        int j = 0;
         for(int i = 1; i <= A.length; i++){
           if(A[j] != i) return 0;
           j++;
         }
        return 1;
    }
}
