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
public class ArrayCycle {
    
     public int[] solution(int[] A, int K) {
        if(A.length<1) return A;
         for(int i = 0; i < K; i++){
             int[]temp = new int[A.length];
             temp[0] = A[A.length-1];
             for(int j = 1; j<temp.length;j++){
                 temp[j] = A[j-1];
             }
             A = temp;
         }
         
         return A;
    }
      public int solution(String S) {
       
        String s = S.toLowerCase();
       char max = ' ';
        int l = s.length(); 
        String ans = ""; 
        for(int i = 0; i < l-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                if(s.charAt(i+1)>=max){
                     ans += s.charAt(i+1);
                     max = s.charAt(i+1);
                }
              
            }
        }
        return s.length()-ans.length();
    }
      
      
}
