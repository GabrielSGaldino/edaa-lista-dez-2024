	public class Main {
	    public static void main(String[] args) {
	    	SistemaDeAtendimento sistema = new SistemaDeAtendimento();

	        for (int i = 1; i <= 10; i++) {
	            Cliente cliente = new Cliente(i);
	            sistema.adicionarClienteNaFila(cliente);
	        }

	        for (int i = 1; i <= 10; i++) {
	            Funcionario funcionario = new Funcionario(i);
	            sistema.adicionarFuncionario(funcionario);
	        }

	        sistema.iniciarAtendimento();
	    }
	}
