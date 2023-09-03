package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Anna");
		list.add("Bob"); // adiciona na lista
		
		list.add(2, "Marco"); //Adicionar elementos na lista(em determinada posição)
		
		System.out.println(list.size()); // para ver o tamanho da lista
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------");
		list.remove(null); // remove da lista
		list.removeIf(x -> x.charAt(0) == 'M'); // vai remover todo mundo que começa com a letra M (Removedor predicado)
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // procurar na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // caso nao tenha ninguem na lista da isso aqui
		System.out.println("-------------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // mostra somente os nomes começados com A
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // encontrar o primeiro elemento com a letra desejada, se nao encontrar retorna nulo
sc.close();
	}

}
