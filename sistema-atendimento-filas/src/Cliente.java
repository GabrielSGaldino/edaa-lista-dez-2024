// src/Cliente.java
import java.util.Random;

public class Cliente {
    private int id;
    private int tempoDeAtendimento;

    public Cliente(int id) {
        this.id = id;
        this.tempoDeAtendimento = new Random().nextInt(6) + 1; // Tempo aleatório entre 1 e 5 segundos
    }

    public int getId() {
        return id;
    }

    public int getTempoDeAtendimento() {
        return tempoDeAtendimento;
    }
}
