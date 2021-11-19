public class PessoaEstadoSolteiro implements PessoaEstado{

    private PessoaEstadoSolteiro() {};
    private static PessoaEstadoSolteiro instance = new PessoaEstadoSolteiro();
    public static PessoaEstadoSolteiro getInstance(){
        return instance;
    }

    public String getNomeEstado(){
        return "Solteiro";
    }
}
