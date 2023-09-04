import java.util.ArrayList;
import java.util.List;

class Clinica {
    private String nombre;
    private List<String> direcciones = new ArrayList<>();
    private String tipo;
    private List<EspecialidadMedica> especialidades = new ArrayList<>();

    public Clinica(String nombre, List<String> direcciones, String tipo) {
        this.nombre = nombre;
        this.direcciones = direcciones;
        this.tipo = tipo;
    }

    public void agregarEspecialidad(EspecialidadMedica especialidad) {
        especialidades.add(especialidad);
    }

    public List<Medico> obtenerMedicos() {
        List<Medico> medicosClinica = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidades) {
            medicosClinica.addAll(especialidad.getMedicos());
        }
        return medicosClinica;
    }

    public List<Administrativo> obtenerAdministrativos() {
        List<Administrativo> administrativosClinica = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidades) {
            administrativosClinica.addAll(especialidad.getAdministrativos());
        }
        return administrativosClinica;
    }

    public List<Medico> obtenerMedicosPorEspecialidad(String nombreEspecialidad) {
        for (EspecialidadMedica especialidad : especialidades) {
            if (especialidad.getNombre().equalsIgnoreCase(nombreEspecialidad)) {
                return especialidad.getMedicos();
            }
        }
        return new ArrayList<>();
    }

    public Administrativo obtenerAdministrativoPorEspecialidad(String nombreEspecialidad, String rutAdministrativo) {
        for (EspecialidadMedica especialidad : especialidades) {
            if (especialidad.getNombre().equalsIgnoreCase(nombreEspecialidad)) {
                return especialidad.buscarAdministrativoPorRut(rutAdministrativo);
            }
        }
        return null;
    }
}
