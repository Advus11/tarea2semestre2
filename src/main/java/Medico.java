import java.util.ArrayList;
import java.util.List;
class Medico extends Trabajador {
    private String especializacion;
    private String horarioAtencion;
    private List<String> pacientesAsignados = new ArrayList<>();
    private EspecialidadMedica especialidad;

    public Medico(String tituloProfesional, String nombre, String direccion,
                  String estadoCivil, String rut, String horarioTrabajo,
                  String especializacion, String horarioAtencion, EspecialidadMedica especialidad) {
        this.tituloProfesional = tituloProfesional;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horarioTrabajo = horarioTrabajo;
        this.especializacion = especializacion;
        this.horarioAtencion = horarioAtencion;
        this.especialidad = especialidad;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Médico";
    }
}
