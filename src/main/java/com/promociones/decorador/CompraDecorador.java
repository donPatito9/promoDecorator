/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.promociones.decorador;
import com.promociones.interf.ITarjetaDeCredito;
import com.promociones.model.Compra;
/**
 *
 * @author Robinson Concha
 */
public abstract class CompraDecorador implements ITarjetaDeCredito{
  protected ITarjetaDeCredito compraDecorada;
  
  public CompraDecorador(ITarjetaDeCredito compraDecorada){
   this.compraDecorada = compraDecorada; 
 }
  @Override
  public void ingresarCompra(Compra c) {
  this.compraDecorada.ingresarCompra(c);
  }
}
