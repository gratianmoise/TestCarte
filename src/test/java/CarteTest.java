import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarteTest {
    @Test
    void verificVechime(){
        Carte p1 = new Carte("A", "B", "C", 2014);
        int vechime = p1.vechimeCarte(p1);
        Assertions.assertEquals(vechime, 7);
        Assertions.assertNotEquals(vechime, 2);
        //Assertions.assertNotEquals(vechime, 3);

    }
}
