package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Gabriel");
		list.add("Zeide");
		list.add("Mateus");
		list.add("Daniel");
		list.add("Gustavo");
		list.add("Gabriela");
		list.add("Lilian");
		list.add("Denis");
		list.add("Marcos");
		list.add("Cleide");
		list.add("Ricardo");
		list.add("Ana");
		list.add(4, "Lindomar"); // adiciona com uma parametro de posição.
		list.remove(4); // remove usando a posição como parametro de busca.
		list.remove("Carlos"); // remove usando o valor como paramtro de busca.
		list.removeIf(x -> x.length() > 15); // remove usando uma expressão lambda como paramentro.

		for (String nome : list) {

			System.out.println(nome);
		} // percorre todos os nomes da lista
		
		
		
		// PERCORRER LISTA POR FILTRO

		
		System.out.println("-------------------------------------");
		List<String> filter = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());

		for (String nome : filter) {

			System.out.println(nome);
		} 
	
		// Encontra o primeiro valor que obdece a operação Lambda.
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		
		System.out.println("-------------------------------------");
		System.out.println(nome);
		System.out.println();
		System.out.println("--End--");

	}

}