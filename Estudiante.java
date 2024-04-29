import java.util.List;

public class Estudiante {
    private String nombre;
    private List<String> intereses;
    private List<String> clubesAsistidos;
    private List<String> accionesPreferidas;
    private Afluencia afluenciaPreferida;
    //Agregar pérfil psicológico
    //Agregar disponibilidad de horario
    //Agregar carrera 
    //Agregar edad
    //Agregar género
    
    public Estudiante(String nombre, List<String> intereses, List<String> clubesAsistidos,
            List<String> accionesPreferidas, Afluencia afluenciaPreferida) {
        this.nombre = nombre;
        this.intereses = intereses;
        this.clubesAsistidos = clubesAsistidos;
        this.accionesPreferidas = accionesPreferidas;
        this.afluenciaPreferida = afluenciaPreferida;
    }
    
    public enum Afluencia {
        ALTA,
        MODERADA,
        BAJA
    }
    
    public List<String> getAccionesPreferidas() {
        return accionesPreferidas;
    }

    public void setAccionesPreferidas(List<String> accionesPreferidas) {
        this.accionesPreferidas = accionesPreferidas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(List<String> intereses) {
        this.intereses = intereses;
    }

    public List<String> getClubesAsistidos() {
        return clubesAsistidos;
    }

    public void setClubesAsistidos(List<String> clubesAsistidos) {
        this.clubesAsistidos = clubesAsistidos;
    }

    public Afluencia getAfluenciaPreferida() {
        return afluenciaPreferida;
    }

    public void setAfluenciaPreferida(Afluencia afluenciaPreferida) {
        this.afluenciaPreferida = afluenciaPreferida;
    }
}
