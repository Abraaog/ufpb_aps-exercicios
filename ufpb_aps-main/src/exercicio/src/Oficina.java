package exercicio.src;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private final List<ObservadorRevisao> observadores = new ArrayList<>();

    public void cadastrarObservador(ObservadorRevisao observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorRevisao observador) {
        observadores.remove(observador);
    }

    public void revisar(Carro carro) {
        System.out.println("\n=== Concluindo revisão do veículo: " + carro.getModelo() + " ===");
        notificarObservadores(carro);
    }

    private void notificarObservadores(Carro carro) {
        for (ObservadorRevisao observador : observadores) {
            observador.revisaoConcluida(carro);
        }
    }
}