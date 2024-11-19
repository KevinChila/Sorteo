public class Etapa {
    public static int obtenerNumeroEquipos(String etapa) {
        String etapaNormalizada = etapa.trim().toLowerCase();

        // Asignación del número de equipos según la etapa
        if (etapaNormalizada.contains("octavos")) {
            return 16;
        }
        if (etapaNormalizada.contains("cuartos")) {
            return 8;
        }
        if (etapaNormalizada.contains("semifinales")) {
            return 4;
        }
        return 0; // Devuelve 0 si la etapa no es válida
    }
}
