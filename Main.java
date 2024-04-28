import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    

    public static void main(String[] args) {
        // Crear instancias de estudiantes y clubes (datos de ejemplo)
        Estudiante juan = new Estudiante("Juan", Arrays.asList("Musical", "Deportiva"), Arrays.asList("Marimba", "Futsal"));
        Estudiante maria = new Estudiante("Maria", Arrays.asList("Musical", "Artística"), Arrays.asList("Coro Voces del Valle"));
    
        Map<String, Club> grafo = new HashMap<>();
        grafo.put("Marimba", new Club("Marimba", "Musical", Arrays.asList("Miércoles 18:15-19:45", "Viernes 14:15-16:30")));
        grafo.put("Futsal", new Club("Futsal", "Deportiva", Arrays.asList("Lunes y miércoles 15:00-16:30")));
        grafo.put("Coro Voces del Valle", new Club("Coro Voces del Valle", "Musical", Arrays.asList("Martes 15:30-17:30", "Sábado 13:00-15:00")));
    
        // Recomendar clubes para los estudiantes
        RecomendadorClubes recomendador = new RecomendadorClubes();
        List<String> recomendacionesJuan = recomendador.recomendacionClubes(juan, grafo);
        List<String> recomendacionesMaria = recomendador.recomendacionClubes(maria, grafo);
    
        // Imprimir recomendaciones
        System.out.println("Recomendaciones para Juan: " + recomendacionesJuan);
        System.out.println("Recomendaciones para Maria: " + recomendacionesMaria);
    }
}
