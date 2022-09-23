package ufrn.imd;

public class Aluno extends Prova{
	private String nome;
	private Double unidNota1;
	private Double unidNota2;
	private Double media;
	
	
	
	public void calcularMedia(Aluno a) {
		double media;
		media = (unidNota1 + unidNota2)/2;
		a.setMedia(media);
	}
	
	public void consultarAluno(Aluno a) {
		System.out.println("Media do Aluno" + a.getNome() + ": \n" + "Unidade 1: " + a.getUnidNota1()+ "\n Unidade 2:" + a.getUnidNota2() + "\n Média: " + a.getMedia());
		
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getUnidNota1() {
		return unidNota1;
	}
	public void setUnidNota1(Double unidNota1) {
		this.unidNota1 = unidNota1;
	}
	public Double getUnidNota2() {
		return unidNota2;
	}
	public void setUnidNota2(Double unidNota2) {
		this.unidNota2 = unidNota2;
	}
	
	
	

}
