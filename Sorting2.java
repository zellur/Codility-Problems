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
public class Sorting2 {
    
    public int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;

        int maxWithNegativeNumbers = A[0] * A[1] * A[n - 1];
        int maxWithPositiveNumbers = A[n - 3] * A[n - 2] * A[n - 1];

        return Math.max(maxWithNegativeNumbers, maxWithPositiveNumbers);
    }
    
    public int solutionp(int[] A) {
       Arrays.sort(A);
       int n = A.length;
       
       for(int i = 0; i < n-2; i++){
         if(A[i]+A[i+1] > A[i+2] && A[i] < A[i+1]+A[i+2] && A[i]+A[i+2] > A[i+1]) return 1;
       }
       return 0;
    }
}
