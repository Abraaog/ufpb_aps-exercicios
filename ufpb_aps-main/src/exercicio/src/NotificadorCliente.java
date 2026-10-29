package exercicio.src;

public class NotificadorCliente implements ObservadorRevisao {
    @Override
    public void revisaoConcluida(Carro carro) {
        System.out.println("[NotificadorCliente] Notificando cliente: A revisão do veículo "
                + carro.getModelo() + " foi concluída!");
    }
}