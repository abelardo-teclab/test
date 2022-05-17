package modelo;

public class Administrador extends Usuario {

    // ATRIBUTOS
    int id;
    byte permisos;

    // CONSTRUCTOR
    public Administrador(String nombre, String apellido, String contrasena, int rol) {
        super(nombre, apellido, contrasena, rol);
    }

}
