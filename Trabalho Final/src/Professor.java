public class Professor extends Pessoa {
    private int cracha;
    private Double salario;
    private String formacao;
    private Diciplina[] diciplina;
    private Aluno[] alunos;
    
    public Professor(String nome, String cpf, String rg, String celular, int cracha, Double salario, String formacao,
            Diciplina[] diciplina, Aluno[] alunos) {
        super(nome, cpf, rg, celular);
        this.cracha = cracha;
        this.salario = salario;
        this.formacao = formacao;
        this.diciplina = diciplina;
        this.alunos = alunos;
    }


}
