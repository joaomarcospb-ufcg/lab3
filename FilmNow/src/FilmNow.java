
public class FilmNow {

    private Filme[] filmes;

    private Filme[] hotList;

    private int iHotList;

    private static final int MAXLISTA = 100;

    private static final int MAXHOTLIST = 10;

    public FilmNow() {
        this.filmes = new Filme[MAXLISTA];
        this.hotList = new Filme[MAXHOTLIST];
        this.iHotList = 0;
    }

    public String listaFilmes() {
        String listagem = "";
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                listagem += i+1 + " - " + filmes[i].getNome() + "\n";
            }
        }
        return listagem;
    }

    public String detalharFilme(int posicao) {
        if (filmes[posicao - 1] == null) {
            return "POSIÇÃO INVÁLIDA\n";
        }
        for (Filme filmeHL : hotList) {
            if (filmeHL != null) {
                if (filmeHL.equals(filmes[posicao - 1])) {
                    return "🔥 " + filmes[posicao - 1].toString();
                }
            }
        }
        return filmes[posicao - 1].toString();
    }

    public String adicionarFilme(String nome, String anoLancamento, String plataforma, int posicaoFilme) {
        if (nome.trim().equals("") || anoLancamento.trim().equals("") || plataforma.trim().equals("")) {
            return "FILME INVÁLIDO\n";
        }
        if (1 <= posicaoFilme && posicaoFilme <= 100) {
                Filme novofilme = new Filme(nome, anoLancamento, plataforma);
                for (int i = 0; i < MAXLISTA; i++) {
                    if (filmes[i] != null) {
                        if (novofilme.equals(filmes[i])) {
                            return "FILME JÁ ADICIONADO!\n";
                        }
                    }
                }
                filmes[posicaoFilme - 1] = novofilme;
                return "FILME ADICIONADO!\n";
        }
        return "POSIÇÃO INVALIDA\n";
    }

    public String adicionarNaHotlist(int posicaoFilmes, int posicaoHotlist) {
        for (int i = 0; i < MAXHOTLIST; i++) {
            if (filmes[posicaoFilmes - 1].equals(hotList[i])) {
                return "FILME JÁ EXISTE NA HOTLIST!\n";
            }
        }

        if (1 <= posicaoFilmes && posicaoFilmes <= 100) {
            if (filmes[posicaoFilmes - 1] != null) {
                hotList[posicaoHotlist - 1] = filmes[posicaoFilmes - 1];
                return "ADICIONADO À HOTLIST NA POSIÇÃO " + (posicaoHotlist) + "!\n";
            } else {
                return "SEM FILMES NA POSIÇÃO!\n";
            }
        }
        return "POSIÇÃO INVÁLIDA!\n";
    }

    public void removeDaHotlist(int posicaoHoslist) {
        hotList[posicaoHoslist - 1] = null;
    }

    public String exibirHotList() {
        String hotlistStr = "";
        for (int i = 0; i < MAXHOTLIST; i++) {
            if (hotList[i] != null) {
                hotlistStr += (i + 1) + " - " + hotList[i].getNome() + ", " + hotList[i].getLancamento() + "\n";
            }
        }
        if (hotlistStr.equals("")) {
            return "Sem filmes na HotList!\n";
        }
        return hotlistStr;
    }
}
