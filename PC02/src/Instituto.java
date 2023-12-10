import java.util.*;
class Instituto {
    private List<Alumno> listaAlumnos;
    private List<Curso> listaCursos;


    public Instituto() {
        listaAlumnos = new ArrayList<>();
        listaCursos = new ArrayList<>();
    }


    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }


    public void agregarCurso(Curso curso) {
        listaCursos.add(curso);
    }


    public void imprimirDatosCurso(String codigoCurso) throws CursoNoEncontradoException {
        boolean encontrado = false;
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                encontrado = true;
                System.out.println("Nombre del curso: " + curso.getNombre());
                System.out.println("Código del curso: " + curso.getCodigo());
                System.out.println("Es electivo: " + curso.esElectivo());
                break;
            }
        }
        if (!encontrado) {
            throw new CursoNoEncontradoException("El código del curso no existe");
        }
    }
}


