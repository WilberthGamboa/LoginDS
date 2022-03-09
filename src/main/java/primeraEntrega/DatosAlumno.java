package primeraEntrega;

public class DatosAlumno {
  //  matrícula, primer apellido, segundo apellido y nombres.
  private String matricula;
  private String primerApellido;
  private String segundoApellido;
  private String nombres;
  
  //matrícula, nombre asignatura (en este caso Diseño de Software), y la calificación.
    private String asignatura;
    private String calificacion;




    
    public DatosAlumno(String matricula, String primerApellido, String segundoApellido, String nombres) {
        this.matricula = matricula;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombres = nombres;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public String getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    


    
}
