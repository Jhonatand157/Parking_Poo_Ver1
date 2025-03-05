package main;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parking Parking = new Parking(10);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar entrada");
            System.out.println("2. Registrar salida");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt(); scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Tipo (carro/moto): ");
                    String tipo = scanner.nextLine();
                    Vehicle vehicle = tipo.equalsIgnoreCase("carro") ? new Car(placa) : new Motorbike(placa);
                    Parking.registrarEntrada(vehicle);
                    break;
                case 2:
                    System.out.print("Placa: ");
                    String placaSalida = scanner.nextLine();
                    Parking.registrarSalida(placaSalida);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
