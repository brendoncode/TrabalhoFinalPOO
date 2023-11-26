public class Aluno extends Pessoa {
    private int matricula;
    private String dataNascimento;
    private Double[] notas;
    private Diciplina[] diciplina;
    private Curso curso;

    public Aluno(String nome, String cpf, String celular, int matricula, String dataNascimento) {
        super(nome, cpf, celular);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }


    public Diciplina[] getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(Diciplina[] diciplina) {
        this.diciplina = diciplina;
    }


    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    

}
