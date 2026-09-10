package StorageOrquestrator_MultiCloud;

/**
 * Application entry point demonstrating the Multi-Cloud Storage Orchestrator.
 * Highlights the Delegation pattern (1-to-N), polymorphism, and defensive scenarios.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("   PROJETO 04: STORAGE ORQUESTRATOR MULTI-CLOUD");
        System.out.println("==========================================================");

        GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();

        System.out.println("\n--- [ETAPA 1] REGISTRO DE PROVEDORES DE NUVEM ---");
        CloudStorageProvider aws = new AWSStorage();
        CloudStorageProvider azure = new AzureStorage();

        gerenciador.adicionarProvedor(aws);
        gerenciador.adicionarProvedor(azure);

        System.out.println("\n--- [ETAPA 2] UPLOAD SIMULTÂNEO (ORQUESTRAÇÃO 1-PARA-N) ---");
        String nomeArquivo = "relatorio_financeiro_2026.pdf";
        byte[] dadosArquivo = "PAYLOAD_BINARIO_DEMO_MULTI_CLOUD".getBytes();

        gerenciador.uploadParaTodos(nomeArquivo, dadosArquivo);

        System.out.println("\n--- [ETAPA 3] RECUPERAÇÃO / DOWNLOAD INDIVIDUAL ---");
        aws.downloadArquivo("relatorio_financeiro_2026.pdf");
        azure.downloadArquivo("backup_database.tar.gz");

        System.out.println("\n--- [ETAPA 4] TESTES DE CENÁRIOS DEFENSIVOS ---");
        GerenciadorDeArquivos gerenciadorVazio = new GerenciadorDeArquivos();
        System.out.println("1. Teste de upload sem provedores:");
        gerenciadorVazio.uploadParaTodos("dados_teste.csv", new byte[]{1, 2, 3});

        System.out.println("\n2. Teste de adição de provedor nulo:");
        gerenciador.adicionarProvedor(null);

        System.out.println("\n3. Teste com nome de arquivo inválido:");
        gerenciador.uploadParaTodos("", dadosArquivo);

        System.out.println("\n==========================================================");
        System.out.println("   EXECUÇÃO FINALIZADA COM SUCESSO!");
        System.out.println("==========================================================");
    }
}
