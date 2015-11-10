package procuracao.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import procuracao.model.Outorgado;
import procuracao.model.Outorgante;

@SessionScoped
@ManagedBean
public class ProcuracaoBean implements Serializable {
	
	Outorgante outorgante;
	Outorgado outorgado;
	
	public ProcuracaoBean() {
		// TODO Auto-generated constructor stub
		this.outorgante = new Outorgante();
		this.outorgado = new Outorgado();
	}
	
	public String cadastraDadosProcuracao(){
		
		return null;
	}

}
