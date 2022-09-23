package ufrn.imd;

import java.util.Scanner;

import java.util.Random;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agencia a = new Agencia();
		Conta count = new Conta();
		boolean passclear = false;
		boolean still = true;
		Random genId = new Random();
		a.setAcc();
		System.out.println("Bem Vindo, Pressione Enter para Iniciar");
		while (true) {
			sc.nextLine();
			System.out.println("Digite a opção desejada: \n" + "1 - novo cliente \n" + "2 - Buscar Usuario \n  3 - Desativar uma Conta \n " + "9 - opções \n"
					+ "0 - Sair");
			String opcao =  sc.nextLine();
			switch (opcao) {
			case "1":
				
				//Coleta dos Dados
				System.out.println("Digite o nome do Cliente:");
				String nome = sc.nextLine();
				
				System.out.println("Digite o CPF do Cliente:");
				int newCpf = Integer.parseInt(sc.nextLine());
				
				System.out.println("Digite a senha para a sua Conta: \n NUMEROS APENAS!");
				int newPass = sc.nextInt();			
				
				//Criação da Conta
				Conta newAcc = new Conta();
				newAcc.setNome(nome);
				newAcc.setCPF(newCpf);
				newAcc.setSenha(newPass);

				
				//Verifica se o ID já existe ou não
				while(passclear == false) {
					int newId = genId.nextInt(0, 1500);
					int accCount = a.ContasID.size()-1;

					if(newId == (a.ContasID.get(accCount))) {
						accCount--;
					}	
					else {
						newAcc.setID(newId);
						passclear = true;
					}
				}
				
				//Adiciona aos Arrays dinâmicos do Banco para que seja possível localizar a conta na Agencia

				a.contasAgencia.add(newAcc);
				a.ContasID.add(newAcc.getID());
				passclear = false;
				System.out.println("Conta criada com sucesso!" + "\n ----------------------------------" + "\n IMPORTANTE: SEU NOVO ID É: " + newAcc.getID());
				break;
			case "2":
				//Busca na Agência específica se o ID já existe ou não
				System.out.println("Digite o ID da conta");
				int id = sc.nextInt();
				int accCount = a.ContasID.size() - 1;
				while (accCount >= 0) {

					if (id == (a.ContasID.get(accCount))) {
						count = a.contasAgencia.get(accCount);
						while (passclear != true) {
							
							//Loopa caso a pessoa coloque a senha incorreta
							System.out.println("Conta Encontrada!, digite a senha:");
							int senha = sc.nextInt();

							if (senha == count.getSenha()) {
								passclear = true;
								System.out.println("Login realizado com sucesso!");
								System.out.println("Nome: "+ count.getNome() + "\n");
								System.out.println("CPF: "+ count.getCPF() + "\n");
								System.out.println("Saldo: "+ count.getSaldo() + "\n");
								accCount = -1;
								
								
							} else {
								System.out.println("Senha Incorreta!, tente novamente:");
							}
						} 
							while(still == true) {
								
								System.out.println("Selecione a operação que você gostaria de realizar abaixo: \n 1- Sacar \n 2- Depositar \n 3- Verificar Extrato \n 4- Logoff");
								int option = sc.nextInt();
								switch(option){
								case 1:
									System.out.println("Seu saldo atual é: " + count.getSaldo() + "\n" + "------------------------------------" + "\n" +"Quanto você gostaria de sacar?");
									double saque = sc.nextDouble();
									a.sacar(saque, count);
									break;

								case 2:
									System.out.println("Seu saldo atual é: " + count.getSaldo() + "\n" + "------------------------------------" + "\n" +"Quanto você gostaria de depositar?");
									double deposito = sc.nextDouble();
									a.depositar(deposito, count);
									break;
								
								case 3:
									
									break;
								case 4:
									still = false;
									
									break;
									
								}
							
						}
					} else {
						accCount--;
					}
				}
				break;
			case "0":
				System.out.println("Obrigado por estar conosco!");
				System.exit(0);
			}

		}
	} 
}
