import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    Scanner leitor = new Scanner(System.in);

    public void CarregarPassagem(){
        String Mensagem =  String.format
        ("Escolha os valores abaixo:" 
        + "\n [1] R$ 15.00"
        + "\n [2] R$ 50.00"
        + "\n [3] R$ 100.00" 
        + "\n [4] R$ 150.00"
        );

        Mensagem.toString();
        int escolha = leitor.nextInt();

        switch(escolha){
            case 1:
                double Valor_Entrada = 15.00;
                double NovaQuantidade_dinheiro = Pessoa.getQuantidade_dinheiro() - Valor_Entrada;
                Pessoa.SetQuantidade_dinheiro(NovaQuantidade_dinheiro);
            break;

            case 2:
                Valor_Entrada = 50.00;
                NovaQuantidade_dinheiro = Pessoa.getQuantidade_dinheiro() - Valor_Entrada;
                Pessoa.SetQuantidade_dinheiro(NovaQuantidade_dinheiro);
            break;

            case 3:
                Valor_Entrada = 100.00;
                NovaQuantidade_dinheiro = Pessoa.getQuantidade_dinheiro() - Valor_Entrada;
                Pessoa.SetQuantidade_dinheiro(NovaQuantidade_dinheiro);
            break;

            case 4:
                Valor_Entrada = 150.00;
                NovaQuantidade_dinheiro = Pessoa.getQuantidade_dinheiro() - Valor_Entrada;
                Pessoa.SetQuantidade_dinheiro(NovaQuantidade_dinheiro);
            break;

            default:
                throw new IllegalArgumentException("Informado um valor inválido: " + escolha);    
        }
    }

    public String GerarBoleto(){
       
    }
}
