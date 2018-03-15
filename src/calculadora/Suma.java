package calculadora;

public class Suma extends Operacion{
    
    double suma;
//    Se asignan los do valores como flotantes.         
    public Suma(double n1, double n2) {
//    Se indica que los dos numeros ingresados se operan con el simbolo para suma "+"             
        super(n1, n2, '+');
        this.suma = n1 + n2;
        this.setRes(this.suma);
    }
}
