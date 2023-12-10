public class Main {
    public static void main(String[] args) {
      
        Curso curso1 = new Curso("C001", "Matemáticas", false);
        Curso curso2 = new Curso("C002", "Historia", true);
        Curso curso3 = new Curso("C003", "Programación", false);


        Alumno alumno1 = new Alumno("A001", "Juan Pérez", 20);
        Alumno alumno2 = new Alumno("A002", "María García", 22);
        Alumno alumno3 = new Alumno("A003", "Luis González", 21);


        alumno1.asignarCurso(curso1);
        alumno2.asignarCurso(curso2);
        alumno3.asignarCurso(curso3);


        Instituto instituto = new Instituto();


        instituto.agregarAlumno(alumno1);
        instituto.agregarAlumno(alumno2);
        instituto.agregarAlumno(alumno3);

        instituto.agregarCurso(curso1);
        instituto.agregarCurso(curso2);
        instituto.agregarCurso(curso3);


        try {
            instituto.imprimirDatosCurso("C002");
        } catch (CursoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}