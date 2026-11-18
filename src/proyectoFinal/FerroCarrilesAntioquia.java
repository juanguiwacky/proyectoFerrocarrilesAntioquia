package FerroCarrilesAntioquia;

public class FerroCarrilesAntioquia {

    // Creacion de las variables

    // usuarios
    static int id;
    static String nombre;
    static String apellido;
    static String origen;
    static String destino;

    // usuario cajero
    static String rol;
    static String password;

    // tren
    static int trenId;
    static String modelo;
    static int capacidad;

    // ticket
    static int ticketId;
    static int usuario;
    static String origenRuta;
    static String destinoRuta;
    static String silla;
    static int tren;
    static String fecha;
    static String hora;
    static double precio;

    // venta
    static int ventaId;
    static int ticketIdVenta;
    static int cantidad;
    static double precioVentaUnitario;
    static double totalVenta;


    public static void main(String[] args) {

        boolean sesionIniciada = false;
        int opcionAcceso = 0;

        // 1. MENÚ INICIAL
        while (!sesionIniciada && opcionAcceso != 3) {
            System.out.println("\n=== BIENVENIDO A FERROCARRILES DE ANTIOQUIA ===");
            System.out.println("1. Registrar Cajero");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Salir del sistema");
            System.out.print("Elige una opción: ");

            opcionAcceso = ValidadorDeTipo.ValidarEnteros();

            switch (opcionAcceso) {
                case 1:
                    registrarCajero();
                    break;
                case 2:
                    if (iniciarsesion()) {
                        sesionIniciada = true;
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        // menu sesion iniciada
        if (sesionIniciada) {
            String trainTicket = "no";

            while (trainTicket.equals("no")) {

                System.out.println("\n=======FERROCARRILES DE ANTIOQUIA======= \n" +
                        "1. Gestion de usuarios \n" +
                        "2. Gestion de Trenes \n" +
                        "3. Gestion de tickets \n" +
                        "4. Gestion de ventas \n" +
                        "5. Gestion de cajeros \n" +
                        "6. Salir");

                int opcion = ValidadorDeTipo.ValidarEnteros();

                switch (opcion) {

                    // menu usuario
                    case 1: {
                        int opcionUsuario = 0;
                        while (opcionUsuario != 6) {
                            System.out.println("\n=====Gestion de usuarios=====");
                            System.out.println("1. Crear usuario");
                            System.out.println("2. Actualizar usuario");
                            System.out.println("3. Consultar todos los usuarios");
                            System.out.println("4. Consultar usuario por ID");
                            System.out.println("5. Eliminar usuario");
                            System.out.println("6. Volver al menu principal");

                            opcionUsuario = ValidadorDeTipo.ValidarEnteros();

                            switch (opcionUsuario) {
                                case 1: crearUsuario(); break;
                                case 2: actualizarDatos(); break;
                                case 3: consultarUsuario(); break;
                                case 4: consultarUsuarioPorId(); break;
                                case 5: eliminarUsuario(); break;
                                case 6: System.out.println("Regresar al menu principal"); break;
                                default: System.out.println("Opcion no valida."); break;
                            }
                        }
                        break;
                    }

                    // menu trenes
                    case 2: {
                        int opcionTrenes = 0;
                        while (opcionTrenes != 6) {
                            System.out.println("\n=====Gestion de trenes=====");
                            System.out.println("1. Crear tren");
                            System.out.println("2. Actualizar tren");
                            System.out.println("3. Consultar todos los trenes");
                            System.out.println("4. Consultar tren por ID");
                            System.out.println("5. Eliminar tren");
                            System.out.println("6. Volver al menu principal");

                            opcionTrenes = ValidadorDeTipo.ValidarEnteros();

                            switch (opcionTrenes) {
                                case 1: crearTren(); break;
                                case 2: actualizarTren(); break;
                                case 3: consultarTrenes(); break;
                                case 4: consultarTrenPorId(); break;
                                case 5: eliminarTren(); break;
                                case 6: System.out.println("Regresar al menu principal"); break;
                                default: System.out.println("Opcion no valida."); break;
                            }
                        }
                        break;
                    }

                    // menu tickets
                    case 3: {
                        int opcionTicket = 0;
                        while (opcionTicket != 6) {
                            System.out.println("\n=====Gestion de tickets=====");
                            System.out.println("1. Crear ticket");
                            System.out.println("2. Actualizar ticket");
                            System.out.println("3. Consultar todos los tickets");
                            System.out.println("4. Consultar ticket por ID");
                            System.out.println("5. Eliminar ticket");
                            System.out.println("6. Volver al menu principal");

                            opcionTicket = ValidadorDeTipo.ValidarEnteros();

                            switch (opcionTicket) {
                                case 1: crearTicket(); break;
                                case 2: actualizarTicket(); break;
                                case 3: consultarTicket(); break;
                                case 4: consultarTicketPorId(); break;
                                case 5: eliminarTicket(); break;
                                case 6: System.out.println("Regresar al menu principal"); break;
                                default: System.out.println("Opcion no valida. "); break;
                            }
                        }
                        break;
                    }

                    // menu ventas
                    case 4: {
                        int opcionVentas = 0;
                        while (opcionVentas != 6) {
                            System.out.println("\n=====Gestion de ventas=====");
                            System.out.println("1. Crear venta");
                            System.out.println("2. Actualizar venta");
                            System.out.println("3. Consultar todos las ventas");
                            System.out.println("4. Consultar ventas por ID");
                            System.out.println("5. Eliminar ventas");
                            System.out.println("6. Volver al menu principal");

                            opcionVentas = ValidadorDeTipo.ValidarEnteros();

                            switch (opcionVentas) {
                                case 1: crearVenta(); break;
                                case 2: actualizarVentas(); break;
                                case 3: consultarVentas(); break;
                                case 4: consultarVentasPorId(); break;
                                case 5: eliminarVenta(); break;
                                case 6: System.out.println("Regresar al menu principal"); break;
                                default: System.out.println("Opcion no valida"); break;
                            }
                        }
                        break;
                    }

                    // menu cajeros
                    case 5: {
                        int opcionCajero = 0;
                        while (opcionCajero != 6) {
                            System.out.println("\n=====Gestion de cajeros=====");
                            System.out.println("1. Registrar cajero");
                            System.out.println("2. Consultar cajero");
                            System.out.println("3. Actualizar cajero");
                            System.out.println("4. Eliminar cajero");
                            System.out.println("6. Volver al menu principal");

                            opcionCajero = ValidadorDeTipo.ValidarEnteros();

                            switch (opcionCajero) {
                                case 1: registrarCajero(); break;
                                case 2: consultarCajero(); break;
                                case 3: actualizarCajero(); break;
                                case 4: eliminarCajero(); break;
                                case 6: System.out.println("Regresar al menu principal"); break;
                                default: System.out.println("Opcion no valida."); break;
                            }
                        }
                        break;
                    }

                    case 6:
                        trainTicket = "si";
                        System.out.println("Gracias por usar el sistema");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        }
    }


    // ================= USUARIOS =================
    static String[][] usuarios = new String[10][5];
    static String[] encabezados = {
            "id", "nombre", "apellido", "origen", "destino"
    };

    public static void crearUsuario() {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] == null) {
                System.out.println("\n--- Nuevo Usuario ---");
                for (int j = 0; j < usuarios[i].length; j++) {
                    System.out.print("Ingrese " + encabezados[j] + ": ");
                    usuarios[i][j] = ValidadorDeTipo.ValidarString();
                }
                System.out.println("Usuario registrado correctamente.");
                return;
            }
        }
        System.out.println("No hay espacio para más usuarios.");
    }

    public static void consultarUsuario() {
        for (int i = 0; i < encabezados.length; i++) {
            System.out.print(encabezados[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                for (int j = 0; j < usuarios[i].length; j++) {
                    System.out.print(usuarios[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void consultarUsuarioPorId() {
        System.out.print("Ingrese el ID del usuario: ");
        String idBuscar = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null && usuarios[i][0].equals(idBuscar)) {
                for (int j = 0; j < usuarios[i].length; j++) {
                    System.out.println(encabezados[j] + ": " + usuarios[i][j]);
                }
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    public static void actualizarDatos() {
        System.out.print("Ingrese el ID del usuario que desea actualizar: ");
        String idBuscar = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null && usuarios[i][0].equals(idBuscar)) {
                for (int j = 1; j < usuarios[i].length; j++) {
                    System.out.print("Ingrese nuevo " + encabezados[j] + ": ");
                    usuarios[i][j] = ValidadorDeTipo.ValidarString();
                }
                System.out.println("Usuario actualizado correctamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    public static void eliminarUsuario() {
        System.out.print("Ingrese el ID del usuario que desea eliminar: ");
        String idEliminar = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null && usuarios[i][0].equals(idEliminar)) {
                for (int j = 0; j < usuarios[i].length; j++) {
                    usuarios[i][j] = null;
                }
                System.out.println("Usuario eliminado correctamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }


    // ================= TRENES ( 3 trenes, capacidad 2 pasajeros) =================
    static String[][] trenes = {
            {"1", "Tren Santa Fe", "2"},
            {"2", "Tren Cisneros", "2"},
            {"3", "Tren Puerto Berrio", "2"}
    };
    static String[] encabezadosTren = {
            "id", "modelo", "capacidad"
    };

    public static void crearTren() {
        for (int i = 0; i < trenes.length; i++) {
            if (trenes[i][0] == null) {
                System.out.println("\n--- Nuevo Tren ---");
                System.out.print("Ingrese id (# de máquina): ");
                trenes[i][0] = ValidadorDeTipo.ValidarString();
                System.out.print("Ingrese modelo: ");
                trenes[i][1] = ValidadorDeTipo.ValidarString();
                trenes[i][2] = "2"; // Capacidad fija de 2 según la nueva regla
                System.out.println("Tren registrado correctamente con capacidad de 2 pasajeros.");
                return;
            }
        }
        System.out.println("La compañía ya tiene los 3 trenes máximos permitidos.");
    }

    public static void consultarTrenes() {
        for (int i = 0; i < encabezadosTren.length; i++) {
            System.out.print(encabezadosTren[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < trenes.length; i++) {
            if (trenes[i][0] != null) {
                for (int j = 0; j < trenes[i].length; j++) {
                    System.out.print(trenes[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void consultarTrenPorId() {
        System.out.print("Ingrese el ID del tren: ");
        String idBuscarTren = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < trenes.length; i++) {
            if (trenes[i][0] != null && trenes[i][0].equals(idBuscarTren)) {
                for (int j = 0; j < trenes[i].length; j++) {
                    System.out.println(encabezadosTren[j] + ": " + trenes[i][j]);
                }
                return;
            }
        }
        System.out.println("Tren no encontrado.");
    }

    public static void actualizarTren() {
        System.out.print("Ingrese el ID del tren que desea actualizar: ");
        String idBuscarTren = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < trenes.length; i++) {
            if (trenes[i][0] != null && trenes[i][0].equals(idBuscarTren)) {
                System.out.print("Ingrese nuevo modelo: ");
                trenes[i][1] = ValidadorDeTipo.ValidarString();
                System.out.print("Ingrese nueva capacidad: ");
                trenes[i][2] = ValidadorDeTipo.ValidarString();
                System.out.println("Tren actualizado correctamente.");
                return;
            }
        }
        System.out.println("Tren no encontrado.");
    }

    public static void eliminarTren() {
        System.out.print("Ingrese el ID del tren que desea eliminar: ");
        String idEliminar = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < trenes.length; i++) {
            if (trenes[i][0] != null && trenes[i][0].equals(idEliminar)) {
                for (int j = 0; j < trenes[i].length; j++) {
                    trenes[i][j] = null;
                }
                System.out.println("Tren eliminado correctamente.");
                return;
            }
        }
        System.out.println("Tren no encontrado.");
    }


    // ================= TICKETS =================
    static String[][] ticketes = new String[6][9];
    static String[] encabezadosTicket = {
            "id", "usuario", "origenRuta", "destinoRuta", "silla", "tren", "fecha", "hora", "precio"
    };

    public static void crearTicket() {
        for (int i = 0; i < ticketes.length; i++) {
            if (ticketes[i][0] == null) {
                System.out.println("\n--- Nuevo Ticket ---");
                System.out.println("Destinos disponibles: Santa Fe, Cisneros, Puerto Berrio");

                System.out.print("Ingrese id del ticket: ");
                String idT = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese id del usuario: ");
                String idU = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese origenRuta: ");
                String orig = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese destinoRuta (Santa Fe / Cisneros / Puerto Berrio): ");
                String dest = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese silla (1 o 2): ");
                String sil = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese id del tren (1, 2 o 3): ");
                String idTr = ValidadorDeTipo.ValidarString();

                // Validación: Cada tren solo puede tener máximo 2 tickets vendidos
                int ocupados = 0;
                for (int k = 0; k < ticketes.length; k++) {
                    if (ticketes[k][0] != null && ticketes[k][5].equals(idTr)) {
                        ocupados++;
                    }
                }
                if (ocupados >= 2) {
                    System.out.println("⚠️ Error: El tren " + idTr + " ya llenó su capacidad máxima de 2 pasajeros.");
                    return;
                }

                System.out.print("Ingrese fecha (ej. 15/11/2026): ");
                String fec = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese hora (ej. 08:00 AM): ");
                String hor = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese precio: ");
                String pre = ValidadorDeTipo.ValidarString();

                ticketes[i][0] = idT;
                ticketes[i][1] = idU;
                ticketes[i][2] = orig;
                ticketes[i][3] = dest;
                ticketes[i][4] = sil;
                ticketes[i][5] = idTr;
                ticketes[i][6] = fec;
                ticketes[i][7] = hor;
                ticketes[i][8] = pre;

                System.out.println("Ticket registrado correctamente.");
                return;
            }
        }
        System.out.println("Todos los trenes están llenos (6 tickets vendidos en total).");
    }

    public static void consultarTicket() {
        for (int i = 0; i < encabezadosTicket.length; i++) {
            System.out.print(encabezadosTicket[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < ticketes.length; i++) {
            if (ticketes[i][0] != null) {
                for (int j = 0; j < ticketes[i].length; j++) {
                    System.out.print(ticketes[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void consultarTicketPorId() {
        System.out.print("Ingrese el ID del ticket: ");
        String idBuscarTicket = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < ticketes.length; i++) {
            if (ticketes[i][0] != null && ticketes[i][0].equals(idBuscarTicket)) {
                for (int j = 0; j < ticketes[i].length; j++) {
                    System.out.println(encabezadosTicket[j] + ": " + ticketes[i][j]);
                }
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }

    public static void actualizarTicket() {
        System.out.print("Ingrese el ID del ticket que desea actualizar: ");
        String idBuscarTicket = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < ticketes.length; i++) {
            if (ticketes[i][0] != null && ticketes[i][0].equals(idBuscarTicket)) {
                for (int j = 1; j < ticketes[i].length; j++) {
                    System.out.print("Ingrese nuevo " + encabezadosTicket[j] + ": ");
                    ticketes[i][j] = ValidadorDeTipo.ValidarString();
                }
                System.out.println("Ticket actualizado correctamente.");
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }

    public static void eliminarTicket() {
        System.out.print("Ingrese el ID del ticket que desea eliminar: ");
        String idEliminar = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < ticketes.length; i++) {
            if (ticketes[i][0] != null && ticketes[i][0].equals(idEliminar)) {
                for (int j = 0; j < ticketes[i].length; j++) {
                    ticketes[i][j] = null;
                }
                System.out.println("Ticket eliminado correctamente.");
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }


    // ================= VENTAS =================
    static String[][] ventas = new String[6][5];
    static String[] encabezadosVentas = {
            "idVenta", "idTicket", "cantidad", "precioUnitario", "total"
    };

    public static void crearVenta() {
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][0] == null) {
                System.out.println("\n--- Nueva Venta ---");
                System.out.print("Ingrese idVenta: ");
                ventas[i][0] = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese idTicket: ");
                ventas[i][1] = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese cantidad: ");
                int cant = ValidadorDeTipo.ValidarEnteros();
                ventas[i][2] = String.valueOf(cant);

                System.out.print("Ingrese precioUnitario: ");
                double precioUnit = Double.parseDouble(ValidadorDeTipo.ValidarString());
                ventas[i][3] = String.valueOf(precioUnit);

                double total = cant * precioUnit;
                ventas[i][4] = String.valueOf(total);

                System.out.println("Venta creada con éxito. Total calculado: " + total);
                return;
            }
        }
        System.out.println("No hay espacio para más ventas.");
    }

    public static void consultarVentas() {
        for (int i = 0; i < encabezadosVentas.length; i++) {
            System.out.print(encabezadosVentas[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][0] != null) {
                for (int j = 0; j < ventas[i].length; j++) {
                    System.out.print(ventas[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void consultarVentasPorId() {
        System.out.print("Ingrese el ID de la venta: ");
        String idBuscarVenta = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][0] != null && ventas[i][0].equals(idBuscarVenta)) {
                for (int j = 0; j < ventas[i].length; j++) {
                    System.out.println(encabezadosVentas[j] + ": " + ventas[i][j]);
                }
                return;
            }
        }
        System.out.println("Venta no encontrada.");
    }

    public static void actualizarVentas() {
        System.out.print("Ingrese el ID de la venta que desea actualizar: ");
        String idBuscarVenta = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][0] != null && ventas[i][0].equals(idBuscarVenta)) {
                System.out.print("Ingrese nuevo idTicket: ");
                ventas[i][1] = ValidadorDeTipo.ValidarString();

                System.out.print("Ingrese nueva cantidad: ");
                int cant = ValidadorDeTipo.ValidarEnteros();
                ventas[i][2] = String.valueOf(cant);

                System.out.print("Ingrese nuevo precioUnitario: ");
                double precioUnit = Double.parseDouble(ValidadorDeTipo.ValidarString());
                ventas[i][3] = String.valueOf(precioUnit);

                double total = cant * precioUnit;
                ventas[i][4] = String.valueOf(total);

                System.out.println("Venta actualizada correctamente.");
                return;
            }
        }
        System.out.println("Venta no encontrada.");
    }

    public static void eliminarVenta() {
        System.out.print("Ingrese el ID de la venta que desea eliminar: ");
        String idEliminar = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][0] != null && ventas[i][0].equals(idEliminar)) {
                for (int j = 0; j < ventas[i].length; j++) {
                    ventas[i][j] = null;
                }
                System.out.println("Venta eliminada correctamente.");
                return;
            }
        }
        System.out.println("Venta no encontrada.");
    }


    // ================= MÉTODOS DE CAJERO =================
    public static void registrarCajero() {
        if (rol == null && password == null) {
            System.out.print("Ingrese el usuario (rol): ");
            rol = ValidadorDeTipo.ValidarString();

            System.out.print("Ingrese el password: ");
            password = ValidadorDeTipo.ValidarString();

            System.out.println("Cajero registrado correctamente.");
        } else {
            System.out.println("Ya existe un cajero registrado.");
        }
    }

    public static void consultarCajero() {
        if (rol != null && password != null) {
            System.out.println("Rol del cajero: " + rol);
        } else {
            System.out.println("No hay un cajero registrado.");
        }
    }

    public static void actualizarCajero() {
        if (rol != null && password != null) {
            System.out.print("Ingrese el nuevo rol del cajero: ");
            rol = ValidadorDeTipo.ValidarString();

            System.out.print("Ingrese el nuevo password: ");
            password = ValidadorDeTipo.ValidarString();

            System.out.println("Cajero actualizado correctamente.");
        } else {
            System.out.println("No hay un cajero registrado.");
        }
    }

    public static void eliminarCajero() {
        if (rol != null && password != null) {
            rol = null;
            password = null;
            System.out.println("Cajero eliminado correctamente.");
        } else {
            System.out.println("No hay un cajero registrado.");
        }
    }

    public static boolean iniciarsesion() {
        if (rol != null && password != null) {
            System.out.print("Ingrese el usuario: ");
            String rolIngresado = ValidadorDeTipo.ValidarString();

            System.out.print("Ingrese el password: ");
            String passwordIngresado = ValidadorDeTipo.ValidarString();

            if (rol.equals(rolIngresado) && password.equals(passwordIngresado)) {
                System.out.println("Inicio de sesion exitoso\n");
                return true;
            } else {
                System.out.println("Rol o password incorrectos.");
                return false;
            }
        } else {
            System.out.println("No hay un cajero registrado. Por favor regístrese primero.");
            return false;
        }
    }
}