import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class JugadorTest {

    @Test
    public void casaTieneDosCartas(){
        Veintiuno veintiuno = new Veintiuno();
        Jugador casa = veintiuno.getCasa();
        List<Carta> baraja = casa.getBaraja();
        assertEquals(baraja.toArray().length, 2);
    }
}
