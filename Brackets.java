/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toptal;

import java.util.Stack;

/**
 *
 * @author rakib
 */
public class Brackets {
    
     static char tokens[][] = {{'{','}'},{'(',')'},{'[',']'}};
     static Stack<Character> charStack = new Stack();

    
    public static int isNested(String s){
       
     for(char c : s.toCharArray()){
       if(openBraces(c)){
          charStack.push(c);
       } else {
          if(charStack.isEmpty() || !matches(charStack.pop(),c)) return 0;
       }
     }
        return 1;
    }

    private static boolean openBraces(char c) {
        for(char array[] : tokens){
          if(array[0] == c) return true;
        }
        return false;
    }

    private static boolean matches(char open, char c) {
        for(char array[] : tokens){
          if(array[0] == open){
           return array[1] == c;
          }
        }
        return false;
    }
}
