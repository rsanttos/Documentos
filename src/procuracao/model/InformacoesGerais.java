package procuracao.model;

import java.util.Date;

public class InformacoesGerais {
	private String cidade;
	private String estado;
	private Date data;
	
	public InformacoesGerais() {
		// TODO Auto-generated constructor stub
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
