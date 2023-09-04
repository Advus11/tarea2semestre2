import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Clinica XYZ", new ArrayList<>(), "Tipo de Clínica");

        EspecialidadMedica especialidad1 = new EspecialidadMedica("Cardiología", 123.45, 67.89);
        EspecialidadMedica especialidad2 = new EspecialidadMedica("Dermatología", 98.76, 54.32);

        Medico medico1 = new Medico("Médico General", "Dr. Juan Perez", "Dirección 1",
                "Soltero", "12345678-9", "Horario 1", "Generalista", "Horario Atención 1", especialidad1);

        Medico medico2 = new Medico("Cardiólogo", "Dr. Maria Rodriguez", "Dirección 2",
                "Casado", "98765432-1", "Horario 2", "Cardiología", "Horario Atención 2", especialidad1);

        Administrativo admin1 = new Administrativo("Secretaria", "Ana López", "Dirección 3",
                "Casada", "87654321-0", "Horario 3", "correo1@example.com");

        Administrativo admin2 = new Administrativo("Recepcionista", "Pedro Ramirez", "Dirección 4",
                "Soltero", "76543210-2", "Horario 4", "correo2@example.com");

        especialidad1.agregarMedico(medico1);
        especialidad1.agregarMedico(medico2);
        especialidad1.agregarAdministrativo(admin1);
        especialidad2.agregarAdministrativo(admin2);

        clinica.agregarEspecialidad(especialidad1);
        clinica.agregarEspecialidad(especialidad2);
        
        System.out.println("Médicos en la clínica:");
        List<Medico> medicosClinica = clinica.obtenerMedicos();
        for (Medico medico : medicosClinica) {
            System.out.println(medico.getNombre());
        }

        System.out.println("\nAdministrativos en la clínica:");
        List<Administrativo> administrativosClinica = clinica.obtenerAdministrativos();
        for (Administrativo admin : administrativosClinica) {
            System.out.println(admin.getNombre());
        }

        String nombreEspecialidad = "Cardiología";
        System.out.println("\nMédicos en la especialidad " + nombreEspecialidad + ":");
        List<Medico> medicosPorEspecialidad = clinica.obtenerMedicosPorEspecialidad(nombreEspecialidad);
        for (Medico medico : medicosPorEspecialidad) {
            System.out.println(medico.getNombre());
        }

        String rutAdministrativo = "87654321-0";
        System.out.println("\nAdministrativo en la especialidad " + nombreEspecialidad + " con Rut " + rutAdministrativo + ":");
        Administrativo adminPorEspecialidad = clinica.obtenerAdministrativoPorEspecialidad(nombreEspecialidad, rutAdministrativo);
        if (adminPorEspecialidad != null) {
            System.out.println(adminPorEspecialidad.getNombre());
        } else {
            System.out.println("No se encontró ningún administrativo con ese Rut en la especialidad " + nombreEspecialidad);
        }
    }
}
