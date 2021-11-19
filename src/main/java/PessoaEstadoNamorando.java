public class PessoaEstadoNamorando implements PessoaEstado{

    private PessoaEstadoNamorando() {};
    private static PessoaEstadoNamorando instance = new PessoaEstadoNamorando();
    public static PessoaEstadoNamorando getInstance(){
        return instance;
    }

    public String getNomeEstado(){
        return "Namorando";
    }
}
