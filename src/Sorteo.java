import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteo {
    public static List<String[]> sorteoPartidos(List<String> equipos) {
        List<String[]> partidos = new ArrayList<>();
        Collections.shuffle(equipos); // Mezclar los equipos aleatoriamente
        return sortear(equipos, partidos); // Llamada recursiva
    }

    private static List<String[]> sortear(List<String> equipos, List<String[]> partidos) {
        if (equipos.size() <= 1) return partidos; // Condición base de la recursión

        // Formar un partido con los dos primeros equipos
        String[] partido = {equipos.get(0), equipos.get(1)};
        partidos.add(partido);

        // Remover los equipos ya emparejados
        equipos.remove(0);
        equipos.remove(0);

        // Llamada recursiva con el resto de equipos
        return sortear(equipos, partidos);
    }
}
