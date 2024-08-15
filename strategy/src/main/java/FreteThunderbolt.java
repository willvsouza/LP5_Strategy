public class FreteThunderbolt implements Frete {

    public float calcularFrete(float peso, float volume, float distancia) {
        float frete = 0;
        frete = ((peso * 5.5f) + (volume * 4.5f) + (distancia * 2.5f)) / 500.0f;
        return frete;
    }
}
