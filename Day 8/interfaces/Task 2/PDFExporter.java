public class PDFExporter implements Exportable {
    String fileName ;
    PDFExporter( String fileName){
       this.fileName = fileName;
    }
    public void Exportable(){
        System.out.println("Exporting data To file " + fileName +" as PDF");
    }
}
