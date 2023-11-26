package clases;

public class objeto {

    String nombre;
    String apellido;
    int rut ;
    String fechanac;
    String correo;
    String usuario;
    String contraseña;
    String confcontraseña;

    //Me faltan los botones , preguntar


    // luego se crea un constructor vacio por que firebase lo usa para traer informacion  , para hacer ge ty todo eso
    //PREGUNTAR COMO HACER CONSTRUCTOR VACIO

    //este constructor es para enviar informacion

    public objeto () {

    }

    public objeto(String nombre, String apellido, int rut, String fechanac, String correo, String usuario, String contraseña, String confcontraseña) {
    this.nombre=nombre;
    this.apellido=apellido;
    this.rut=rut;
    this.fechanac=fechanac;
    this.correo=correo;
    this.usuario=usuario;
    this.contraseña=contraseña;
    this.confcontraseña=confcontraseña;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfcontraseña() {
        return confcontraseña;
    }

    public void setConfcontraseña(String confcontraseña) {
        this.confcontraseña = confcontraseña;
    }
}

//enviar informacion hay que señalizar

