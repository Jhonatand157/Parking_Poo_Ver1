package models;

//Clase Carro
class Car extends Vehicle{
        public Car(String placa) { super(placa); }
        public double calcularTarifa() { return 5.0; } // Tarifa fija por ahora
}
