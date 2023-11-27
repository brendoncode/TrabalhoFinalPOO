import java.util.List;

public class Curso {
    private String nomeCurso;
    private String duracao;
    private List<Diciplina> diciplinaLista;

    //Contrutor
    public Curso(String nomeCurso, String duracao) {
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
    }

    //Metodos de acesso
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public List<Diciplina> getDiciplinaLista() {
        return diciplinaLista;
    }


    public void setDiciplinaLista(List<Diciplina> diciplinaLista) {
        this.diciplinaLista = diciplinaLista;
    }


}
