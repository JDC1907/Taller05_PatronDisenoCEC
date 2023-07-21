/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo9.iterator;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Inventario implements Collection {
    
    public ArrayList<Articulo> articulos;


    
    public int size(){
        return articulos.size();
    }
     public Articulo get(int i){
        return articulos.get(i);
    }
     
    public boolean add(Articulo a){
        return articulos.add(a);
    }

    @Override
    public IteradorInventario getIterator(Filter f) {
        IteradorInventario it = new IteradorInventario(this, f);
        return it;
    }
}
