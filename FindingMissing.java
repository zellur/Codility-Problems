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
public class FindingMissing {
    
    public static int getMissing(int A[]){
      for(int i = 1; i <= A.length+1; i++){
         for(int j = 0; j<A.length; j++){
          if(A[j] == i){
            break;
          }
          if(j == A.length-1){
           return i;
          }
         }
      }
      return 0;
    }
}
