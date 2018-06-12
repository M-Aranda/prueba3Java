
package model;


public class ColorIngresado {

    public static java.awt.Color decode(String b7BA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private int id;
    private String color_hexa;

    public ColorIngresado(int id, String color_hexa) {
        this.id = id;
        this.color_hexa = color_hexa;
    }

    ColorIngresado() {
        //Constructor vacio
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor_hexa() {
        return color_hexa;
    }

    public void setColor_hexa(String color_hexa) {
        this.color_hexa = color_hexa;
    }

    @Override
    public String toString() {
        return "Color{" + "id=" + id + ", color_hexa=" + color_hexa + '}';
    }
    
    
    
}
