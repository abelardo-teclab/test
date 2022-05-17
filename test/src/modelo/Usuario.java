package modelo;

public abstract class Usuario {

    // ATRIBUTOS
    String nombre;
    String apellido;
    String contrasena;
    int rol;

    // CONSTRUCTOR

    public Usuario(String nombre, String apellido, String contrasena, int rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.rol = rol;
    }


    // METODOS

    public void modificarRegistro(String nombre, String nombreUsuario, String contrasena, int rol){
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.rol = rol;
    }

}
