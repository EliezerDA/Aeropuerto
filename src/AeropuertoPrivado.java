public class AeropuertoPrivado extends Aeropuerto {
    private int numeroSocios;

    public AeropuertoPrivado() {
        super();
    }

    public AeropuertoPrivado(int id, String nombre, int anioInauguracion, int capacidad, int numeroSocios) {
        super(id, nombre, anioInauguracion, capacidad);
        if (numeroSocios <= 0) {
            throw new IllegalArgumentException("El número de socios debe ser mayor que cero.");
        }
        this.numeroSocios = numeroSocios;
    }

    public int getNumeroSocios() {
        return numeroSocios;
    }

    public void setNumeroSocios(int numeroSocios) {
        if (numeroSocios <= 0) {
            throw new IllegalArgumentException("El número de socios debe ser mayor que cero.");
        }
        this.numeroSocios = numeroSocios;
    }

    @Override
    public double gananciasTotales(double cantidad) {
        if (numeroSocios == 0) { // Corrección: validar 0, no 1
            throw new IllegalArgumentException("El número de socios no puede ser cero.");
        }
        return cantidad / numeroSocios;
    }
}
