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
public class Slice1 {
    
     public int solution(int[] A) {
         int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length-1; i++){
            int sum = A[i] + A[i+1];
            if(sum > max){
             max = sum;
            }
        }
        return max;
    }
}
