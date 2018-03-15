package calculadora;

public class Resta extends Operacion{
    
    double resta;
    
 //    Se asignan los do valores como flotantes.       
    public Resta(double n1, double n2) {
 //    Se indica que los dos numeros ingresados se operan con el simbolo para resta "*"            
        super(n1, n2, '-');
        this.resta = n1 - n2;
        this.setRes(this.resta);
    }
}
