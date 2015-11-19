package procuracao.model;

import java.util.Calendar;

public class Data {
	private Calendar data;
	private String nomeMes;
	private String dataFormatada;
	
	public Data(){
		this.data = Calendar.getInstance();
		this.nomeMes = null;
	}
	
	public String dataFormatada(){
		this.dataFormatada = this.data.get(Calendar.DAY_OF_MONTH)+" de "+this.encontraNomeMes(this.data.get(Calendar.MONTH)+1)+" de "+ this.data.get(Calendar.YEAR);
		
		return this.dataFormatada;
	}
	
	public String encontraNomeMes(int numeroMes){
		switch(numeroMes){
			case 1:
				this.setNomeMes("JANEIRO");
				break;
			case 2:
				this.setNomeMes("FEVEREIRO");
				break;
			case 3:
				this.setNomeMes("MARÇO");
				break;
			case 4:
				this.setNomeMes("ABRIL");
				break;
			case 5:
				this.setNomeMes("MAIO");
				break;
			case 6:
				this.setNomeMes("JUNHO");
				break;
			case 7:
				this.setNomeMes("JULHO");
				break;
			case 8:
				this.setNomeMes("AGOSTO");
				break;
			case 9:
				this.setNomeMes("SETEMBRO");
				break;
			case 10:
				this.setNomeMes("OUTUBRO");
				break;
			case 11:
				this.setNomeMes("NOVEMBRO");
				break;
			case 12:
				this.setNomeMes("DEZEMBRO");
				break;
			default:
				this.setNomeMes("null");
		}
		return this.nomeMes;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getNomeMes() {
		return nomeMes;
	}

	public void setNomeMes(String nomeMes) {
		this.nomeMes = nomeMes;
	}
	
	
	
}
