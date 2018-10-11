package edu.ucam.beans;

public class Curso {
	public Curso(String nombre, String id, int edad, int alumnos) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.alumnos = alumnos;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}
	private int edad;
	private int alumnos;

}
