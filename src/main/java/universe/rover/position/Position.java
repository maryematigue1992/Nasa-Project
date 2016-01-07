/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universe.rover.position;

/**
 *
 * @author atig
 */
public class Position implements IPosition{
    int x;
    int y;
    static  int limitX;
    static  int limitY;

    public Position(int x, int y) {
        this.x=x;
        this.y=y;
    }
    
    public Position(Position position){
        this.x=position.x;
        this.y=position.y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public static int getLimitX() {
        return limitX;
    }
    
    public static int getLimitY() {
        return limitY;
    }

    public static void setLimits(int x,int y){
        limitX=x;
        limitY=y; 
    }
    
    public int incrementX(){ 
        x++; 
        return x;
    }
    
    public int decrementX(){
        x--;
        return x;
    } 
    
    public int incrementY(){ 
        y++; 
        return x;
    }
    
    public int decrementY(){
        y--;
        return x;
        } 
}
