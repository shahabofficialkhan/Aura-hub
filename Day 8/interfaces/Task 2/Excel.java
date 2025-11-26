public class Excel implements Exportable {
    String fileName ;
    Excel( String fileName){
        this.fileName = fileName;
    }
    public void Exportable(){
        System.out.println("Exporting data To file " + fileName +" as Excel");
    }
    
}
