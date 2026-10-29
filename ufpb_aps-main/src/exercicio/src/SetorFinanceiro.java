package exercicio.src;

public class SetorFinanceiro implements ObservadorRevisao {
    @Override
    public void revisaoConcluida(Carro carro) {
        System.out.println("[SetorFinanceiro] Procedimentos de cobrança iniciados para o veículo "
                + carro.getModelo() + ".");
    }
}