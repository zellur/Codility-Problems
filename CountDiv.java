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
public class CountDiv {
    
    public int solution(int A, int B, int K) {
        if(A == B) {
          if(A%K == 0) return 1;
          return 0;
        }
        if(K > B) return 0;
       int count = 0;
       for(int i = A; i<=B; i++){
         if(i%K == 0 && i/K>0) count++; 
       }
       
       return count;
    }
}
