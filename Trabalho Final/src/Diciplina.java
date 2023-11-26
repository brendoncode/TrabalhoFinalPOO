public class Diciplina {
    private String nomeDiciplina;
    private Double cargaHoraria;
    private Curso curso;
    private Professor professor;
    private Aluno[] aluno;

    

    public Diciplina(String nomeDiciplina, Double cargaHoraria) {
        this.nomeDiciplina = nomeDiciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeDiciplina() {
        return nomeDiciplina;
    }
    public void setNomeDiciplina(String nomeDiciplina) {
        this.nomeDiciplina = nomeDiciplina;
    }
    
    public Double getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
     
    public Aluno[] getAluno() {
        return aluno;
    }
    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
    

    
}
