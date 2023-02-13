import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Area {
    @Override
    public String calculate( Double base ) {
        if ( base <= 0 ) return "El valor del radio o lado debe ser mayor que cero";
        return "El área del circulo es " + PI * pow( base, 2 ) + " unidades";
    }
}
