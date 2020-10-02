package dad.maven.gsonsample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private Integer edad;
	
	/**
	 * Constructor por defecto de la clase.
	 * Delega en el constructor con parámetros,
	 * inicializando la persona a valores nulos.
	 */
	public Persona() {
		this(null, null, -1);
	}
	
	/**
	 * Constructor a modo de inicializador de la clase.
	 * 
	 * @param nom Nombre de la persona
	 * @param ap Apellidos de la persona
	 * @param ed Edad de la persona
	 */
	public Persona(String nom, String ap, Integer ed) {
		inicializar(nom, ap, ed);
	}
	
	/**
	 * Método encargado de inicializar los atributos de la clase
	 * con los valores dados por parámetro.
	 * 
	 * @param nom Nombre de la persona
	 * @param ap Apellidos de la persona
	 * @param ed Edad de la persona
	 */
	public void inicializar(String nom, String ap, Integer ed) {
		setNombre(nom);
		setApellidos(ap);
		setEdad(ed);
	}
	
	/**
	 * Método encargado de generar el JSON asociado a la clase
	 * y a sus valores.
	 * 
	 * @return String con el formato JSON
	 */
	public String toJSON() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return (gson.toJson(this));
	}
	
	// MÉTODOS GETTER Y SETTER DE LA CLASE
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
