package main.java;

public class Pais {
	
	private Integer id;
	private String nombre;
	private Integer codigoDeArea;

	public Pais() {	
	}
	
	public Pais(Integer id, String nombre, Integer codigoArea) {
		this.id = id;
		this.nombre = nombre;
		this.codigoDeArea = codigoArea;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigoArea() {
		return codigoDeArea;
	}

	public void setCodigoArea(Integer codigoArea) {
		this.codigoDeArea = codigoArea;
	}
}
