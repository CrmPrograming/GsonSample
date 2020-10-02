package dad.maven.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private Integer edad;
	
	public Persona() {
		this(null, null, -1);
	}
	
	public Persona(String nom, String ap, Integer ed) {
		inicializar(nom, ap, ed);
	}
	
	public void inicializar(String nom, String ap, Integer ed) {
		setNombre(nom);
		setApellidos(ap);
		setEdad(ed);
	}
	
	public String toJSON() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return (gson.toJson(this));
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
