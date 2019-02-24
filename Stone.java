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
import java.util.*;
class Stone {
    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<Integer>();
        int count = 1;

        stack.push(H[0]);

        for (int i = 1; i < H.length; i++) {
            if (stack.empty()) {
                stack.push(H[i]);
                count++;
            }
            if (H[i] > stack.peek()) {
                stack.push(H[i]);
                count++;
            }
            while (H[i] < stack.peek()) {
                stack.pop();
                if (stack.empty()) {
                    stack.push(H[i]);
                    count++;
                } else if (H[i] > stack.peek()) {
                    stack.push(H[i]);
                    count++;
                }
            }
        }
        return count;    
    
    }
}