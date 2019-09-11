public class App {
    public static void main(String args[]) {
        
        int[] pesos = {10, 15, 5};
        Passagem passagemEconomica = new Economy("32565214785", "Luiz Eduardo Carvalho", "15F", 200.0, 3, pesos);

        System.out.println("--------------------------------------");
        System.out.println(passagemEconomica.custoBagagem(3, pesos));
        System.out.println(passagemEconomica.getNome());
        System.out.println(passagemEconomica.getCpf());
        System.out.println(passagemEconomica.getAssento());
        System.out.println(passagemEconomica.getCusto());
        System.out.println(passagemEconomica.getMilhas());

        Passagem passagemExecutiva = new Executive("25977412305", "Luiz Eduado Ferreira", "1A", 450.0, 3, pesos);

        System.out.println("--------------------------------------");
        System.out.println(passagemExecutiva.custoBagagem(3, pesos));
        System.out.println(passagemExecutiva.getNome());
        System.out.println(passagemExecutiva.getCpf());
        System.out.println(passagemExecutiva.getAssento());
        System.out.println(passagemExecutiva.getCusto());
        System.out.println(passagemExecutiva.getMilhas());

        Passagem passagemExecutiva2 = new Executive("25977412305", "Luiz Eduado Ferreira", "3A", 450.0, 2, pesos);

        System.out.println("--------------------------------------");
        System.out.println(passagemExecutiva2.custoBagagem(2, pesos));
        System.out.println(passagemExecutiva2.getNome());
        System.out.println(passagemExecutiva2.getCpf());
        System.out.println(passagemExecutiva2.getAssento());
        System.out.println(passagemExecutiva2.getCusto());
        System.out.println(passagemExecutiva2.getMilhas());

        Passagem passagemPremier = new Premier("36548521450", "Luiz Eduado da Costa", "6B", 700.0, 3, pesos);

        System.out.println("--------------------------------------");
        System.out.println(passagemExecutiva2.custoBagagem(3, pesos));
        System.out.println(passagemPremier.getNome());
        System.out.println(passagemPremier.getCpf());
        System.out.println(passagemPremier.getAssento());
        System.out.println(passagemPremier.getCusto());
        System.out.println(passagemPremier.getMilhas());
    }
}