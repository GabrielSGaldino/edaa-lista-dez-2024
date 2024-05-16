// src/Funcionario.java
public class Funcionario {
    private int id;

    public Funcionario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void atenderCliente(Cliente cliente) {
    	System.out.println("");
        try {
            System.out.printf("%s : Atendendo Cliente %d...\n", java.time.LocalDateTime.now(), cliente.getId());
            Thread.sleep(cliente.getTempoDeAtendimento() * 1000);
            System.out.printf("%s : Cliente %d atendido pelo Funcionário %d : com o tempo de %d segundos.\n",
                    java.time.LocalDateTime.now(), cliente.getId(), this.id, cliente.getTempoDeAtendimento());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
