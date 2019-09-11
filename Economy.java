public class Economy extends Passagem{
    
    public Economy(String cpf, String nome, String assento, double custo, int quantidade, int[] pesos) {
        super(cpf, nome, assento, custo, quantidade, pesos);
    }

    @Override
    public double custoBagagem(int quantidade, int[] pesos) {
        double custo = 0;

        custo = super.custoBagagem(quantidade, pesos);
        custo += quantidade * 10.0;

        return custo;
    }
}