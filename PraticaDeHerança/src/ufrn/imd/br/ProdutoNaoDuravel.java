package ufrn.imd.br;


import java.util.Date;

public class ProdutoNaoDuravel extends Produto {
	private Date dataValidade;
	private String genero;
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}	
