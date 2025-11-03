


public class Pessoa {

    private String Nome;
    private String Matricula;
    private String CPF;
    private static Tipo_Ocupacao Ocupacao = new Tipo_Ocupacao();
    private static double Quantidade_dinheiro;

    public Pessoa(String nome, String matricula, String cpf, Tipo_Ocupacao ocupacao, double quantia){
        this.Nome = nome;
        this.Matricula = matricula;
        this.CPF = cpf;
        this.Ocupacao = ocupacao;
        Pessoa.Quantidade_dinheiro = quantia;
    }

    public static void SetQuantidade_dinheiro(double valor){
        Pessoa.Quantidade_dinheiro = valor;
    }
    public static double getQuantidade_dinheiro(){
        return Quantidade_dinheiro;
    }

    public static Tipo_Ocupacao getOcupacao(){
        return Ocupacao;
    }
}