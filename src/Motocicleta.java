public class Motocicleta extends vehiculo {

    private final int cilindradas;

    public Motocicleta(String marca, String modelo, String anio, String matricula,
                       int cilindradas) {
        super(marca, modelo, anio, matricula);
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("Las cilindradas deben ser mayores que cero.");
        }
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }

    public int getCilindradas() { return cilindradas; }
}