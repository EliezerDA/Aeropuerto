public class main {
    public static void main(String[] args) {
        Aeropuerto aeropuertoPublico = new AeropuertoPublico(875,"se cayo",2001,74,745,744);
        Aeropuerto aeropuertoPrivado = new AeropuertoPrivado(14,"Elcacas",41,52,4 );

        double gananciasPublico = aeropuertoPublico.gananciasTotales(100);
        double gananciasPrivado = aeropuertoPrivado.gananciasTotales(400);

        System.out.println("Ganancias del aeropuerto público: " + gananciasPublico);
        System.out.println("Ganancias del aeropuerto privado: " + gananciasPrivado);
    }
}
