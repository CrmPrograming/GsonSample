package dad.maven.gson;

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
