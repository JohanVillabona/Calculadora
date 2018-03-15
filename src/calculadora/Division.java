package calculadora;

public class Division extends Operacion{
    
    double div = 0;
      
//    Se asignan los do valores como flotantes.
    public Division(double n1, double n2) {
        
//    Se indica que los dos numeros ingresados se operan con el simbolo para division "/"         
        super(n1, n2, '/');
//    la division en 0 es indeterminada por lo que se genera un mensaje de error
        if(n2==0) System.out.println("raioz no se puede division entre cero");
        else this.div = n1 / n2;
        this.setRes(this.div);
    }
    
}
