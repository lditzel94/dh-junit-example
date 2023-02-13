import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    @DisplayName( "Should successfully calculate area" )
    public void should_successfully_calculate_area() {
        //Arrange
        var circle = new Circle();

        //Act
        var message = circle.calculate( 2D );

        //Assert
        assertEquals( "El área del circulo es " + PI * 4 + " unidades", message );
    }

    @Test
    @DisplayName( "Should be greater than zero" )
    public void should_be_greater_than_zero() {
        //Arrange
        var circle = new Circle();

        //Act
        var area = circle.calculate( 0D );

        //Assert
        assertEquals( "El valor del radio o lado debe ser mayor que cero", area );
    }
}
