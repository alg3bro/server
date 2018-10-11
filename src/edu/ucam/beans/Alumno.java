package edu.ucam.beans;

public class Alumno {
	public Alumno(String nombre, String id, String dni, int nota) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.dni = dni;
		this.nota = nota;
	}
	private String nombre;
	private String id;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	private String dni;
	private int nota;

}
