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
public class FrogJmp {
    
    
    public int solution(int X, int Y, int D) {
        if(X == Y) return 0;
        int jump = 0;
        int n = (Y - X);
        if(n%D == 0){
            return n/D;
        } else {
            return (n/D)+1;
        }
        
    }
    
}
