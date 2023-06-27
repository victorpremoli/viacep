import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsultaCep consultaCep = new ConsultaCep();
        Scanner scanner = new Scanner(System.in);
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        System.out.print("Digite o cep que deseja buscar:");
        String cep = scanner.nextLine();

        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            geradorDeArquivo.salvaJson(endereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");
        }



    }
}
