/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 * Esta se crea para poder satisfacer el punto 2, Open/Closed Principle, asi se 
 * puede ampliar mas el funcionamiento de los pagos sin modificar lo que ya
 * esta hecho.
 * @author CltControl
 */
public class PayCard implements Pay{

    @Override
    public void pay(String cardNumber, Book book) {
        /*
        * change state to true
        */
    }
    
}
