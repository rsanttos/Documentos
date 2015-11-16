package procuracao.pdf;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

import procuracao.model.Outorgante;
public class GerenciadorPDF {
	public Outorgante outorgante;
	public Document doc;
	public OutputStream os;
	
	public GerenciadorPDF() throws FileNotFoundException{
		this.doc = new Document(PageSize.A4, 72, 72, 72, 72);
		this.os = new OutputStream(null);
	}
	
	public void criaPDF() throws DocumentException, IOException{
			PdfWriter.getInstance(this.doc, new FileOutputStream(this.outorgante.getNomeCompleto()+".pdf"));

			this.doc.open();
			
			Paragraph p = new Paragraph("PROCURAÇÃO");
			p.setAlignment(Element.ALIGN_CENTER);
			this.doc.add(p);

			Paragraph p1 = new Paragraph("Outorgante:");
			this.doc.add(p1);
			
			Paragraph p2 = new Paragraph(this.outorgante.getNomeCompleto()+" - "+this.outorgante.getNacionalidade()+
					", "+this.outorgante.getEstadoCivil()+", RG: nº "+this.outorgante.getRg()+", CPF: nº "+this.outorgante.getCpf()+
					", residente e domiciliado na Rua "+this.outorgante.getEndereco().getRua()+
					", nº "+this.outorgante.getEndereco().getNumero()+", bairro "+this.outorgante.getEndereco().getBairro()+
					", "+this.outorgante.getEndereco().getCidade()+"/"+this.outorgante.getEndereco().getEstado()+" - CEP: "+this.outorgante.getEndereco().getCep()+".");
			this.doc.add(p2);
			
			this.doc.close();
		
	}

	public Outorgante getOutorgante() {
		return outorgante;
	}

	public void setOutorgante(Outorgante outorgante) {
		this.outorgante = outorgante;
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	public OutputStream getOs() {
		return os;
	}

	public void setOs(OutputStream os) {
		this.os = os;
	}
}
