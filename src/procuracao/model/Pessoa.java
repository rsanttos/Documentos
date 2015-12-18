package procuracao.model;

import java.io.Serializable;

public class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String nomeCompleto;
	public String nacionalidade;
	public String estadoCivil;
	public String profissao;
	public String rg;
	public String orgaoExpedidor;
	public String cpf;
	
	public Endereco endereco;
	public Pessoa() {
		// TODO Auto-generated constructor stub
		endereco = new Endereco();
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void editarDados(){
		this.setNomeCompleto(this.getNomeCompleto().toUpperCase());
		this.getEndereco().setRua(this.getEndereco().getRua().toUpperCase());
		this.getEndereco().setBairro(this.getEndereco().getBairro().toUpperCase());
		this.getEndereco().setCidade(this.getEndereco().getCidade().toUpperCase());
	}
	
}
