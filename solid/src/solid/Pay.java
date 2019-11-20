/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 * Se crea esta interfaz para satisfacer el punto 4, Interface Segregation
 * Principle, al tener dos formas de pago que en si seria la misma funcionalidad
 * solo que se cambia los parametros que se vayan a ingresar se podria generar 
 * mas formas de pagos con otras clases un ejemplo seria pago con transferencia bancaria
 * 
 * @author CltControl
 */
public interface Pay {

    public abstract void pay(String method, Book book);
    
}
