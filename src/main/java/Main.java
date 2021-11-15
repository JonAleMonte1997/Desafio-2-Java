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
		
		System.out.println("Desaf�o: Pa�ses de Latinoam�rica");
		System.out.println("\nInicio de la ejecuci�n del programa: " + Clock.systemUTC().instant());
		
		//Agrego paises
		paises.agregarPais(1, "Argentina", 54);
		paises.agregarPais(2, "Chile", 56);
		paises.agregarPais(3, "Uruguay", 598);
		paises.agregarPais(4, "Bolivia", 591);
		paises.agregarPais(5, "Paraguay", 595);
		paises.agregarPais(6, "Brasil", 55);
		
		//Pongo los c�digo de �rea en la lista
		codigosDeArea = paises.listarCodigosDeArea();
		System.out.println("\nLos c�digos de �reas registrados son: " + codigosDeArea.toString());
		
		//Busco por c�digo de �rea
		System.out.println("\nIngrese el c�digo de �rea del pa�s que desea buscar (solo el n�mero): ");
		try {
			codigoDeArea = input.nextInt();
			paisEncontrado = paises.buscarPorCodigoDeArea(codigoDeArea);
			
			if (paisEncontrado.isPresent())
				System.out.println("\nIngreso el c�digo de �rea de " + paisEncontrado.get().getNombre());
			else
				System.out.println("\nNo existe un pa�s registrado con el c�digo de �rea ingresado");
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Valor ingresado inv�lido, debe ingresar un n�mero entero");
		}
		
		input.close();
		System.out.println("\nFinalizaci�n de la ejecuci�n del programa: " + Clock.systemUTC().instant());
	}
}
