package procuracao.pdf;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;
public class GerenciadorPDF {
	public Document doc;
	public FileOutputStream os;
	
	public GerenciadorPDF() throws FileNotFoundException{
		this.doc = new Document(PageSize.A4, 72, 72, 72, 72);
		this.os = new FileOutputStream("novoarquivo.pdf");
	}
	
	public GerenciadorPDF(String nomePDF) throws FileNotFoundException{
		this.doc = new Document(PageSize.A4, 72, 72, 72, 72);
		this.os = new FileOutputStream(nomePDF+".pdf");
	}
	
	public void criaPDF() throws DocumentException{

		PdfWriter.getInstance(this.doc, this.os);

		// abre o documento

		this.doc.open();

		// adiciona o texto ao PDF

		Paragraph p = new Paragraph("Meu primeiro arquivo PDF!");

		this.doc.add(p);
	}
}
