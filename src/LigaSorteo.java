import java.io.*;
import java.util.*;

public class LigaSorteo {
    public static void main(String[] args) {
        try {
            // Solicitar al usuario la etapa del torneo
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la etapa del torneo (octavos, cuartos, semifinales): ");
            String etapa = scanner.nextLine().toLowerCase();

            // Obtener el número de equipos según la etapa seleccionada
            int numeroEquipos = Etapa.obtenerNumeroEquipos(etapa);
            if (numeroEquipos == 0) {
                extracted(); // Lanza una excepción personalizada si la etapa es inválida
            }

            // Ingreso de nombres de los equipos
            List<String> equipos = IngresoDeEquipos.ingresarEquipos(scanner, numeroEquipos);

            // Realizar el sorteo aleatorio de los equipos
            List<String[]> partidos = Sorteo.sorteoPartidos(equipos);

            // Mostrar los partidos sorteados
            Resultado.mostrarPartidos(partidos, etapa);

            // Guardar los resultados de los partidos en un archivo de texto
            Resultado.guardarResultados(partidos, etapa);

        } catch (EtapaIncorrecta e) {
            // Manejo de excepciones personalizadas
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            // Manejo de excepciones de entrada/salida
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (Exception e) {
            // Captura de excepciones generales para evitar que el programa falle inesperadamente
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    // Método para lanzar una excepción personalizada
    private static void extracted() throws EtapaIncorrecta {
        throw new EtapaIncorrecta("Etapa no válida. Intente nuevamente.");
    }
}
