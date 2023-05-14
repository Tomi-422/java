package ej9_guia2;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private String domicilio;
	
	public Persona (String dni) {
		this.dni = (dni);
	}
	
	
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getDomicilio() {
        return domicilio;
    }

    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

}
