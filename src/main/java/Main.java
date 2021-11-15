package main.java;

import java.time.Clock;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Paises paises = new Paises();
		List<Integer> codigosDeArea;
		Scanner input = new Scanner(System.in);
		Integer codigoDeArea;
		Optional<Pais> paisEncontrado;
		
		System.out.println("Desafío: Países de Latinoamérica");
		System.out.println("\nInicio de la ejecución del programa: " + Clock.systemUTC().instant());
		
		//Agrego paises
		paises.agregarPais(1, "Argentina", 54);
		paises.agregarPais(2, "Chile", 56);
		paises.agregarPais(3, "Uruguay", 598);
		paises.agregarPais(4, "Bolivia", 591);
		paises.agregarPais(5, "Paraguay", 595);
		paises.agregarPais(6, "Brasil", 55);
		
		//Pongo los código de área en la lista
		codigosDeArea = paises.listarCodigosDeArea();
		System.out.println("\nLos códigos de áreas registrados son: " + codigosDeArea.toString());
		
		//Busco por código de área
		System.out.println("\nIngrese el código de área del país que desea buscar (solo el número): ");
		try {
			codigoDeArea = input.nextInt();
			paisEncontrado = paises.buscarPorCodigoDeArea(codigoDeArea);
			
			if (paisEncontrado.isPresent())
				System.out.println("\nIngreso el código de área de " + paisEncontrado.get().getNombre());
			else
				System.out.println("\nNo existe un país registrado con el código de área ingresado");
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Valor ingresado inválido, debe ingresar un número entero");
		}
		
		input.close();
		System.out.println("\nFinalización de la ejecución del programa: " + Clock.systemUTC().instant());
	}
}
