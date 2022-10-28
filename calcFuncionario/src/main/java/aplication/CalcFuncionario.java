/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aplication;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jomar
 */
public class CalcFuncionario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        FuncionarioClass func = new FuncionarioClass();
        
        System.out.println("Digite o nome do funcionário: ");
        func.setNome(teclado.nextLine());
        
        System.out.println("Digite o salário bruto: ");
        func.setSalarioBruto(teclado.nextDouble());
        
        System.out.println("Digite o valor do imposto: ");
        func.setImposto(teclado.nextDouble());
        
        System.out.println(func.getNome() + " " + func.salarioLiquido());
        
        System.out.println("Digite a porcetagem para o aumento do salário: ");
        func.aumentarSalario(teclado.nextBigDecimal());
        
        System.out.println(func.getNome() + " " + func.salarioLiquido());
        
        teclado.close();
        
    }
}
