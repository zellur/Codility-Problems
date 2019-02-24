/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toptal;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rakib
 */
public class DistinctValue {
     public int solution(int[] A) {
         if(A.length < 1) return 0;
       Set<Integer> set = new HashSet();
       for(int i : A){
        set.add(i);
       }
       
       return set.size();
    }
}
