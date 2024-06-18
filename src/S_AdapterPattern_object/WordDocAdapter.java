package S_AdapterPattern_object;

public class WordDocAdapter extends WordDocumentUploader implements DocumentUploader {

    /* extends for class adapter pattern */

    /*
     * Adapter pattern
     * 
     * private final WordDocumentUploader wordDocUploader;
     * 
     * public WordDocAdapter() {
     * wordDocUploader = new WordDocumentUploader();
     * }
     */

    @Override
    public void upload() {
        uploadWordDoc();
    }

    @Override
    public void uploadWordDoc() {
        System.out.println("Preparing Word document...");
        System.out.println("Uploading Word document...");
    }

}
