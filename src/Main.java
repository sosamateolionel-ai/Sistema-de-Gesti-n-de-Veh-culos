void main() {

    vehiculo Auto = new AutoParticular("Toyota","2018","Onix","AC259QF",200);
    vehiculo camion = new Camion("Mercedes-Benz","Axor","2025","AG257TJ",15000);
    vehiculo moto = new Motocicleta("Motomel", "Sirius","2025","A259HBH",190 );

    vehiculo[] flota = {Auto, camion, moto};

    for (vehiculo v : flota) {
        v.encender();
        v.mostrarDatos();
        System.out.println();
    }

}
