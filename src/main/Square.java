import static java.lang.Math.pow;

public class Square implements Area {
    @Override
    public String calculate( Double base ) {
        return "El área del cuadrado es " + pow( base, 2 ) + " unidades";
    }
}
