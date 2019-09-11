public class Premier extends Executive {
    
    public Premier(String cpf, String nome, String assento, double custo, int quantidade, int[] pesos) {
        super(cpf, nome, assento, custo, quantidade, pesos);
        custoBagagem(quantidade, pesos);
    }

    @Override
    public double custoBagagem(int quantidade, int[] pesos) {
        double custoExecutive = super.custoBagagem(quantidade, pesos);
        return custoExecutive * 0.5;
    }

    public double defineAssento(String assento) {
        this.setAssento(assento);
        return 0.0; // reserva de assento sem custo
    }

    @Override
    public void ganharMilhas() {
        this.setMilhas((int)(this.getCusto() * 0.2));
    }
}