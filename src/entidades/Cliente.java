package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome, endereco;
	
	Integer formaPagamento;
	
	
	public Cliente() {
	}


	public Cliente(String nome, String endereco, FormaPagamento formaPagamento) {
		this.nome = nome;
		this.endereco = endereco;
		//Sem atribuição padrão, apenas o metodo get
		setFormaPagamento(formaPagamento);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	//transformação do valor int para FormaPagamento
	public FormaPagamento getFormaPagamento() {
		return FormaPagamento.ValorDe(formaPagamento);
	}

	//transformação de valor FormaPagamento em int
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		//proteção contra valor nulo
		if (formaPagamento != null) {
		this.formaPagamento = formaPagamento.getCodigo();
		}
		
	}


	@Override
	public String toString() {
		return "\n------------------\nCliente\n------------------ "
				+ "\nNome: " + nome
				+ "\nEndereço: " + endereco
				+ "\nForma de Pagamento: " + getFormaPagamento()
				+"\n------------------";
	}
	
	
	
	

}
