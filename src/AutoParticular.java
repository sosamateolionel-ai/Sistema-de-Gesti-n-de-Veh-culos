public class AutoParticular extends vehiculo {

    private final int velocidadMaxima;

    public AutoParticular(String marca, String modelo, String anio, String matricula,
                          int velocidadMaxima) {
        super(marca, modelo, anio, matricula);
        if (velocidadMaxima <= 0) {
            throw new IllegalArgumentException("La velocidad máxima debe ser mayor que cero.");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Velocidad: " + velocidadMaxima + " km/h");
    }

    public int getVelocidadMaxima() { return velocidadMaxima; }
}