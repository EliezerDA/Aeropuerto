public class AeropuertoPublico extends Aeropuerto {
    private double financion;
    private int numeroTrabajadoresDiscapacitados;

    public AeropuertoPublico(){
        super();
    }

    public AeropuertoPublico(int id, String nombre, int anioInauguracion, int capacidad, int numeroTrabajadoresDiscapacitados, double financion) {
        super(id, nombre, anioInauguracion, capacidad);
        this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
        this.financion = financion;
    }

    public int getNumeroTrabajadoresDiscapacitados() {
        return numeroTrabajadoresDiscapacitados;
    }

    public void setNumeroTrabajadoresDiscapacitados(int numeroTrabajadoresDiscapacitados) {
        this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
    }

    public double getFinancion() {
        return financion;
    }

    public void setFinancion(double financion) {
        this.financion = financion;
    }

    @Override
    public double gananciasTotales(double cantidad){
        return cantidad+financion+(numeroTrabajadoresDiscapacitados*1000);
    }
}
