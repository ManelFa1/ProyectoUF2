package Company;

public class PantallaBuscar {

    void pintar() {
        System.out.println("---- Buscar un contacto ----");

        System.out.print("Escribe el nombre y apellido del contacto >> ");
        String nombre = Main.scanner.next();
        String apellido = Main.scanner.next();


        Contacto contactoencontrado = Main.agenda.buscarContacto(nombre, apellido);
        if (contactoencontrado.nombre.equals("vacio")) { // Si el que has encontrado es el que viene por defecto
            System.out.println("No lo he encontrado");
            return; // Acabar aqui la instruccion, no sgigas
        } else {
            System.out.println("He encontrado el contacto. Nombre: " + contactoencontrado.nombre + ", Apellido: "
                    + contactoencontrado.apellido + ", Ciudad: " + contactoencontrado.ciudad + ", Telefono: "
                    + contactoencontrado.telefono);
        }

    }
}
