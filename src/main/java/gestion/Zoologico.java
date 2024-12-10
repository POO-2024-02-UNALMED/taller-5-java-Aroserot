package gestion;
import java.util.ArrayList;
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList <Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public Zoologico() {
        this.zonas = new ArrayList<>();
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        return zonas.stream().mapToInt(Zona::cantidadAnimales).sum();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }
}