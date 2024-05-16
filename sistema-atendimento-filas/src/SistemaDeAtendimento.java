	import java.util.LinkedList;
	import java.util.Queue;

	public class SistemaDeAtendimento {
	    private Queue<Cliente> filaDeClientes;
	    private LinkedList<Funcionario> listaDeFuncionarios;

	    public SistemaDeAtendimento() {
	        this.filaDeClientes = new LinkedList<>();
	        this.listaDeFuncionarios = new LinkedList<>();
	    }

	    public void adicionarClienteNaFila(Cliente cliente) {
	        System.out.printf("%s : Cliente %d entrou na fila de espera. \n", java.time.LocalDateTime.now(), cliente.getId());
	        filaDeClientes.add(cliente);
	    }

	    public void adicionarFuncionario(Funcionario funcionario) {
	        listaDeFuncionarios.add(funcionario);
	    }

	    public void iniciarAtendimento() {
	        while (!filaDeClientes.isEmpty()) {
	            Cliente cliente = filaDeClientes.poll();
	            Funcionario funcionario = listaDeFuncionarios.poll();
	            if (funcionario != null) {
	                funcionario.atenderCliente(cliente);
	                listaDeFuncionarios.add(funcionario);
	            }
	        }
	        System.out.printf("\n%s : Todos os clientes foram atendidos. \n", java.time.LocalDateTime.now());
	    }
	}
