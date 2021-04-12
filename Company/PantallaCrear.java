package Company;


public class PantallaCrear {

    void pintar() {

        boolean permitido = false;
        String nombre = "";

        System.out.println(" ---- Crear contacto ----");


        System.out.println("Escribe un nombre");
        // Unico valor obligatorio. No puede ser cadena vacia
        while (!permitido) {
            nombre = Main.scanner.nextLine();
            if (!nombre.isEmpty()) {
                permitido = true;
            }else{
                System.out.println("No puede ser vacio");
            }
        }

        // Recojo los siguientes datos
        System.out.println("Escribe un apellido");
        String apellido = Main.scanner.nextLine();
        System.out.println("Escribe una ciudad");
        String ciudad = Main.scanner.nextLine();
        System.out.println("Escribe un telefono");
        String telefono = Main.scanner.nextLine();

        // Creo el contacto
        Contacto contacto = new Contacto(nombre, apellido, ciudad, telefono);
        
        // Añado el contacto
        Main.agenda.addContacto(contacto);
        

        System.out.println(" ---- El contacto se ha creado ----");
    }
}
