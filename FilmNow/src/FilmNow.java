
public class FilmNow {

    private Filme[] filmes;

    private Filme[] hotList;

    private int iHotList;

    public FilmNow() {
        this.filmes = new Filme[100];
        this.hotList = new Filme[10];
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
            return "POSIÇÃO INVÁLIDA";
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
        if (nome.equals("") || anoLancamento.equals("") || plataforma.equals("")) {
            return "FILME INVÁLIDO\n";
        }
        if (1 <= posicaoFilme && posicaoFilme <= 100) {
                Filme novofilme = new Filme(nome, anoLancamento, plataforma);
                for (int i = 0; i < filmes.length; i++) {
                    if (filmes[i] != null) {
                        if (novofilme.equals(filmes[i])) {
                            return "FILME JÁ ADICIONADO!\n";
                        }
                    }
                filmes[posicaoFilme - 1] = novofilme;
                return "FILME ADICIONADO!\n";
            }
        }
        return "POSIÇÃO INVALIDA\n";
    }

    public String adicionarNaHotlist(int posicaoFilmes, int posicaoHotlist) {
        if (1 <= posicaoFilmes && posicaoFilmes <= 100) {
            if (filmes[posicaoFilmes - 1] != null) {
                hotList[posicaoHotlist - 1] = filmes[posicaoFilmes - 1];
                return "ADICIONADO À HOTLIST NA POSIÇÃO " + (posicaoHotlist + 1) + "!";
            } else {
                return "SEM FILMES NA POSIÇÃO!";
            }
        }
        return "POSIÇÃO INVÁLIDA!";
    }

    public void removeDaHotlist(int posicaoHoslist) {
        hotList[posicaoHoslist - 1] = null;
    }

    public String exibirHotList() {
        String hotlistStr = "";
        for (int i = 0; i < hotList.length; i++) {
            if (hotList[i] != null) {
                hotlistStr += i + 1 + " - " + hotList[i].getNome() + ", " + hotList[i].getLancamento();
            }
        }
        if (hotlistStr.equals("")) {
            return "Sem filmes na HotList!";
        }
        return hotlistStr;
    }
}
