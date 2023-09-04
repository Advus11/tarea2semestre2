abstract class Trabajador {
    protected String tituloProfesional;
    protected String nombre;
    protected String direccion;
    protected String estadoCivil;
    protected String rut;
    protected String horarioTrabajo;

    public abstract String getTipo();

    public String getRut() {
        return rut;
    }
}
