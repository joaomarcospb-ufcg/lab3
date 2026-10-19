public class Filme {

    private String nome;

    private String anoLancamento;

    private String local;

    public Filme(String nome, String anoLancamento, String plataforma){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.local = plataforma;
    }

    public String toString() {
        return this.nome + ", " + this.anoLancamento + "\n" + this.local + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Filme)) {
            return false;
        }
        Filme oFilme = (Filme) o;
        if (oFilme.getNome().equals(this.nome) && oFilme.getLancamento().equals(this.anoLancamento)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String nomeAno = this.nome + this.anoLancamento;
        return nomeAno.hashCode();
    }

    public String getNome() {
        return this.nome;
    }

    public String getLancamento() {
        return this.anoLancamento;
    }

    public String getLocal() {
        return this.local;
    }

}

