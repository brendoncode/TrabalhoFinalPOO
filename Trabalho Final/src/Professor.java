import java.util.List;

public class Professor extends Pessoa {
    private int cracha;
    private Double salario;
    private String formacao;
    private List<Diciplina> diciplinas;   
    private List<Aluno> alunos;


    public Professor(String nome, String cpf, String celular, int cracha, Double salario, String formacao) {
        super(nome, cpf,  celular);
        this.cracha = cracha;
        this.salario = salario;
        this.formacao = formacao;
    }
        

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }


    public List<Diciplina> getDiciplinas() {
        return diciplinas;
    }


    public void setDiciplinas(List<Diciplina> diciplinas) {
        this.diciplinas = diciplinas;
    }



    public List<Aluno> getAlunos() {
        return alunos;
    }


    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    






}
