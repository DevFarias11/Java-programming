package Bank_System;

/**
 * Service class responsible for generating polymorphic reports.
 * Decoupled from concrete account classes via the Imprimivel interface.
 */
public class Relatorio {

    public Relatorio() {
    }

    /**
     * Generates a report by invoking the polymorphic mostrarDados method.
     *
     * @param imprimivel any instance implementing Imprimivel
     */
    public void gerarRelatorio(Imprimivel imprimivel) {
        if (imprimivel == null) {
            System.out.println("Erro: Objeto imprimível não pode ser nulo.");
            return;
        }

        System.out.println("\n>>> RELATÓRIO DO SISTEMA <<<");
        imprimivel.mostrarDados();
    }
}