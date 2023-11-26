public class Aluno extends Pessoa {
    private int matricula;
    private String dataNascimento;
    private Double[] notas;
    private Diciplina[] diciplina;
    private Curso curso;
    
    public Aluno(String nome, String cpf, String rg, String celular, int matricula, String dataNascimento) {
        super(nome, cpf, rg, celular);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
    
 
