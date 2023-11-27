import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private String dataNascimento;
    private List<Double> notas;
    private List<Diciplina> diciplina;
    private Curso curso;

    //Construtor
    public Aluno(String nome, String cpf, String celular, String matricula, String dataNascimento, Curso curso) {
        super(nome, cpf, celular);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
    }

    //Metodos de acesso
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
        return diciplina;
    }

    public void setDiciplina(List<Diciplina> diciplina) {
        this.diciplina = diciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String listAlunos(){
        return getNome();
    }
        


}
