package procuracao.model;

import java.io.Serializable;

public class Veiculo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	private String cor;
	private String categoria;
	private String placa;
	private String renavam;
	private String tipoCombustivel;
	
	public Veiculo(){
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public void editarDados(){
		this.setCategoria(this.getCategoria().toUpperCase());
		this.setCor(this.getCor().toUpperCase());
		this.setMarca(this.getMarca().toUpperCase());
		this.setModelo(this.getModelo().toUpperCase());
		this.setPlaca(this.getPlaca().toUpperCase());
		this.setRenavam(this.getRenavam().toUpperCase());
		this.setTipoCombustivel(this.getTipoCombustivel().toUpperCase());
	}
	

}
