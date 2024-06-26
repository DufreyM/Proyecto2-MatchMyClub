import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        // Crear instancias de estudiantes y clubes (datos de ejemplo)
        Estudiante juan = new Estudiante("Juan", Arrays.asList("Musical", "Deportiva"), Arrays.asList("Marimba", "Futsal"), Arrays.asList("cantar", "bailar"), Estudiante.Afluencia.MODERADA);
        Estudiante maria = new Estudiante("Maria", Arrays.asList("Musical", "Artística"), Arrays.asList("Coro Voces del Valle"), Arrays.asList("tocar", "escuchar"), Estudiante.Afluencia.ALTA);
    
        Map<String, Club> grafo = new HashMap<>();
        grafo.put("Marimba", new Club("Marimba", "Musical", Arrays.asList("Miércoles 18:15-19:45", "Viernes 14:15-16:30"), "tocar"));
        grafo.put("Futsal", new Club("Futsal", "Deportiva", Arrays.asList("Lunes y miércoles 15:00-16:30"), "correr"));
        grafo.put("Coro Voces del Valle", new Club("Coro Voces del Valle", "Musical", Arrays.asList("Martes 15:30-17:30", "Sábado 13:00-15:00"), "cantar"));
    
        gestorUsuarios.registrarUsuario("Majo", "12345", maria);
        
        gestorUsuarios.registrarUsuario("Juan", "67890", juan);

        Usuario usuario = gestorUsuarios.iniciarSesion("Juan", "67890");
        if (usuario != null) {
            System.out.println("Bienvenido, " + usuario.getNombreUsuario() + "!");
            System.out.println("Nombre del estudiante asociado: " + usuario.getEstudiante().getNombre());
            
            // Recomendar clubes para el usuario que ha iniciado sesión
            RecomendadorClubes recomendador = new RecomendadorClubes();
            List<String> recomendaciones = recomendador.recomendacionClubes(usuario.getEstudiante(), grafo);
            
            // Imprimir recomendaciones
            System.out.println("Recomendaciones para " + usuario.getEstudiante().getNombre() + ": " + recomendaciones);
        } else {
            System.out.println("Inicio de sesión fallido.");
        }
    }
}
