/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo9.iterator;

/**
 *
 * @author sebas
 */
public class IteradorInventario implements Iterator{
    public Inventario articulos;
    public Filter filter;
    private int position;

    @Override
    public boolean hasNext() {
        while (position < articulos.size()) {
            Articulo a = articulos.get(position);
            if (filter.equals(Filter.ALL)|| filter.equals(a.getFilter())) {
                return true;
            }else{
                position++;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        Articulo a=articulos.get(position);
        position++;
        return a;
    }

    public IteradorInventario(Inventario articulos, Filter f) {
        this.articulos = articulos;
        this.filter = f;
        this.position=0;
    }

    public Inventario getArticulos() {
        return articulos;
    }

    public void setArticulos(Inventario articulos) {
        this.articulos = articulos;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    
    
    
}
