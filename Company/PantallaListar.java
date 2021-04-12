package Company;
public class PantallaListar {

    void pintar(){
        System.out.println("---- Contactos Guardados ----");

        for(Contacto contacto: Main.agenda.getContactos()){
            System.out.println(" Nombre: " + contacto.nombre + ", Apellido: " + contacto.apellido);
        }

    }
}