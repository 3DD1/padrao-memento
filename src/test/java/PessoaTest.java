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

    @Test
    void deveRetornarEstadoInicial(){
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado(PessoaEstadoSolteiro.getInstance());
        pessoa.setEstado(PessoaEstadoNamorando.getInstance());
        pessoa.restaurarEstado(0);
        assertEquals(PessoaEstadoSolteiro.getInstance(), pessoa.getEstado());
    }
    @Test
    void deveRetornarEStadoAnterior(){
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado(PessoaEstadoSolteiro.getInstance());
        pessoa.setEstado(PessoaEstadoNamorando.getInstance());
        pessoa.setEstado(PessoaEstadoNoivando.getInstance());
        pessoa.setEstado(PessoaEstadoCasado.getInstance());
        pessoa.setEstado(PessoaEstadoSeparado.getInstance());
        pessoa.restaurarEstado(2);
        assertEquals(PessoaEstadoNoivando.getInstance(), pessoa.getEstado());
    }
}