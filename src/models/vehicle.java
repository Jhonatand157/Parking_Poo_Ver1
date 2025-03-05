package models;
import java.util.*;

//clase vehiculo
abstract class Vehicle {
    protected String placa;
    protected Date horaIngreso;
    protected Date horaSalida;

    public Vehicle(String placa) {
        this.placa = placa;
        this.horaIngreso = new Date();
    }

    public String getPlaca() { return placa; }
    public Date getHoraIngreso() { return horaIngreso; }
    public Date getHoraSalida() { return horaSalida; }
    public void setHoraSalida(Date horaSalida) { this.horaSalida = horaSalida; }

    public abstract double calcularTarifa();


}





