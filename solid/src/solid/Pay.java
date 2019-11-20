/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 * Se crea esta interfaz para satisfacer el punto 4, Interface Segregation
 * Principle 
 * @author CltControl
 */
public interface Pay {

    public abstract void pay(String method, Book book);
    
}
