package ufrn.imd;

import java.util.ArrayList;

public class Conta {
	private double saldo;
	private int id;
	private String nome;
	private int cpf;
	private int senha;
	private ArrayList<String> extrato = new ArrayList<String>();

	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public ArrayList<String> getExtrato() {
		return extrato;
	}
	public void setExtrato(String operacao) {
		extrato.add(operacao);
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return cpf;
	}
	public void setCPF(int cPF) {
		cpf = cPF;
	}


}
