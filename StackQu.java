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
public class StackQu {
    
    public int solution(String s) {
    
        if (s.length() % 2 != 0) {
            return 0;
        }

        Character openingBrace = '{';
        Character openingBracket = '[';
        Character openingParen = '(';
        Stack <Character> openingStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == openingBrace || c == openingBracket || c == openingParen) {
                openingStack.push(c);
            } else  {
                if (i == s.length()-1 && openingStack.size() != 1) {
                    return 0;
                }
                if (openingStack.isEmpty()) {
                    return 0;
                }
                Character openingCharacter = openingStack.pop();
                switch (c) {
                case '}':
                    if (!openingCharacter.equals(openingBrace)) {
                        return 0;
                    }
                    break;
                case ']':
                    if (!openingCharacter.equals(openingBracket)) {
                        return 0;
                    }
                    break;
                case ')':
                    if (!openingCharacter.equals(openingParen)) {
                        return 0;
                    }
                    break;

                default:
                    break;
                }
            } 
        }

        return 1;

    }
}
