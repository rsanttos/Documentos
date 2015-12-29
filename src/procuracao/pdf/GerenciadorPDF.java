package procuracao.pdf;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

import procuracao.model.Data;
import procuracao.model.Outorgante;
import procuracao.model.Veiculo;
public class GerenciadorPDF {
	public Outorgante outorgante;
	public Veiculo veiculo;
	public Data data;
	
	public Document doc;
	public OutputStream os;
	
	public GerenciadorPDF() throws FileNotFoundException{
		this.outorgante = new Outorgante();
		this.veiculo = new Veiculo();
		this.data = new Data();
		
		this.doc = new Document(PageSize.A4, 72, 72, 72, 72);
		this.os = new OutputStream(null);
	}
	
	public void criaPDF() throws DocumentException, IOException{
			this.outorgante.editarDados();
			this.veiculo.editarDados();
			String dir = "/Users/ramonsantos/";
			PdfWriter.getInstance(this.doc, new FileOutputStream(dir+this.outorgante.getNomeCompleto()+".pdf"));
			//PdfWriter.getInstance(this.doc, new FileOutputStream(this.outorgante.getNomeCompleto()+".pdf"));
			//protected final static Font font1 = new Font(Font.UNDEFINED, 10, Font.BOLD);

			this.doc.open();
			
			Paragraph p = new Paragraph("PROCURAÇÃO\n");
			p.setAlignment(Element.ALIGN_CENTER);
			p.setSpacingAfter(15);
			this.doc.add(p);
			

			Paragraph p1 = new Paragraph("Outorgante:\n");
			p1.setSpacingAfter(10);
			this.doc.add(p1);

			
/*			Paragraph p2 = new Paragraph(new Chunk(this.outorgante.getNomeCompleto(), font1) + this.outorgante.getNomeCompleto()+" - "+this.outorgante.getNacionalidade()+
					", "+this.outorgante.getEstadoCivil()+", RG: nº "+this.outorgante.getRg()+", CPF: nº "+this.outorgante.getCpf()+
					", residente e domiciliado na Rua "+this.outorgante.getEndereco().getRua()+
					", nº "+this.outorgante.getEndereco().getNumero()+", bairro "+this.outorgante.getEndereco().getBairro()+
					", "+this.outorgante.getEndereco().getCidade()+"/"+this.outorgante.getEndereco().getEstado()+" - CEP: "+this.outorgante.getEndereco().getCep()+".");
			p2.setAlignment(Element.ALIGN_JUSTIFIED);		
			p2.setSpacingAfter(15);
			this.doc.add(p2);*/
			
			Paragraph p2 = new Paragraph(this.outorgante.getNomeCompleto()+" - "+this.outorgante.getNacionalidade()+
					", "+this.outorgante.getEstadoCivil()+", RG: nº "+this.outorgante.getRg()+", CPF: nº "+this.outorgante.getCpf()+
					", residente e domiciliado na RUA "+this.outorgante.getEndereco().getRua()+
					", nº "+this.outorgante.getEndereco().getNumero()+", BAIRRO "+this.outorgante.getEndereco().getBairro()+
					", "+this.outorgante.getEndereco().getCidade()+"/"+this.outorgante.getEndereco().getEstado()+" - CEP: "+this.outorgante.getEndereco().getCep()+".");
			p2.setAlignment(Element.ALIGN_JUSTIFIED);		
			p2.setSpacingAfter(15);
			this.doc.add(p2);
			
			Paragraph p3 = new Paragraph("Outorgado: ");
			p3.setSpacingAfter(10);
			this.doc.add(p3);
			
			Paragraph p4 = new Paragraph("FRANCISCO GONÇALVES MALAQUIAS, brasileiro, solteiro, nascido em 14/02/1967, "+
						"natural de Pendências/RN, portador do RG:  nº 00.855.649, inscrito no CPF:  nº 523.926.274-87, "+ 
						"Residente e domiciliado na Rua dos Paianazes nº 3345, apartamento-302, Condomínio Residencial Zumbi, "+
						"Bairro Bom Pastor, NATAL/RN - CEP: 59035-350.");
			p4.setAlignment(Element.ALIGN_JUSTIFIED);
			p4.setSpacingAfter(15);
			this.doc.add(p4);
			
			Paragraph p5 = new Paragraph("Outorgando-lhes: ");
			p5.setSpacingAfter(10);
			this.doc.add(p5);			
			
			Paragraph p6 = new Paragraph("Amplos poderes inerentes ao bom e fiel cumprimento deste mandato, bem como " + 
					 "para o Fórum em Geral conforme estabelecido no Artigo nº 38 do Código Civil e os Especiais, " +
					 "Juizado Especial Civil, Departamento Estadual de Trânsito do Rio Grande do Norte (DETRAN-RN), Secretaria de Tributação " +
					 "do Estado  do RN, Polícia Civil, ou qualquer Repartição Pública: Federal, Estadual ou Municipal e " +
					 "Autarquias. Assinar, solicitar todos e quaisquer que sejam documentos em relação ao veículo de marca: "+
					 this.veiculo.getMarca() + "/"+this.veiculo.getModelo() + ", fabricado no ano de " + 
					 this.veiculo.getAnoFabricacao() + ", com modelo de "+this.veiculo.getAnoModelo() + 
					 ", de cor "+this.veiculo.getCor() + " e categoria "+this.veiculo.getCategoria() + ", " +
					 " com placa: "+this.veiculo.getPlaca() + ", RENAVAM: "+this.veiculo.getRenavam() + 
					 ", combustível: "+this.veiculo.getTipoCombustivel() + ". Bem como fazer requerimento "+
					 "para baixar impedimento deCarteira Nacional de Habilitação (CNH); retirar 2º via de Recibo de Compra e "+
					 "Venda (CRV); assinar recibo de CRV; liberar veiculo apreendido, transferir e receber "+ 
					"documento. Assinar: Requerimentos, formulários, declarações, certificado de registro de veículo, recibo de transferência, "+
					"realizar Boletim de Ocorrência (BO) junto à Polícia Civil ou Militar, termos e demais papéis necessários no trâmite e "+
					 "no decorrer do processo admistrativo junto aos órgãos citados, pagar taxas e multas, envolvendo: "+ 
					 "IPVA, DPVAT, LICENCIAMENTO, retirar 2º via do licenciamento do veículo acima ciatado (CRLV), emplacar, "+
					 "assinar certificado, requerer, recorrer, manter compromisso, contrair obrigações, requerer e tomar "+ 
					 "ciência de laudos periciais, que sejam inclusive os de desistir, transigir, fazer acordo, juntar, apresentar e "+
					 "retirar documentos, praticar todos os demais atos que se fizerem necessários para o cumprimento deste "+ 
					 "mandato, o que por firme e valioso. O presente mandato.");
			p6.setAlignment(Element.ALIGN_JUSTIFIED);
			p6.setSpacingAfter(15);
			this.doc.add(p6);
			
			Paragraph p7 = new Paragraph("Natal/RN, "+ this.data.dataFormatada()+".");
			p7.setAlignment(Element.ALIGN_RIGHT);
			p7.setSpacingAfter(15);
			this.doc.add(p7);
			
			Paragraph p8 = new Paragraph("___________________________________________________________________");
			p8.setAlignment(Element.ALIGN_CENTER);
			this.doc.add(p8);
			
			Paragraph p9 = new Paragraph(this.outorgante.getNomeCompleto());
			p9.setAlignment(Element.ALIGN_CENTER);
			this.doc.add(p9);
			
			Paragraph p10 = new Paragraph("CPF: " + this.outorgante.getCpf());
			p10.setAlignment(Element.ALIGN_CENTER);
			this.doc.add(p10);
			
			Paragraph p11 = new Paragraph("Obrigatório reconhecer por autenticidade.");
			p11.setAlignment(Element.ALIGN_CENTER);
			this.doc.add(p11);
			
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
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
