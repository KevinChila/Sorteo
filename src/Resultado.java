import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Resultado {
    public static void mostrarPartidos(List<String[]> partidos, String etapa) {
        System.out.println("Partidos de la etapa de " + etapa + ":");
        for (String[] partido : partidos) {
            System.out.println(partido[0] + " vs " + partido[1]);
        }
    }

    public static void guardarResultados(List<String[]> partidos, String etapa) throws IOException {
        String nombreArchivo = "resultados_" + etapa + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Escribir en el archivo con BufferedWriter
            for (String[] partido : partidos) {
                writer.write(partido[0] + " vs " + partido[1]);
                writer.newLine(); // Agrega una nueva línea en el archivo
            }
        } catch (IOException e) {
            // Propagar la excepción con un mensaje detallado
            throw new IOException("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
