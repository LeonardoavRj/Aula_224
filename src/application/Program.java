package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		//Version
		//Implementação da interface
		//List<String> name = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//Reference method com método estático
		//List<String> name = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
		
		//Reference method com método não estático
		//List<String> name = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
		
		//Expressão Lambda
		
		//Function <Product,String> func = p -> p.getName().toUpperCase();
		//List<String> name = list.stream().map(func).collect(Collectors.toList());
		
		//Expressão inline Lambda
		
			List<String> name = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
						
		//Impressão da Lista
		name.forEach(System.out::println);
	}

}
