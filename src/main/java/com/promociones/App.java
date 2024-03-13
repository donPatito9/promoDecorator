/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.promociones;
import com.promociones.decorador.PromocionDecorador;
import com.promociones.interf.ITarjetaDeCredito;
import com.promociones.interf.impl.TarjetaDeCredito;
import com.promociones.model.Compra;
/**
 *
 * @author Robinson Concha
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Compra c = new Compra(1, "Computador", 350000, 19990, 369990);
        
        ITarjetaDeCredito compra = new TarjetaDeCredito();
        ITarjetaDeCredito compraDecorator = new PromocionDecorador(compra);
        
        compraDecorator.ingresarCompra(c);
    }
    
}
