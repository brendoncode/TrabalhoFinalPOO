public class Curso {
    private String nomeCurso;
    private Double duracao;
    private Diciplina[] diciplinaLista;
    public int oi;

    public Curso(String nomeCurso, Double duracao) {
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
    }


    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public Double getDuracao() {
        return duracao;
    }
    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Diciplina[] getDiciplinaLista() {
        return diciplinaLista;
    }
    public void setDiciplinaLista(Diciplina[] diciplinaLista) {
        this.diciplinaLista = diciplinaLista;
    }
}
