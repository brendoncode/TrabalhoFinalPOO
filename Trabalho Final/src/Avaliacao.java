import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
    private String data;
    private Aluno aluno;
    private Diciplina diciplina;
    private List<Double> notas = new ArrayList<>();
    private double media;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas.add(notas);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public Diciplina getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(Diciplina diciplina) {
        this.diciplina = diciplina;
    }

    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    

}
