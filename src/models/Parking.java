package models;
import java.util.*;
import java.util.ArrayList;

//Clase Parqueadero
class Parking {
    private int capacidadTotal;
    private List<SpaceParking> espacios;
    private List<Ticket> tickets;

    public Parking(int capacidad) {
        this.capacidadTotal = capacidad;
        this.espacios = new ArrayList<>();
        this.tickets = new ArrayList<>();
        for (int i = 0; i < capacidad; i++) { espacios.add(new SpaceParking()); }
    }

    public void registrarEntrada(Vehicle vehicle) {
        for (SpaceParking espacio : espacios) {
            if (!espacio.estaOcupado()) {
                espacio.asignarVehiculo(vehicle);
                tickets.add(new Ticket(vehicle));
                System.out.println("Vehículo " + vehicle.getPlaca() + " ingresó correctamente.");
                return;
            }
        }
        System.out.println("No hay espacios disponibles.");
    }

    public void registrarSalida(String placa) {
        for (Ticket ticket : tickets) {
            if (ticket.coincideConPlaca(placa)){
                ticket.registrarSalida();
                System.out.println("Vehículo " + placa + " salió. Total a pagar: $" + ticket.calcularCosto());
                return;
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

}
