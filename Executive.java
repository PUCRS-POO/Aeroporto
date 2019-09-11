public class Executive extends Passagem {

    public Executive(String cpf, String nome, String assento, double custo, int quantidade, int[] pesos) {
        super(cpf, nome, assento, custo, quantidade, pesos);
        custo = usarMilhas();
        this.setCusto(custo);
    }

    @Override
    public double custoBagagem(int quantidade, int[] pesos) {
        double custo = 0;

        if(quantidade > 2) {
            custo = super.custoBagagem(quantidade, pesos);
        }

        return custo;
    }

    public double usarMilhas() {
        if(this.getMilhas() >= (this.getCusto() * 0.1)) {
            this.setCusto(this.getCusto() * 0.1);
            this.setMilhas((int)(this.getCusto() * 0.1));
        }

        return this.getCusto();
    }
}