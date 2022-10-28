
package aplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FuncionarioClass {
    private String nome; 
    private double salarioBruto;
    private double imposto; 
    
    public double salarioLiquido(){
        BigDecimal salarioBruto = new BigDecimal(this.salarioBruto);
        BigDecimal imposto = new BigDecimal(this.imposto);
        return salarioBruto.subtract(imposto).doubleValue();
    }
    
    public double aumentarSalario(BigDecimal porcentagem){
       BigDecimal salarioBruto = new BigDecimal(this.salarioBruto);
       BigDecimal percentageAmount = porcentagem.multiply(salarioBruto.divide(new BigDecimal(100)));
       percentageAmount.setScale(2, RoundingMode.HALF_EVEN);
       this.salarioBruto = salarioBruto.add(percentageAmount).doubleValue();
       return this.salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    
}
