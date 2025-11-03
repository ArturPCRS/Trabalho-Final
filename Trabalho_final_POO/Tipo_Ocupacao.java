import java.util.ArrayList;

public class Tipo_Ocupacao {

    public enum Ocupacao{
        ESTUDANTE,
        ENGENHEIRO, 
        PROFESSOR, 
        CIENTISTA, 
        ANALISTA,
        DESENVOLVEDOR,
        GESTO,
        DESIGNER,
        PESQUISADOR,};

    public ArrayList<Ocupacao> ListaFuncionarioPucrs() {
        ArrayList<Ocupacao> LISTA_FUNCIONARIO_PUCRS = new ArrayList<>();
        LISTA_FUNCIONARIO_PUCRS.add(Ocupacao.PROFESSOR);

        return LISTA_FUNCIONARIO_PUCRS;
    }

    public ArrayList<Ocupacao> ListaEstudante() {
        ArrayList<Ocupacao> LISTA_ESTUDANTE = new ArrayList<>();
        LISTA_ESTUDANTE.add(Ocupacao.ESTUDANTE);

        return LISTA_ESTUDANTE;
    }

    public ArrayList<Ocupacao> ListaProfissionalTecnopuc() {
        ArrayList<Ocupacao> LISTA_PROFISSIONAL_TECNOPUC = new ArrayList<>();
        LISTA_PROFISSIONAL_TECNOPUC.add(Ocupacao.ENGENHEIRO);

        return LISTA_PROFISSIONAL_TECNOPUC;
    }
}
