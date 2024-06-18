package S_AdapterPattern_object;

public class App {

    public static void main(String[] args) {

        var PdfDocumentUploader = new PdfDocumentUploader();
        var OnlineApplication = new OnlineApplication(PdfDocumentUploader);

        OnlineApplication.uploadDoc();

        /*
         * This output does not give the 3 dots in printing method
         * since we cannot change the wordDocumentUploader class method
         * if we need to manage that, we need class adapter pattern.
         */
        var wordDocumentUploader = new WordDocAdapter();
        var OnlineApplication2 = new OnlineApplication(wordDocumentUploader);

        OnlineApplication2.uploadDoc();

    }
}
