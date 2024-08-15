import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacoteTeste {

    // Peso: kg
    // Volume: cm³
    // Distância: km

    @Test
    void deveCalcularFreteBasico() {
        Pacote pacote = new Pacote();
        pacote.calcularFreteBasico(1, 7500, 300);
        assertEquals(22.95f, pacote.getCustoDoFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteMaster() {
        Pacote pacote = new Pacote();
        pacote.calcularFreteMaster(1, 7500, 300);
        assertEquals(27.16f, pacote.getCustoDoFrete(), 0.01f);
    }

    @Test
    void deveCalcularFretePremium() {
        Pacote pacote = new Pacote();
        pacote.calcularFretePremium(1, 7500, 300);
        assertEquals(35.72f, pacote.getCustoDoFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteThunderbolt() {
        Pacote pacote = new Pacote();
        pacote.calcularFreteThunderbolt(1, 7500, 300);
        assertEquals(69.01f, pacote.getCustoDoFrete(), 0.01f);
    }

}
