package Utils;

import Entities.Usuario;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;

public class AdministradorUsuarios {

    private File archivo;
    private LinkedList<Usuario> listaUsuarios;
    

    public AdministradorUsuarios(File archivo) {
        this.archivo = archivo;
        this.listaUsuarios = new LinkedList<Usuario>();
    }

    public void crearUsuarios() {

        // Var leer doc
        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {

                String arreglo[] = linea.split(" ");
                Usuario e = new Usuario(arreglo[0], arreglo[1]);
                listaUsuarios.add(e);

                System.out.println(arreglo[0] + arreglo[1]);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo vacio");
            e.printStackTrace();

        }

    }

    public boolean verificarUsuario(String login, String contrasenia) {

        int contadorBloqueo = 0;
        boolean bandera = false;

        boolean banderaUsuarioEncontrado = false;

        try {
            final String claveEncriptacion = "secreto!";

            EncriptadorAES encriptador = new EncriptadorAES();
            for (int i = 0; i < listaUsuarios.size(); i++) {

                if (login.equals(listaUsuarios.get(i).getUsuario())) {
                    banderaUsuarioEncontrado = true;
                    if (!(isUsuarioBloqueado(listaUsuarios.get(i)))) {

                        String contraEncriptada = listaUsuarios.get(i).getContrasenia();
                        String contraDesencriptada = encriptador.desencriptar(contraEncriptada, claveEncriptacion);

                        if (contrasenia.equals(contraDesencriptada)) {

                            JOptionPane.showMessageDialog(null, "Bienvenido");
                            bandera = true;

                        } else {
                            listaUsuarios.get(i).setIntentos(listaUsuarios.get(i).getIntentos() + 1);
                            contadorBloqueo = listaUsuarios.get(i).getIntentos();
                            if (contadorBloqueo == 3) {
                                listaUsuarios.get(i).iniciarBloqueo();

                            }
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta",
                                    "ALERTA", JOptionPane.ERROR_MESSAGE);

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "TU USUARIO ESTÁ BLOQUEADO",
                                "ALERTA", JOptionPane.ERROR_MESSAGE);

                    }

                }

            }

            if (!banderaUsuarioEncontrado) {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado",
                        "ALERTA", JOptionPane.ERROR_MESSAGE);

            }

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException
                | IllegalBlockSizeException | BadPaddingException ex) {
           
        }

        return bandera;
    }

    private boolean isUsuarioBloqueado(Usuario e) {
        boolean bandera = false;

        if (e.getIntentos() == 3) {
            bandera = true;
        }

        return bandera;

    }

}
