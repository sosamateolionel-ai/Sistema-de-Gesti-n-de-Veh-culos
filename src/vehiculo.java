public class vehiculo {

    private final String marca;
    private final String modelo;
    private final String anio;
    private final String matricula;
    private boolean encendido;

    public vehiculo(String marca, String modelo, String anio, String matricula) {
        this.marca = validar(marca, "marca");
        this.modelo = validar(modelo, "modelo");
        this.anio = validar(anio, "año");
        this.matricula = validar(matricula, "matrícula");
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public void mostrarDatos() {
        System.out.println("===== Datos del vehículo =====");
        System.out.println("Marca:     " + marca);
        System.out.println("Modelo:    " + modelo);
        System.out.println("Año:       " + anio);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Estado:    " + (encendido ? "encendido" : "apagado"));
    }

    protected static String validar(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo " + campo + " no puede estar vacío.");
        }
        return valor.trim();
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getAnio() { return anio; }
    public String getMatricula() { return matricula; }
}