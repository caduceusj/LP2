package ufrn.imd;

import java.util.ArrayList;
import java.util.Scanner;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Turma turmaA = new Turma();
			
			DecimalFormat formatador = new DecimalFormat("0.00");
			int quantAlunos = 0;
			
			while(true) {
			System.out.println("Bem vindo professor, sua turma atual contém: "+ quantAlunos + " alunos \n O que gostaria de fazer?" + " \n ----------------------------------------------------- \n" );
			
			System.out.println("1- Adicionar novo Aluno \n 2- Verificar média geral da turma \n 3- Sair");
			String option = sc.nextLine();
			
			switch(option) {
				
				case "1":
					System.out.println("Escreva abaixo o nome do aluno");
					String nome = sc.nextLine();
					
					System.out.println("Escreva abaixo a nota do primeiro trabalho da primeira unidade");
					double nota1unid1 = sc.nextDouble();
					System.out.println("Escreva abaixo a nota do segundo trabalho da primeira unidade");
					double nota2unid1 = sc.nextDouble();
					
					if (nota1unid1+nota2unid1 > 10 || nota1unid1 + nota2unid1 < 0) {
						boolean invalid = true;
						while(invalid == true) {
							System.out.println("A soma está inválida, por favor digite novamente");
							
							System.out.println("Escreva abaixo a nota do primeiro trabalho da primeira unidade");
							nota1unid1 = sc.nextDouble();
							System.out.println("Escreva abaixo a nota do segundo trabalho da primeira unidade");
							nota2unid1 = sc.nextDouble();
							if (nota1unid1+nota2unid1 > 10 || nota1unid1 + nota2unid1 < 0) {
								
							}
							else {
								invalid = false;
							}
						}
						
					}
					
					Aluno newAlu = new Aluno();
					newAlu.setNome(nome);
					newAlu.setTrabalho1(nota1unid1);
					newAlu.setTrabalho2(nota2unid1);
					
					newAlu.setUnidNota1(newAlu.calcularNotaTotal(newAlu));
					
					System.out.println("Nota da primeira unidade atribuida para " + newAlu.getNome() + " \n UNIDADE 1: " + formatador.format(newAlu.getUnidNota1()) );
					
					System.out.println("Escreva abaixo a nota do primeiro trabalho da segunda unidade");
					double nota1unid2 = sc.nextDouble();
					System.out.println("Escreva abaixo a nota do segundo trabalho da segunda unidade");
					double nota2unid2 = sc.nextDouble();
					
					
					
					if (nota2unid2+nota1unid2 > 10 || nota1unid2 + nota2unid2 < 0) {
						boolean invalid = true;
						while(invalid == true) {
							System.out.println("A soma está inválida, por favor digite novamente");
							
							System.out.println("Escreva abaixo a nota do primeiro trabalho da primeira unidade");
							nota1unid1 = sc.nextDouble();
							System.out.println("Escreva abaixo a nota do segundo trabalho da primeira unidade");
							nota2unid2 = sc.nextDouble();
							if (nota1unid2+nota2unid2 > 10 || nota1unid2 + nota2unid2 < 0) {
								
							}
							else {
								invalid = false;
							}
						}
						
					}
					
					newAlu.setTrabalho1(nota1unid2);
					newAlu.setTrabalho2(nota2unid2);
					
					newAlu.setUnidNota2(newAlu.calcularNotaTotal(newAlu));
					
					System.out.println("Nota da segunda unidade atribuida para " + newAlu.getNome() + " \n UNIDADE 2: " + formatador.format(newAlu.getUnidNota2()) );
					
					
					newAlu.calcularMedia(newAlu);
					turmaA.turmaAlunos.add(newAlu);
					
					
					System.out.println("Média total do Aluno: " + formatador.format(newAlu.getMedia()));
					quantAlunos++;
					System.out.println("Pressione Enter para retornar ao menu");
					sc.nextLine();
					
					break;
					
				
					
				case "2":
					turmaA.mediaTurma(turmaA.turmaAlunos, quantAlunos);
					
					System.out.println("Média total do Aluno: " + formatador.format(turmaA.getMediaGeral()));
					
					break;
					
					
				case "3":
					
					System.out.println("Obrigado por estar conosco!");
					System.exit(0);
					break;
			
			}
			
			
			}
		}
	}

