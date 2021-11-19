public class PessoaEstadoSeparado implements PessoaEstado{

    private PessoaEstadoSeparado() {};
    private static PessoaEstadoSeparado instance = new PessoaEstadoSeparado();
    public static PessoaEstadoSeparado getInstance(){
        return instance;
    }

    public String getNomeEstado(){
        return "Solteiro";
    }

}
