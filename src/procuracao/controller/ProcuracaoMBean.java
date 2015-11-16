package procuracao.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.itextpdf.text.DocumentException;

import procuracao.model.Outorgado;
import procuracao.model.Outorgante;
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
	
	public GerenciadorPDF pdf;
	
	public ProcuracaoMBean() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		this.outorgante = new Outorgante();
		this.outorgado = new Outorgado();
		this.pdf = new GerenciadorPDF();
	}
	
	public String cadastraDadosProcuracao() throws DocumentException, IOException{
		this.pdf.setOutorgante(this.outorgante);
		this.pdf.criaPDF();
		return "/listar_dados.xhtml";
	}
	
	public String abrirFormProcuracao(){
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

}
