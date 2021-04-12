package Company;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static Agenda agenda = new Agenda();

    public static void main(String[] args) {

       

        ControladorMenu controladorMenu = new ControladorMenu();
        while (controladorMenu.pintar()) {
            // Continua
        }
    }
}

/*
 * 
 * Nota Titulo Contenido
 * 
 * Lista de notas
 * 
 * Menu Opcion
 * 
 * Pantalla PantallaBusqueda Pantalla.....
 * 
 * Titulo
 * 
 * LineaAsteriscos
 * 
 * Mensaje
 * 
 * Campo CampoLineaTexto CampoMultiLinea CampoNumerico CampoAnyKey
 * 
 */