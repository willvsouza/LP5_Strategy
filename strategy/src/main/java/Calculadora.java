public class Calculadora {

    private float peso;
    private float volume;
    private float distancia;

    public Calculadora(float peso, float volume, float distancia) {
        this.peso = peso;
        this.volume = volume;
        this.distancia = distancia;
    }

    public float calcular(Frete frete){
        return frete.calcularFrete(peso, volume, distancia);
    }
}
