package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scann = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.print("Digite o nome do funcionário: ");
		func.setName(scann.nextLine());
		
		System.out.print("Digite o salário: ");
		func.setGrossSalary(scann.nextDouble());
		
		System.out.println("Digite o imposto: ");
		func.setTax(scann.nextDouble());
		
		System.out.printf("Salário autalizado: %.3f", func.getGrossSalary());

		func.netSalary();
		
		System.out.println("Em quanto aumentara o salário (porcentagem): ");
		func.increaseSalary(scann.nextDouble());
		
		System.out.printf("Salário autalizado: %.3f", func.getGrossSalary());
		
		System.out.println("");
		
		
		
		
		
		

	}

}
