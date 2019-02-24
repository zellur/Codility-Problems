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
public class PermMissingElem {
    
    public int solution(int[] A) {
        if(A.length == 0) return 1;
        if(A.length == 1){
         if(A[0] == 1) return 2;
         return 1;
        }
        Arrays.sort(A);
        if(A[0] != 1) return 1;
        for(int i = 1; i<A.length; i++){
            if(A[i]-A[i-1] != 1){
                return A[i-1]+1;
            }
        }
        return A.length+1;
    }
}
