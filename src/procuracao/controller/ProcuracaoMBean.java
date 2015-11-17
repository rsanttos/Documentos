package procuracao.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.itextpdf.text.DocumentException;

import procuracao.model.Outorgado;
import procuracao.model.Outorgante;
import procuracao.model.Veiculo;
import procuracao.pdf.GerenciadorPDF;

@ManagedBean
@SessionScoped
public class ProcuracaoMBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Outorgante outorgante;
	public Outorgado outorgado;
	public Veiculo veiculo;
	
	public GerenciadorPDF pdf;
	
	public ProcuracaoMBean() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		this.outorgante = new Outorgante();
		this.outorgado = new Outorgado();
		this.veiculo = new Veiculo();
		this.pdf = new GerenciadorPDF();
	}
	
	public String cadastraDadosProcuracao() throws DocumentException, IOException{
		this.pdf.setOutorgante(this.outorgante);
		this.pdf.setVeiculo(this.veiculo);
		this.pdf.criaPDF();
		return "/listar_dados.xhtml";
	}
	
	public String abrirFormProcuracao() throws FileNotFoundException{
		this.pdf = new GerenciadorPDF();
		return "/formProcuracao.xhtml";
	}

	public Outorgante getOutorgante() {
		return outorgante;
	}

	public void setOutorgante(Outorgante outorgante) {
		this.outorgante = outorgante;
	}

	public Outorgado getOutorgado() {
		return outorgado;
	}

	public void setOutorgado(Outorgado outorgado) {
		this.outorgado = outorgado;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public GerenciadorPDF getPdf() {
		return pdf;
	}

	public void setPdf(GerenciadorPDF pdf) {
		this.pdf = pdf;
	}

}
