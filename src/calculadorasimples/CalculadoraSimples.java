/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasimples;

/**
 *
 * @author Andre Santos
 */
public class CalculadoraSimples {
     private double operando1;
     private double operando2;
     private double total;

    public CalculadoraSimples() {
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     
    public double multiplica(double valor1, double valor2){
        total = valor1 * valor2;
        return total;
    } 

    
}
