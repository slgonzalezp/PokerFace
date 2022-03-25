import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.*;

public class StepDefinitionVeintiuno {
    Veintiuno veintiuno;
    Jugador casaVeintiuno;
    Jugador kennyJugador;
    int valorMano;
    int totalManoCasa;
    // Primer escenario
    @Given("la casa")
    public void laCasa() {
        veintiuno = new Veintiuno();
        assertNotNull(veintiuno.getCasa());
    }

    @When("inicia el juego")
    public void iniciaElJuego() {
        veintiuno.comenzarJuego();
    }

    @Then("la casa debe tener dos cartas")
    public void laCasaDebeTenerDosCartas() {
        casaVeintiuno = veintiuno.getCasa();
        assertEquals(casaVeintiuno.getBaraja().size(),2);
    }

    // Segundo escenario
    @Given("una {string}")
    public void unaMano(String mano) {
        kennyJugador = new Jugador ();
        String[] manoArray = mano.split(",");
        kennyJugador.agregarCarta(new Carta("corazones", manoArray[0]));
        kennyJugador.agregarCarta(new Carta("corazones", manoArray[1]));
    }

    @When("la casa suma las cartas")
    public void laCasaSumaLasCartas (){
        valorMano = kennyJugador.valorMano();
    }
    @Then("la casa debe de tener un {int}")
    public int laCasaDebeDeTenerUnTotal(int total){
        assertEquals(valorMano, total);
        return valorMano;
    }

    // Tercer escenario
    @Given("una mano con un {int}")
    public void unaManoConUnTotal (int total) {
        totalManoCasa = total;
    }

    @When("la casa juega")
    public void laCasaJuega() {
        veintiuno = new Veintiuno();
        veintiuno.comenzarJuego();
    }

    @Then("la casa deberia tener la {string}")
    public void laCasaDeberiaTenerLaAccion(String accion){
        Jugador casa = veintiuno.getCasa();
        assertEquals(casa.casaContinua(totalManoCasa),accion);
    }
    // other step definitions
}
