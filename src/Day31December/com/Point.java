/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day31December.com;

/**
 *
 * @author Supaada-q214
 */
public enum Point {
    
    LOSS(0),
    WIN(2),
    TIE(1);
    
    private int point;

    private Point(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
   
}

class Whizlab {
    public static void main(String[] args) {
        System.out.println(Point.WIN.ordinal());
    }
}
