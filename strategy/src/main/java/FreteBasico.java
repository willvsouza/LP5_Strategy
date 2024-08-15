public class FreteBasico implements Frete {

    public float calcularFrete(float peso, float volume, float distancia) {
        float frete = 0;
        frete = ((peso * 2.0f) + (volume * 3.0f) + (distancia * 1.5f)) / 1000.0f;
        return frete;
    }
}
