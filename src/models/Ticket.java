package models;
import java.util.*;

//Clase Tickete
class Ticket {
        private String placa;
        private Date horaIngreso;
        private Date horaSalida;
        private double tarifa;

        public Ticket(Vehicle vehicle) {
            this.placa = vehicle.getPlaca();
            this.horaIngreso = vehicle.getHoraIngreso();
            this.tarifa = vehicle.calcularTarifa();
        }

        public void registrarSalida() { this.horaSalida = new Date(); }
        public double calcularCosto() { return tarifa; }
        public boolean coincideConPlaca(String placa) {
            return this.placa.equals(placa);
        }
}
