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
public class ArrayPair {
    
     public int solution(int[] A) {
        for(int i = 0; i<A.length; i++){
             int count = 0;
            for(int j =0; j < A.length; j++){
                if(A[i] == A[j]) count++;
            }
            if(count %2 != 0){
                return A[i];
            }
        }
        return 0;
    }
}
