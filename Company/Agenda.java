package Company;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    public Agenda () {
        contactos= new ArrayList<Contacto>();
        inicializaragenda();
    }

    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }
    public void delContacto(Contacto contacto) {this.contactos.remove(contacto);}

    public List<Contacto> getContactos() {
        return this.contactos;
    }
     public Contacto buscarContacto(String nombre, String apellido) {
        Contacto contactoEncontrado = new Contacto("vacio", "", "", "");

        for (Contacto contacto : this.contactos) {
            if (contacto.nombre.equals(nombre) && contacto.apellido.equals(apellido)) { // Si el nombre y apellido del contacto coincide con la busqueda
                contactoEncontrado = contacto;
            }
        }
        return contactoEncontrado;
    }

    public void inicializaragenda() {
        Contacto contacto1 = new Contacto("Juan", "Sanchez", "Barcelona", "621457668");
        Contacto contacto2 = new Contacto("Ramon", "Suarez", "Madrid", "621467398");
        Contacto contacto3 = new Contacto("Paco", "Trujillo", "Mostoles", "623467761");
        addContacto(contacto1);
        addContacto(contacto2);
        addContacto(contacto3);
    }
}