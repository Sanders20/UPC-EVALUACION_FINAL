class Alumno {
    private String codigo;
    private String nombres;
    private int edad;
    private Curso cursoAsignado;


    public Alumno(String codigo, String nombres, int edad) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.edad = edad;
    }


    public void asignarCurso(Curso curso) {
        this.cursoAsignado = curso;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public Curso getCursoAsignado() {
        return cursoAsignado;
    }
}