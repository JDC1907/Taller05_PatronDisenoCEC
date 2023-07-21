/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo9.iterator;

import java.util.Random;

/**
 *
 * @author sebas
 */
public class Client {

    public static void main(String[] args) {
        Inventario inv= new Inventario();
        populate(inv, 50);
        IteradorInventario it= inv.getIterator(Filter.FALLIDO);
        while(it.hasNext()){
            System.out.println(it.next()); 
        }
    }
    
    
    
    
    public static void populate(Inventario i, int cant){
        for(int c=0; c<cant; c++){
            i.add(createRandomArticulo());
        }
    }
    
    
    
    
    private static Articulo createRandomArticulo() {
        // Generate a random type (Monitor, Mouse, or Teclado)
        int type = new Random().nextInt(3); // 0 for Monitor, 1 for Mouse, 2 for Teclado

        // Generate random precio and id for the Articulo
        int precio = new Random().nextInt(500) + 100; // Random precio between 100 and 599
        int id = new Random().nextInt(1000); // Random id between 0 and 999

        // Set a random Filter for the Articulo
        int filterIndex = new Random().nextInt(Filter.values().length);
        Filter filter;
        filter = Filter.values()[filterIndex];

        // Create the Articulo based on the randomly generated type
        Articulo articulo;
        switch (type) {
            case 0:
                articulo = new Monitor(filter, precio, id);
                break;
            case 1:
                articulo = new Mouse(filter, precio, id);
                break;
            case 2:
                articulo = new Teclado(filter, precio, id);
                break;
            default:
                throw new IllegalStateException("Invalid type");
        }

        return articulo;
    }
}
