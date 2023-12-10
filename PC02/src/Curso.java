class Curso {
    private String codigo;
    private String nombre;
    private boolean esElectivo;


    public Curso(String codigo, String nombre, boolean esElectivo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.esElectivo = esElectivo;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esElectivo() {
        return esElectivo;
    }
}