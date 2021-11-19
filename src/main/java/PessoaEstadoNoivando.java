public class PessoaEstadoNoivando implements PessoaEstado{

    private PessoaEstadoNoivando() {};
    private static PessoaEstadoNoivando instance = new PessoaEstadoNoivando();
    public static PessoaEstadoNoivando getInstance(){
        return instance;
    }

    public String getNomeEstado(){
        return "Solteiro";
    }

}
