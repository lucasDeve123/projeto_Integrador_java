import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Bot {
    private String nome = "BOT INTERGRADOR";
    private String senha = "1";
    private String descricao = "Bot criado para auxiliar os usuarios"+
                                " para pesquisar informacoes do ecommerce";

    private String enderecoExcel = "C://Users//56809821880//Documents//Projeto_Integrador_FPOO_JAVA-master/ProjetoIntegrador-Lucas.xls";

    LerEscreverExcel teste = new LerEscreverExcel(enderecoExcel);

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void botOpcoes() {
        System.out.println("Oi, eu sou o "+this.nome);
        System.out.println("Eu sou o "+this.descricao);
        System.out.println("Aqui estão as opções aonde posso ajudar você");
        System.out.println("1 - Todos os produtos");
        System.out.println("2 - Todos os produtos e seus preços");
        System.out.println("3 - Descrições dos produtos");
    }

    public void executarBot(int opcao) throws BiffException, IOException {

        Scanner sc = new Scanner(System.in);

        teste.lerExcel();

        switch (opcao) {
            case 1:
                System.out.println("----------");
                for (int x = 1; x <= teste.getAs2().length - 1; x++) {
                    System.out.printf("%s\n", teste.getAs2()[x]);
                    System.out.println("----------");
                }
                break;
            case 2:
                System.out.println("----------");
                for (int x = 1; x <= teste.getAs3().length - 1; x++) {
                    System.out.printf("%s: %s\n", teste.getAs2()[x], teste.getAs3()[x]);
                    System.out.println("----------");
                }
                break;
            case 3:
                System.out.println("----------");
                for (int x = 1; x <= teste.getAs4().length - 1; x++) {
                    System.out.printf("%s: %s\n", teste.getAs2()[x], teste.getAs4()[x]);
                    System.out.println("----------");
                }
                break;
        }
        System.out.println("Desejar escolher outra opcao?s ou N");
    }
}
