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
public class PromocionDecorador extends CompraDecorador{
  public PromocionDecorador(ITarjetaDeCredito compraDecorada) {
  super(compraDecorada);
  }
  
  @Override
  public void ingresarCompra(Compra c) {
   compraDecorada.ingresarCompra(c);
   agregarPromocion(c);
  }
  public void agregarPromocion(Compra c) {
  System.out.println("se agrego una Promocion al producto:  " + c.getProducto()+"\n"
          +"precio Producto: " +c.getPrecio()+" promocion: " +c.getPromocion());
           System.out.println("el total de la compra es: "+c.getTotal());
  }
}