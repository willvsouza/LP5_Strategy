public class Pacote {

    private float custoDoFrete;

    public float getCustoDoFrete(){
        return custoDoFrete;
    }

    public void calcularFreteBasico(float peso, float volume, float distancia) {
        Calculadora calculadora = new Calculadora(peso, volume, distancia);
        this.custoDoFrete = calculadora.calcular(new FreteBasico());
    }

    public void calcularFreteMaster(float peso, float volume, float distancia) {
        Calculadora calculadora = new Calculadora(peso, volume, distancia);
        this.custoDoFrete = calculadora.calcular(new FreteMaster());
    }

    public void calcularFretePremium(float peso, float volume, float distancia) {
        Calculadora calculadora = new Calculadora(peso, volume, distancia);
        this.custoDoFrete = calculadora.calcular(new FretePremium());
    }

    public void calcularFreteThunderbolt(float peso, float volume, float distancia) {
        Calculadora calculadora = new Calculadora(peso, volume, distancia);
        this.custoDoFrete = calculadora.calcular(new FreteThunderbolt());
    }
}
