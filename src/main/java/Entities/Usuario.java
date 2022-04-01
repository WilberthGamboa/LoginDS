package Entities;

import java.util.Timer;
import java.util.TimerTask;

public class Usuario {
    private String usuario;
    private String contrasenia;
    private int intentos;
    Timer timer;

    public Usuario(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.intentos = 0;
        this.timer = new Timer();

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void iniciarBloqueo() {

        TimerTask tarea = new TimerTask() {
            public void run() {
                setIntentos(0);

            }
        };

        timer.schedule(tarea, 10000);

    }

}
