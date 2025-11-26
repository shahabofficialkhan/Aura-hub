public class test {
     public static void main(String[] args) {
          Exportable[] files = new Exportable[5];


          files[0] = new PDFExporter("file1.pdf");
            files[1] = new Excel("file2.xlsx");
            files[2] = new PDFExporter("file3.pdf");
            files[3] = new Excel("file4.xlsx");
            files[4] = new PDFExporter("file5.pdf");
            for (Exportable file : files ){
                file.Exportable();
            }
     }
}
