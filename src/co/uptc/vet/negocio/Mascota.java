package co.uptc.vet.negocio;

import java.util.Date;

public class Mascota  {

	private String nombre;
	private String edad;
	private String tipoAnimal;
	private String raza;
	private String Sintomas;
	private Date fechaIngreso;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getSintomas() {
		return Sintomas;
	}

	public void setSintomas(String sintomas) {
		Sintomas = sintomas;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", tipoAnimal=" + tipoAnimal + ", raza=" + raza
				+ ", Sintomas=" + Sintomas + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
}
