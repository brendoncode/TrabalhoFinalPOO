public class Main {
    public static void main(String[] args) {
        // Criação de alunos
        
        Aluno aluno1 = new Aluno("nome","cpf","rg","celular",1,"data");


        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setMatricula("67890");

        // Criação de professor
        Professor professor = new Professor();
        professor.setNome("Carlos");
        professor.setCracha("11111");

        // Criação de disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setNomeDisciplina("Matemática");
        disciplina.setProfessor(professor);

        // Adicionando alunos à disciplina
        disciplina.getAlunos().add(aluno1);
        disciplina.getAlunos().add(aluno2);

        // Criação de curso
        Curso curso = new Curso();
        curso.setNomeCurso("Engenharia");
        curso.getDisciplinas().add(disciplina);

        // Atribuindo curso aos alunos
        aluno1.setCurso(curso);
        aluno2.setCurso(curso);

        // Realizando avaliações
        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setDisciplina(disciplina);
        avaliacao1.setAluno(aluno1);
        avaliacao1.setNota(8.0);

        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setDisciplina(disciplina);
        avaliacao2.setAluno(aluno2);
        avaliacao2.setNota(6.5);

        // Imprimindo relatório
        System.out.println("Relatório de Avaliações:");
        System.out.println("Aluno: " + avaliacao1.getAluno().getNome() + ", Disciplina: " + avaliacao1.getDisciplina().getNomeDisciplina() + ", Nota: " + avaliacao1.getNota());
        System.out.println("Aluno: " + avaliacao2.getAluno().getNome() + ", Disciplina: " + avaliacao2.getDisciplina().getNomeDisciplina() + ", Nota: " + avaliacao2.getNota());
    }
}