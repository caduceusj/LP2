package ufrn.imd;

public class Prova  {
	private double trabalho1;
	private double trabalho2;
	
	public double calcularNotaTotal(Aluno a){
		double notaTotal;
			notaTotal = a.getTrabalho1() + a.getTrabalho2();
			return notaTotal;
		}


	public double getTrabalho1() {
		return trabalho1;
	}

	public void setTrabalho1(double trabalho1) {
		this.trabalho1 = trabalho1;
	}

	public double getTrabalho2() {
		return trabalho2;
	}

	public void setTrabalho2(double trabalho2) {
		this.trabalho2 = trabalho2;
	}

}
