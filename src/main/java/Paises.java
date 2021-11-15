package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Paises {

	List<Pais> paises;
	
	public Paises() {
		this.paises = new ArrayList<Pais>();
	}
	
	public Paises(List<Pais> paises) {
		this.paises = paises;
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

	public void agregarPais(Integer id, String nombre, Integer codigoArea) {
		
		Pais pais = new Pais(id, nombre, codigoArea);
		
		this.paises.add(pais);
	}
	
	public List<Integer> listarCodigosDeArea() {
		
		List<Integer> codigosDeArea = this.paises.stream().map(pais -> pais.getCodigoArea()).collect(Collectors.toList());
		
		return codigosDeArea;
	}
	
	public Optional<Pais> buscarPorCodigoDeArea(Integer codigoDeArea) {
		
		Optional<Pais> paisResultado = this.paises.stream().filter(pais -> pais.getCodigoArea().equals(codigoDeArea)).findFirst();
		
		return paisResultado;
	}
}
