package StorageOrquestrator_MultiCloud;

/**
 * Interface defining the common contract for cloud storage providers.
 * Enforces abstraction and polymorphism across diverse cloud vendor APIs.
 */
public interface CloudStorageProvider {

    /**
     * Uploads a file with its raw binary payload to the remote cloud storage.
     *
     * @param nome  the name of the file to be uploaded
     * @param dados the byte array representing file contents
     */
    void uploadArquivo(String nome, byte[] dados);

    /**
     * Downloads file contents from the remote cloud storage.
     *
     * @param nome the name of the file to be downloaded
     * @return a byte array of the file contents
     */
    byte[] downloadArquivo(String nome);
}