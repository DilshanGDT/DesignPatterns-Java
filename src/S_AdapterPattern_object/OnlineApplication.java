package S_AdapterPattern_object;

public class OnlineApplication {

    private final DocumentUploader docuploader;

    public OnlineApplication(DocumentUploader docuploader) {
        this.docuploader = docuploader;
    }

    public void uploadDoc() {
        docuploader.upload();
    }
}
