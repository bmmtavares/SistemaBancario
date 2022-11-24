package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma conta bancária
 * @author Bruno Macedo
 * @version 1.0
 */

public class Conta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//atributos de classe
	private int agencia;
	private int numero;
	private double saldo;
	
	/*construtor de classes
	 * 
	 */		
	  public Conta() {
	  
	  }
	 	
	public Conta(int agencia, int numero, double saldo) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Acrescenta valor ao saldo da conta
	 * @param valor que será depositado
	 */
	public void depositar(double valor) {
		
		this.saldo += valor;
		
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor
	 * @see depositar
	 */
	public void retirar(double valor) {
		
		this.saldo -= valor;
		
	}
	
	/**
	 * Varifica o saldo da conta
	 * @return valor do saldo da conta
	 */
	public double getSaldo() {
		
		return this.saldo;
		
	}
}
