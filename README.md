Parqueadero/
│── src/                          (Código fuente)
│   ├── models/                   (Clases principales del sistema)
│   │   ├── Vehiculo.java
│   │   ├── Carro.java
│   │   ├── Moto.java
│   │   ├── EspacioEstacionamiento.java
│   │   ├── Ticket.java
│   │   ├── Parqueadero.java
│   ├── main/                      (Punto de entrada y menú)
│   │   ├── Main.java
│── test/                         (Pruebas unitarias)
│── docs/                         (Documentación)
│── README.md                     (Explicación del sistema)

Aplicación de los Principios SOLID en el Sistema de Parqueadero
Los principios SOLID ayudan a diseñar un sistema flexible, mantenible y escalable. Apliquemos estos principios a nuestro diagrama UML:

1️⃣ S – Principio de Responsabilidad Única (SRP)
👉 Cada clase debe tener una única razón para cambiar.

✅ Ejemplo en el sistema:

Parqueadero administra los espacios de estacionamiento (no calcula tarifas ni genera tickets).
Ticket solo maneja información de tarifas y pagos.
Vehiculo almacena información del vehículo, pero no maneja estacionamiento.
💡 Beneficio: Si cambia la forma de calcular tarifas, solo modificamos Ticket, sin afectar Parqueadero ni Vehiculo.

2️⃣ O – Principio de Abierto/Cerrado (OCP)
👉 Una clase debe estar abierta para extensión, pero cerrada para modificación.

✅ Ejemplo en el sistema:

Vehiculo es abstracta, permitiendo extenderla con nuevas clases (Carro, Moto) sin modificar la estructura base.
Si se agrega un nuevo tipo de vehículo (Bicicleta, Camión), solo creamos una nueva clase sin modificar el código existente.
💡 Beneficio: Se pueden agregar nuevas funcionalidades sin afectar el código previo.

3️⃣ L – Principio de Sustitución de Liskov (LSP)
👉 Si una clase hija reemplaza a su padre, el sistema debe seguir funcionando correctamente.

✅ Ejemplo en el sistema:

Carro y Moto pueden reemplazar a Vehiculo en cualquier parte del código sin errores.
Ambas implementan su versión de calcularTarifa(), asegurando que la lógica de tarifas se respete.
💡 Beneficio: Permite usar polimorfismo sin afectar el comportamiento del sistema.

4️⃣ I – Principio de Segregación de Interfaces (ISP)
👉 Una interfaz no debe obligar a implementar métodos que no se usan.

✅ Ejemplo en el sistema:

En lugar de una interfaz gigante, cada clase tiene solo los métodos que necesita.
Vehiculo no tiene métodos relacionados con el parqueadero, porque no es su responsabilidad.
💡 Beneficio: Se evitan implementaciones innecesarias, manteniendo el código limpio y modular.

5️⃣ D – Principio de Inversión de Dependencia (DIP)
👉 Los módulos de alto nivel no deben depender de módulos de bajo nivel, sino de abstracciones.

✅ Ejemplo en el sistema:

Parqueadero no depende directamente de Carro ni Moto, sino de la abstracción Vehiculo.
Ticket recibe un Vehiculo sin importar qué tipo sea.
💡 Beneficio: Si cambiamos la implementación de Vehiculo, el sistema sigue funcionando sin cambios en Parqueadero ni Ticket.

🚀 Resumen del Funcionamiento del Sistema
Un vehículo llega al parqueadero. Se registra con placa, tipo y hora de ingreso.
El sistema busca un espacio libre y lo asigna al vehículo. Si el parqueadero está lleno, rechaza la entrada.
Cuando el vehículo sale, se registra la hora de salida y se genera un ticket con el costo total.
El sistema actualiza el estado del parqueadero, liberando el espacio ocupado.
El administrador puede consultar el estado del parqueadero, ver los ingresos generados y la cantidad de vehículos que han ingresado/salido.