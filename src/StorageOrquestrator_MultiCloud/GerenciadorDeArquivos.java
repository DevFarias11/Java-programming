package StorageOrquestrator_MultiCloud;

import java.util.ArrayList;
import java.util.List;

/**
 * Orchestrator class managing multiple cloud storage providers.
 * Demonstrates the Delegation Pattern and 1-to-N aggregation by dispatching
 * operations across all registered {@link CloudStorageProvider} instances.
 */
public class GerenciadorDeArquivos {

    private List<CloudStorageProvider> provedores;

    public GerenciadorDeArquivos() {
        this.provedores = new ArrayList<>();
    }

    /**
     * Registers a new cloud storage provider into the orchestration pool.
     *
     * @param provedor the cloud storage provider instance to register
     */
    public void adicionarProvedor(CloudStorageProvider provedor) {
        if (provedor == null) {
            System.out.println("[Gerenciador] Aviso: Tentativa de adicionar provedor nulo ignorada.");
            return;
        }
        this.provedores.add(provedor);
        System.out.println("[Gerenciador] Provedor registrado: " + provedor.getClass().getSimpleName());
    }

    /**
     * Dispatches and uploads the given file simultaneously to all registered cloud storage providers.
     *
     * @param nome  the name of the file
     * @param dados the raw byte payload of the file
     */
    public void uploadParaTodos(String nome, byte[] dados) {
        if (this.provedores.isEmpty()) {
            System.out.println("[Gerenciador] Aviso: Nenhum provedor de nuvem registrado para executar o upload.");
            return;
        }

        if (nome == null || nome.trim().isEmpty() || dados == null) {
            System.out.println("[Gerenciador] Erro: Dados ou nome do arquivo inválidos para orquestração.");
            return;
        }

        System.out.println("[Gerenciador] Disparando upload do arquivo '" + nome + "' para " + this.provedores.size() + " provedor(es)...");
        for (CloudStorageProvider provedor : this.provedores) {
            provedor.uploadArquivo(nome, dados);
        }
    }

    public List<CloudStorageProvider> getProvedores() {
        return provedores;
    }
}