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
public interface IPosition {
    public int getX();
    public int getY();
    public int incrementX();
    public int decrementX();
    public int incrementY();
    public int decrementY();

 
}
