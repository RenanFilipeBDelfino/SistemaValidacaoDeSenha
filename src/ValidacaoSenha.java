import java.util.Scanner;

public class ValidacaoSenha{

    private String senhaSalva = "JavaNoViraya";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ValidacaoSenha sistema = new ValidacaoSenha();

        String nome;
        String senha;
        int tentativas = 0;

        System.out.print("Bom dia! Poderia digitar seu nome, por favor: ");
        nome = scanner.nextLine();

        while (tentativas < 3) {

            System.out.print("Poderia digitar a senha, por favor: ");
            senha = scanner.nextLine();

            if (senha.equals(sistema.senhaSalva)) {

                System.out.println(
                        "Senha correta, seja bem-vindo " + nome + "!"
                );

                break;

            } else {

                tentativas++;

                System.out.println(
                        "Senha incorreta, por gentileza, tente novamente!"
                );
            }
        }

        if (tentativas == 3) {

            System.out.println(
                    "3 tentativas: múltiplas tentativas — Sistema Bloqueado!"
            );
        }

        scanner.close();
    }
}