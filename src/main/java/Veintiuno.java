public class Veintiuno {
    private Jugador casa;
    private Jugador jugadorCasino;

    Veintiuno() {
        casa = new Jugador();
        jugadorCasino = new Jugador();
    }

    public static void main(String[] args) {
        Veintiuno veintiuno = new Veintiuno();
    }

    public void comenzarJuego () {
        Carta primeraCartaCasa = new Carta("Corazones", "3");
        Carta segundaCartaCasa = new Carta("Diamante", "7");
        casa.agregarCarta(primeraCartaCasa);
        casa.agregarCarta(segundaCartaCasa);

    }

    public Jugador getJugadorCasino() {
        return jugadorCasino;
    }

    public Jugador getCasa() {
        return casa;
    }

}
