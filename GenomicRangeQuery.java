/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toptal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rakib
 */
public class GenomicRangeQuery {
    
   public int[] solution(String S, int[] P, int[] Q) {
       int len = P.length;
        int list[] = new int[len];
        int k = 0;
        for(int i = 0; i<len; i++){
          String st = S.substring(P[i],Q[i]+1);
           int min = this.getmin(st);
          if(min > 0){
           list[k] = min;
           k++;
          }
        }
        
        return list;
    }
   
   
   public int getmin(String st){
       List<Integer> list = new ArrayList();
        for(int j = 0; j< st.length(); j++){
              if(st.charAt(j) == 'A'){
               list.add(1);
                continue;
              }
              if(st.charAt(j) == 'C'){
               list.add(2);
               continue;
              }
              if(st.charAt(j) == 'G'){
               list.add(3);
               continue;
              }
              if(st.charAt(j) == 'T'){
                list.add(4);
              }              
          }
        if(list.isEmpty()) return  0;
       
        Collections.sort(list);
       
       return list.get(0);
   }
}
