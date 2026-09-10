package StorageOrquestrator_MultiCloud;

/**
 * Concrete cloud storage provider implementing integration with Microsoft Azure (Blob Storage).
 */
public class AzureStorage implements CloudStorageProvider {

    @Override
    public void uploadArquivo(String nome, byte[] dados) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("[Azure Blob] Erro: Nome de arquivo inválido para upload.");
            return;
        }
        if (dados == null) {
            System.out.println("[Azure Blob] Erro: Os dados do arquivo não podem ser nulos.");
            return;
        }

        // Simulação do envio para o Azure Blob Storage
        System.out.println("[Azure Blob] Upload concluído: '" + nome.trim() + "' (" + dados.length + " bytes) persistido no container com sucesso.");
    }

    @Override
    public byte[] downloadArquivo(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("[Azure Blob] Erro: Nome de arquivo inválido para download.");
            return new byte[0];
        }

        // Simulação de download a partir do Azure Blob Storage
        System.out.println("[Azure Blob] Download concluído: '" + nome.trim() + "' recuperado com sucesso.");
        return new byte[0];
    }
}

