import java.util.*;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //FilmNow fn = new FilmNow();

    while (true) {
        System.out.print("(A)Adicionar filme\n(M)Mostrar todos\n(D)Detalhar filme\n(E)Exibir HotList\n(H)Atribuir Hot\n(R)Remover Hot\n(S)Sair\n\nOpção> "
        );
        String entrada = sc.nextLine();
        if (entrada.equals("S")) {
            break;
        }
    }
}
