public class PessoaEstadoCasado implements PessoaEstado{

    private PessoaEstadoCasado() {};
    private static PessoaEstadoCasado instance = new PessoaEstadoCasado();
    public static PessoaEstadoCasado getInstance(){
        return instance;
    }

    public String getNomeEstado(){
        return "Solteiro";
    }
}
