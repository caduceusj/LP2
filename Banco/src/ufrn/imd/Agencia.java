package ufrn.imd;
import java.util.ArrayList;
import java.util.Scanner;


public class Agencia extends Conta{
	ArrayList<Conta> contasAgencia = new ArrayList<Conta>();
	ArrayList<Integer> ContasID = new ArrayList<Integer>();
	
public void setAcc(){
	
	Conta n1 = new Conta();
	Conta n2 = new Conta();
	Conta n3 = new Conta();
	
	n1.setID(250);
	n1.setCPF(89090977);
	n1.setNome("João Victor Gibson");
	n1.setSaldo(9500.50);
	n1.setSenha(12345678);
	
	
	n2.setID(1700);
	n2.setCPF(111111111);
	n2.setNome("Paula Tejano");
	n2.setSaldo(9500.50);
	n2.setSenha(87654321);
	
	n3.setID(2);
	n3.setCPF(33333333);
	n3.setNome("Zeca Gado");
	n3.setSaldo(753.70);
	n3.setSenha(69420);
	
	ContasID.add(n1.getID());
	ContasID.add(n2.getID());
	ContasID.add(n3.getID());
	
	contasAgencia.add(n1);
	contasAgencia.add(n2);
	contasAgencia.add(n3);
}
	

	public void sacar(double saque, Conta count) {
		
		if(count.getSaldo() < saque) {
			System.out.println("Não foi possível completar sua operação" + "\n" + "MOTIVO: SALDO INSUFICIENTE");
			count.setExtrato("Tentativa falha de Saque");
		}
		else {
			double current = count.getSaldo();
			current = current - saque;
			count.setSaldo(current);
			System.out.println("OPERAÇÃO REALIZADA COM SUCESSO" + "\n" + "Seu saldo atual é: " + count.getSaldo() + "\n" + "--------------------------------");
	
		}
	}
	public void depositar(double deposito, Conta count) {
		
		if(deposito <= 0) {
			System.out.println("Não foi possível completar sua operação" + "\n" + "MOTIVO: VALOR INVÁLIDO");
			count.setExtrato("Valor inválido de depósito");
		}
		else {
			double current = count.getSaldo();
			current = current + deposito;
			count.setSaldo(current);
			System.out.println("OPERAÇÃO REALIZADA COM SUCESSO" + "\n" + "Seu saldo atual é: " + count.getSaldo() + "\n" + "--------------------------------");
		}
	}
}
