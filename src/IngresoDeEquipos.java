import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngresoDeEquipos {
    public static List<String> ingresarEquipos(Scanner scanner, int numeroEquipos) throws IOException {
        List<String> equipos = new ArrayList<>();
        for (int i = 1; i <= numeroEquipos; i++) {
            System.out.print("Ingrese el nombre del equipo " + i + ": ");
            String equipo = scanner.nextLine();
            equipos.add(equipo); // Agregando equipos a la lista
        }
        return equipos;
    }
}
