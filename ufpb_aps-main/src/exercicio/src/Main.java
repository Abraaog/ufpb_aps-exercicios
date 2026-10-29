package exercicio.src;

public class Main {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();

        // Padrão Factory Method
        CriadorObservador criadorCliente = new CriadorNotificadorCliente();
        CriadorObservador criadorFinanceiro = new CriadorSetorFinanceiro();

        ObservadorRevisao notificadorCliente = criadorCliente.criarObservador();
        ObservadorRevisao setorFinanceiro = criadorFinanceiro.criarObservador();

        // Padrão Singleton
        PainelVeiculosProntos painel1 = PainelVeiculosProntos.getInstancia();

        // Cadastro dos observadores
        oficina.cadastrarObservador(notificadorCliente);
        oficina.cadastrarObservador(setorFinanceiro);
        oficina.cadastrarObservador(painel1);

        // Teste de notificação para o primeiro veículo
        Carro carro1 = new Carro("Toyota Corolla");
        oficina.revisar(carro1);

        // Demonstração da remoção de observador (elimina a inspeção de método não utilizado)
        oficina.removerObservador(setorFinanceiro);

        // Teste de notificação após remoção para o segundo veículo
        Carro carro2 = new Carro("Honda Civic");
        oficina.revisar(carro2);

        // Comprovação de instância única do Singleton
        PainelVeiculosProntos painel2 = PainelVeiculosProntos.getInstancia();

        System.out.println("\n=== COMPROVAÇÃO DO SINGLETON ===");
        System.out.println("painel1 e painel2 apontam para o mesmo objeto? " + (painel1 == painel2));
    }
}