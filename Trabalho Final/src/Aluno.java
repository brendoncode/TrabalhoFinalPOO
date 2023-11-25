public class Aluno extends Pessoa {
    private int matricula;
    private String dataNascimento;
    private Curso curso;
    private Diciplina[] diciplina;
    private Double[] notas;
    
    public Aluno(String nome, String cpf, String rg, String celular, int matricula, String dataNascimento, Curso curso,
            Diciplina[] diciplina, Double[] notas) {
        super(nome, cpf, rg, celular);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.diciplina = diciplina;
        this.notas = notas;
    }
}
