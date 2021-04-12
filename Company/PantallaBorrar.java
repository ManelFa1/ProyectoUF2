package Company;

public class PantallaBorrar {

        void pintar() {
            System.out.println("---- Eliminar un contacto ----");

            System.out.print("Escribe el nombre y apellido del contacto >> ");
            String nombre = Main.scanner.next();
            String apellido = Main.scanner.next();


            Contacto contactoencontrado = Main.agenda.buscarContacto(nombre, apellido);
            if (contactoencontrado.nombre.equals("vacio")) { // Si el que has encontrado es el que viene por defecto
                System.out.println("No lo he encontrado");
                return; // Acabar aqui la instruccion, no sigas
            } else {
                Main.agenda.delContacto(contactoencontrado);
                System.out.println("Contacto borrado");
            }
        }
    }
