package co.uptc.vet.negocio;

public class Cliente {
	private String nombre;
	private String primerApellido;
	private String secundoApellido;
	private String telefono;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSecundoApellido() {
		return secundoApellido;
	}
	public void setSecundoApellido(String secundoApellido) {
		this.secundoApellido = secundoApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", primerApellido=" + primerApellido + ", secundoApellido="
				+ secundoApellido + ", telefono=" + telefono + "]";
	}
	
	
	

}
