public class Executive {

    public Executive(String cpf, String nome, String assento, double custo) {
        super(cpf, nome, assento, custo);
    }

    @Override
    public double custoBagagem(int quantidade, int[] pesos) {
        double custo = 0;
        return custo;
    }

    public int getMilhas() {
        return this.getMilhas;
    }
}