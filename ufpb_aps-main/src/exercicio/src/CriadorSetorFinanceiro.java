package exercicio.src;

public class CriadorSetorFinanceiro extends CriadorObservador {
    @Override
    public ObservadorRevisao criarObservador() {
        return new SetorFinanceiro();
    }
}
