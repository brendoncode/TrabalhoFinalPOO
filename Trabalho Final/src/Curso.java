import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String nomeCurso;
    private String duracao;
    private List<Diciplina> diciplinaLista = new ArrayList<>();

    //Contrutor
    public Curso(int id,String nomeCurso, String duracao) {
        this.id=id;
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
    }

    //Metodos de acesso

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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



}
