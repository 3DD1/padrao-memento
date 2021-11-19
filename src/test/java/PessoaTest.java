import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveArmazenarEstados(){
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado(PessoaEstadoSolteiro.getInstance());
        pessoa.setEstado(PessoaEstadoNamorando.getInstance());
        assertEquals(2, pessoa.getEstados().size());
    }
}