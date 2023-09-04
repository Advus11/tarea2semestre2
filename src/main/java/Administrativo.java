class Administrativo extends Trabajador {
    private String correoElectronico;

    public Administrativo(String tituloProfesional, String nombre, String direccion,
                          String estadoCivil, String rut, String horarioTrabajo,
                          String correoElectronico) {
        this.tituloProfesional = tituloProfesional;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horarioTrabajo = horarioTrabajo;
        this.correoElectronico = correoElectronico;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }
}
