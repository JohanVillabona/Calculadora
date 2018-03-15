package calculadora;

public class Multiplicacion extends Operacion{
    
    double multi;
       
    //    Se asignan los do valores como flotantes.
    public Multiplicacion(double n1, double n2) {
    //    Se indica que los dos numeros ingresados se operan con el simbolo para multiplicacion "*"          
        super(n1, n2, '*');
        this.multi = n1 * n2;
        this.setRes(this.multi);
    }
}
