package entidades;

/*Nesta parte do c�digo � onde atribuimos valores ao Enum para evitar erro de inconsistencia de dados*/

public enum FormaPagamento {
	//Cria-se o enum normalmente com o seu c�digo;
	Visa (20), 
	MasterCard(50), 
	Boleto(30);

	
	//Variavel para atribui��o do c�digo.
	private int codigo;
	
	//Est� � o construtor do enun com o c�digo instanciado para obten��o e compara��o do mesmo
	private FormaPagamento( int codigo) {
		this.codigo = codigo;
	}
	
	//metodo para obten��o do codigo publico
	public int getCodigo () {
		return codigo;
	}
	
	//Metodo para compara��o e retorno do codigo
	public static FormaPagamento ValorDe (int codigo) {
		for (FormaPagamento valor : FormaPagamento.values()) {
			if (valor.getCodigo() == codigo) {
				 return valor;
			}
			
		}
				//lancamento de exce��o para valores invalidos.
				throw new IllegalArgumentException("C�digo da Forma de Pagamento Invalida! ");
	
	}
}
