package entidades;

/*Nesta parte do código é onde atribuimos valores ao Enum para evitar erro de inconsistencia de dados*/

public enum FormaPagamento {
	//Cria-se o enum normalmente com o seu código;
	Visa (20), 
	MasterCard(50), 
	Boleto(30);

	
	//Variavel para atribuição do código.
	private int codigo;
	
	//Esté é o construtor do enun com o código instanciado para obtenção e comparação do mesmo
	private FormaPagamento( int codigo) {
		this.codigo = codigo;
	}
	
	//metodo para obtenção do codigo publico
	public int getCodigo () {
		return codigo;
	}
	
	//Metodo para comparação e retorno do codigo
	public static FormaPagamento ValorDe (int codigo) {
		for (FormaPagamento valor : FormaPagamento.values()) {
			if (valor.getCodigo() == codigo) {
				 return valor;
			}
			
		}
				//lancamento de exceção para valores invalidos.
				throw new IllegalArgumentException("Código da Forma de Pagamento Invalida! ");
	
	}
}
