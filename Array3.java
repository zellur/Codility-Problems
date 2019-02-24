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
public class Array3 {
    
     public int solution(int[] A) {
        int minDiff = 0;
         int part1 = 0;
         int part2 = 0;
         for(int i = 0; i<A.length-1; i++){
            for(int j = 0; j <= i; j++){
                part1 += A[j];
            }
            for(int k = A.length-1; k > i; k--){
              part2 += A[k];
            }
            int diff = Math.abs(part1-part2);
            if(i == 0){
             minDiff = diff;
            }
            if(minDiff > diff){
             minDiff = diff;
            }
            part1 = 0;
            part2 = 0;
         }
         return minDiff;
    }
}
