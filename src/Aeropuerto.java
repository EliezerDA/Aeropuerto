import java.lang.ref.SoftReference;

public abstract class Aeropuerto {
    private static int contador = 0;
    private int id;
    private String nombre;
    private int anioInauguracion;
    private int capacidad;


    public Aeropuerto(){
        this.id =++ capacidad;
    }
    public Aeropuerto(int id, String nombre, int anioInauguracion, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }

    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Aeropuerto.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract double gananciasTotales(double cantidad);
}
