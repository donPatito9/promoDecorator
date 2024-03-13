/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.promociones.interf.impl;

import com.promociones.interf.ITarjetaDeCredito;
import com.promociones.model.Compra;

/**
 *
 * @author Robinson Concha
 */
public class TarjetaDeCredito implements ITarjetaDeCredito {
  
    @Override
    public void ingresarCompra(Compra c) {
    System.out.println("----------------------");
    System.out.println("Se ingreso una nueva compra");
    System.out.println("Compra: " + c.getProducto());
    }
}
