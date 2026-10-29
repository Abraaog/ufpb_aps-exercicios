package exercicio.src;

import java.util.ArrayList;
import java.util.List;

public class PainelVeiculosProntos implements ObservadorRevisao {
    private static PainelVeiculosProntos instancia;
    private final List<String> veiculosProntos;

    private PainelVeiculosProntos() {
        veiculosProntos = new ArrayList<>();
    }

    public static PainelVeiculosProntos getInstancia() {
        if (instancia == null) {
            instancia = new PainelVeiculosProntos();
        }
        return instancia;
    }

    @Override
    public void revisaoConcluida(Carro carro) {
        veiculosProntos.add(carro.getModelo());
        System.out.println("[PainelVeiculosProntos] Veículo " + carro.getModelo() + " adicionado ao painel.");
        exibirPainel();
    }

    public void exibirPainel() {
        System.out.println("--- RELAÇÃO DE VEÍCULOS LIBERADOS ---");
        for (String veiculo : veiculosProntos) {
            System.out.println("- " + veiculo);
        }
        System.out.println("-------------------------------------");
    }
}