package logica;

public class Operaciones {

    double primerNumero;
    double segundoNumero;


    //creamos un constructor
    public Operaciones (double primerNumero, double segundoNumero){
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    // creamos un metodo para la suma
      public double sumar() {
        return primerNumero + segundoNumero;
    }

    // creamos un método para restar
    public double restar() {
        return primerNumero - segundoNumero;
    }

    // Creamos un método para multiplicar
    public double multiplicar() {
        return primerNumero * segundoNumero;
    }

    // Creamos un método para dividir
    public double dividir() {
        if (segundoNumero != 0) {
            return primerNumero / segundoNumero;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
}
