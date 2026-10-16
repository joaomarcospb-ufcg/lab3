
public class FilmNow {

    private Filme[] filmes;

    private int iFilmes;

    private Filme[] hotList;

    private int iHotList;

    public FilmNow() {
        this.filmes = new Filme[100];
        this.iFilmes = 0;
        this.hotList = new Filme[10];
        this.iHotList = 0;
    }

    public String listaFilmes() {
        String listagem = "";
        for (Filme filme: filmes) {
            listagem += filme + "\n";
        }
        return listagem;
    }

    public String detalharFilme(int posicao) {
        //fazer comparação para ver se está na hotlist

        return filmes[posicao - 1].toString();
    }

    public boolean adicionarFilme(String nome, int anoLancamento, String plataforma, int posicaoFilme) {
        filmes[iFilmes] = new Filme(nome, anoLancamento, plataforma);
        iFilmes++;
    }

    public String adicionarNaHotlist(int posicao) {
        if (1 <= posicao && posicao <= 100) {
            if (filmes[posicao - 1] != null) {
                hotList[iHotList] = filmes[posicao - 1];
                return "Filme adicionado à HotList!"
            }
            return "Sem filmes na posição!"
        }
        return "Posição inválida!";
    }

    public void removeDaHotlist(int posicaoHoslist) {
        hotList[posicaoHoslist - 1] = null;
    }

    public String exibirHotList() {

    }

    private boolean estaNaHotlist(int posicao) {
        for (int i = 0, i < iHotList, i++) {
            if (filmes[posicao - 1].equals(hotList[i])) {
                return true;
            }
            return false;
        }
    }

}
