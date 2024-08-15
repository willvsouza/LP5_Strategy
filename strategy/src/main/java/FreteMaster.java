public class FreteMaster implements Frete {

    public float calcularFrete(float peso, float volume, float distancia) {
        float frete = 0;
        frete = ((peso * 2.5f) + (volume * 3.2f) + (distancia * 1.5f)) / 900.0f;
        return frete;
    }
}
