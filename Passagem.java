public class Passagem {

    private String cpf, nome, assento;
    private double custo;
    private int milhas;

    public Passagem(String cpf, String nome, String assento, double custo, int quantidade, int[] pesos) {
        this.cpf = cpf;
        this.nome = nome;
        double precoAssento = defineAssento(assento);
        this.custo = custo + precoAssento + custoBagagem(quantidade, pesos);
        ganharMilhas();
    }

    public double custoBagagem(int quantidade, int[] pesos) {
        double custo = 0;

        for(int i = 0; i < pesos.length; i++) {
            custo += pesos[i] * 0.5;
        }

        return custo;
    }

    // retorna o custo para reservar o assento
    public double defineAssento(String assento) {
        this.setAssento(assento);
        return 5.0;
    }

    public double getCusto() {
        return this.custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getAssento() {
        return this.assento;
    }

    public void ganharMilhas() {
        this.setMilhas((int)(this.getCusto() * 0.1));
    }

    public void setMilhas(int milhas) {
        this.milhas = milhas;
    }

    public int getMilhas() {
        return this.milhas;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
}