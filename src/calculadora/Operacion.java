package calculadora;

public class Operacion {

//Se asignan las variables.    
    double n1;
    double n2;
    double res;
    char operacion;

//Se indica que las dos variables seran operadas por otra variable delimitada.
    public Operacion(double n1, double n2, char operacion) {
        
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }

    public Operacion() {
    }

    public Operacion(double n1, double n2) {
    }
    
//Se retorna en resultado que entrega la operacion de las variables anteriores.        
    public String mostrarResultado(){
        
        return ""+this.res;
        
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
    
    
}
