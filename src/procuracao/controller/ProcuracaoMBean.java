package procuracao.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import procuracao.model.Outorgado;
import procuracao.model.Outorgante;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class ProcuracaoMBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Outorgante outorgante;
	Outorgado outorgado;
	
	public ProcuracaoMBean() {
		// TODO Auto-generated constructor stub
		this.outorgante = new Outorgante();
		this.outorgado = new Outorgado();
	}
	
	public String cadastraDadosProcuracao(){
		
		return "/listar_dados.xhtml";
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
