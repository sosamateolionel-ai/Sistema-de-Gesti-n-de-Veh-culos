public class Camion extends vehiculo {

    private final double capacidadCarga;

    public Camion(String marca, String modelo, String anio, String matricula,
                  double capacidadCarga) {
        super(marca, modelo, anio, matricula);
        if (capacidadCarga <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser mayor que cero.");
        }
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: " + capacidadCarga + " t");
    }

    public double getCapacidadCarga() { return capacidadCarga; }
}