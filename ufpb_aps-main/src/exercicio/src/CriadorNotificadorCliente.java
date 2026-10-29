package exercicio.src;

public class CriadorNotificadorCliente extends CriadorObservador {
    @Override
    public ObservadorRevisao criarObservador() {
        return new NotificadorCliente();
    }
}
