package Company;

public class ControladorMenu {

    boolean pintar() {
        boolean opcionvalida = false;
        int opcion = 0;
        System.out.println("------- Elige una opcion ------ ");

        System.out.println("1. Añadir contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Listar contactos");
        System.out.println("5. Salir");

        while (!opcionvalida) {
            opcion = Main.scanner.nextInt();

            if (opcion < 0 && opcion > 5) {
                System.out.println("Elige una opcion correcta!");
            } else { // Si la opcion es correcta
                opcionvalida = true;
            }
        }

        if (opcion == 1) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.pintar();
        } else if (opcion == 2) {
            PantallaBorrar pantallaBorrar = new PantallaBorrar();
            pantallaBorrar.pintar();
        } else if (opcion == 3) {
            PantallaBuscar PantallaBuscar = new PantallaBuscar();
            PantallaBuscar.pintar();
        } else if (opcion == 4) {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.pintar();
        } else {
            return false;
        }
        return true;
    }
}
