public class Filme {

    private String nome;

    private int anoLancamento;

    private String plataforma;

    public Filme(String nome, int anoLancamento, String plataforma){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.plataforma = plataforma;
    }

    public String toString() {
        return this.nome + " - " + this.anoLancamento;
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
        if (oFilme.getNome() == this.nome && oFilme.getLancamento() == this.getLancamento()) {
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

    public int getLancamento() {
        return this.anoLancamento;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

}

