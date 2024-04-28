import java.util.List;

public class Club {
    String nombre;
    String categoria;
    List<String> horario;
    //Agregar recomendación de Pablo, sobre la afluencia de personas al club. 
    

    public Club(String nombre, String categoria, List<String> horario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.horario = horario;
    }
}