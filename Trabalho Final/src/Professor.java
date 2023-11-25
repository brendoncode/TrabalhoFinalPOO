public class Professor extends Pessoa {
    private int cracha;
    private Double salario;
    private String graduacao;
    private Diciplina[] diciplina;
    private Aluno[] alunos;
    
    public Professor(String nome, String cpf, String rg, String celular, int cracha, Double salario, String graduacao,
            Diciplina[] diciplina, Aluno[] alunos) {
        super(nome, cpf, rg, celular);
        this.cracha = cracha;
        this.salario = salario;
        this.graduacao = graduacao;
        this.diciplina = diciplina;
        this.alunos = alunos;
    }


}
