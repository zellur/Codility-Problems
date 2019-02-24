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
public class PassingCars {
    
    public static long countPairsOfPassingCars(int A[]){
       
        long count = 0L;
        
        int N=A.length;
        int incrementVal = 0;
    for(int i = 0; i < N; i++){
        if(A[i]==0)
        {
            incrementVal++;
        }
        else if (A[i]==1)
        {
            count = count + incrementVal;
        }
        if(count > 1000000000) return -1;
    }
    return count;
}
    }
