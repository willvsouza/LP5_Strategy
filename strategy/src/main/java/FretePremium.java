public class FretePremium implements Frete {

    public float calcularFrete(float peso, float volume, float distancia) {
        float frete = 0;
        frete = ((peso * 2.8f) + (volume * 3.5f) + (distancia * 1.8f)) /750.0f;
        return frete;
    }
}
