
import java.util.ArrayList;
import java.util.List;
public class Aluno extends Pessoa {
    private String matricula;
    private String dataNascimento;
    private List<Double> notas = new ArrayList<>();
    private List<Diciplina> diciplinas = new ArrayList<>();
    private Curso curso;
    private List<Avaliacao> avaliacaos = new ArrayList<>();

    //Construtor
    public Aluno(int id,String nome, String cpf, String celular, String matricula, String dataNascimento, Curso curso) {
        super(id,nome, cpf, celular);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
    }

    //Metodos de acesso
    @Override
    public void setId(int id) {
        super.setId(id);
        id +=id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(Double nota) {
        this.notas.add(nota);
    }
 
    public List<Diciplina> getDiciplina() {
        return diciplinas;
    }

    public void setDiciplina(Diciplina diciplina) {
        this.diciplinas.add(diciplina);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(Avaliacao avaliacaos) {
        this.avaliacaos.add(avaliacaos);
    }

    
    public void listarDiciplinas(){
        for(Diciplina diciplinaTemp : this.diciplinas){
            System.out.println(diciplinaTemp.getId() +diciplinaTemp.getNomeDiciplina());
        }

    }

    public void imprimirSituacao(){
        for(Avaliacao avaliacao : avaliacaos){
            System.out.println("nome : "+ avaliacao.getAluno());
            System.out.println("nome : "+ avaliacao.getData());
            System.out.println("nome : "+ avaliacao.getMedia());      
        }
    }


}
