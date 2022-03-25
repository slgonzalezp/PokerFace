import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jugador {
    List<Carta> baraja;

    Jugador(){
        baraja = new ArrayList<>();
    }

    public void agregarCarta(Carta carta){
        baraja.add(carta);
    }
    public List<Carta> getBaraja() {
        return baraja;
    }

    public int valorMano(){
        int cantidadAs = baraja.stream().mapToInt(carta -> {
            if (Objects.equals(carta.valor, "A")) {
                return 1;
            }
            return 0;
        }).sum();
        int total = baraja.stream().mapToInt(carta -> {
            if (Objects.equals(carta.valor, "A")) {
                return 1;
            }
            if ((Objects.equals(carta.valor, "K")) ||
                (Objects.equals(carta.valor, "Q")) ||
                (Objects.equals(carta.valor, "J"))) {
                return 10;
            }
            return Integer.parseInt(carta.valor);
        }).sum();
        for (int i=0; i<cantidadAs; i++){
            if (total <=11)
                total = total+10;
        }
        return total;
    }

    public String casaContinua(int total) {
        if ((total >= 20)) {
            return "stand";
        }
        return "hit";
    }
}
