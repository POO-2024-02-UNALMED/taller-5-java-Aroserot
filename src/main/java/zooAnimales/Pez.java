package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private String colorEscamas;
    private int cantidadAletas;
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones = 0;
    public static int bacalaos = 0;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez() {
        listado.add(this);
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "océano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "océano", genero, "gris", 6);
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    // Getters y setters
    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }
}