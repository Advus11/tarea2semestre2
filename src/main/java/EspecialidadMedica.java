import java.util.ArrayList;
import java.util.List;
class EspecialidadMedica {
    private String nombre;
    private double latitud;
    private double longitud;
    private List<Medico> medicos = new ArrayList<>();
    private List<Administrativo> administrativos = new ArrayList<>();

    public EspecialidadMedica(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        administrativos.add(administrativo);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public Administrativo buscarAdministrativoPorRut(String rut) {
        for (Administrativo administrativo : administrativos) {
            if (administrativo.getRut().equalsIgnoreCase(rut)) {
                return administrativo;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }
}
