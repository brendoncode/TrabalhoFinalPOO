public class Diciplina {
    private String nomeDiciplina;
    private Double cargaHoraria;
    private Curso curso;
    private Professor professor;
    private Aluno[] aluno;
    
    public Diciplina(String nomeDiciplina, Double cargaHoraria, Curso curso, Professor professor, Aluno[] aluno) {
        this.nomeDiciplina = nomeDiciplina;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
        this.professor = professor;
        this.aluno = aluno;
    }

    
}
