package models;
import java.util.*;

//Clase EspacioEstacionamiento
class SpaceParking {
        private boolean ocupado;
        private Vehicle vehicle;

        public boolean estaOcupado() { return ocupado; }
        public void asignarVehiculo(Vehicle v) { this.vehicle = v; this.ocupado = true; }
        public void liberarEspacio() { this.vehicle = null; this.ocupado = false; }
        public Vehicle getVehiculo() { return vehicle; }
}
