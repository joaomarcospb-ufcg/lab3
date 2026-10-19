import java.util.*;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FilmNow fn = new FilmNow();

    while (true) {
        System.out.print("(A)Adicionar filme\n(M)Mostrar todos\n(D)Detalhar filme\n(E)Exibir HotList\n(H)Atribuir Hot\n(R)Remover Hot\n(S)Sair\n\nOpção> "
        );
        String entrada = sc.nextLine();
        if (entrada.equals("S")) {
            break;
        }

        else if (entrada.equals("A")) {
            System.out.print("Posição> ");
            int posicaoStr = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome> ");
            String nomeStr = sc.nextLine();
            System.out.print("Ano> ");
            String anoStr = sc.nextLine();
            System.out.print("Local> ");
            String localStr = sc.nextLine();

            System.out.println(fn.adicionarFilme(nomeStr, anoStr, localStr, posicaoStr));
        }

        else if (entrada.equals("M")) {
            System.out.println(fn.listaFilmes());
        }

        else if (entrada.equals("D")) {
            System.out.print("Posição> ");
            int posicaoStr = sc.nextInt();
            sc.nextLine();
            System.out.println(fn.detalharFilme(posicaoStr));
        }

        else if (entrada.equals("E")) {
            System.out.println(fn.exibirHotList());
        }

        else if (entrada.equals("H")) {
            System.out.print("Filme> ");
            int posicaoFilmes = sc.nextInt();
            sc.nextLine();
            System.out.print("Posição> ");
            int posicaoHotlist = sc.nextInt();
            sc.nextLine();
            System.out.println(fn.adicionarNaHotlist(posicaoFilmes, posicaoHotlist));
        }

        else if (entrada.equals("R")) {
            System.out.print("Posição> ");
            int posicaoHotlist = sc.nextInt();
            sc.nextLine();
            fn.removeDaHotlist(posicaoHotlist);
            System.out.println();
        }

        else {
            System.out.println("ENTRADA INVÁLIDA!\n");
        }
    }
}
