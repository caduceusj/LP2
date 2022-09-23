package ufrn.imd;
import java.util.ArrayList;

public class Turma extends Aluno {
	public double getMediaGeral() {
		return mediaGeral;
	}


	public void setMediaGeral(double mediaGeral) {
		this.mediaGeral = mediaGeral;
	}


	ArrayList<Aluno> turmaAlunos = new ArrayList<Aluno>();
	private double mediaGeral;
	

	public void mediaTurma(ArrayList<Aluno> a, int divide){
		int count = a.size()-1;
		double montante = 0;
		while (count >= 0) {
				montante = montante + a.get(count).getMedia();
				count--;
			}
		
		setMediaGeral(montante/divide);
		}



	private void setAlunos(Turma A){
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		
		a1.setUnidNota1(9.0);
		a1.setUnidNota2(10.0);
		a1.setNome("João Victor Gibson");
		a1.calcularMedia(a1);

		
		
		a2.setUnidNota1(5.5);
		a2.setUnidNota2(7.0);
		a2.setNome("Gabriel Caduceus Joestar");
		a2.calcularMedia(a2);
		
		
		
		
		a3.setUnidNota1(9.5);
		a3.setUnidNota2(6.0);
		a3.setNome("Thamillys Joestar Marinho");
		a3.calcularMedia(a3);
		
		
		turmaAlunos.add(a1);
		turmaAlunos.add(a2);
		turmaAlunos.add(a3);
		

			
			
		}
}


