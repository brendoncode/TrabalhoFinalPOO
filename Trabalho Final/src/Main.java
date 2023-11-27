import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static Scanner input = new Scanner(System.in);
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Diciplina> diciplinas = new ArrayList<>();
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
    int opcao;
    cursos.add(new Curso(0,"Ciencia da Computação", "4"));
    cursos.add(new Curso(1,"Matematica", "4"));
    cursos.add(new Curso(2,"Direito", "5"));

    diciplinas.add(new Diciplina(0,"alg 1", "60", cursos.get(0)));
    diciplinas.add(new Diciplina(1,"alg 2", "60", cursos.get(0)));
    diciplinas.add(new Diciplina(2,"estrutura de dados 1", "60", cursos.get(0)));
    diciplinas.add(new Diciplina(3,"estrutura de dados 2", "60", cursos.get(0)));
    diciplinas.add(new Diciplina(4,"Lab Rede", "60", cursos.get(0)));

    diciplinas.add(new Diciplina(5,"calculo 1", "60", cursos.get(1)));
    diciplinas.add(new Diciplina(6,"calculo 2", "60", cursos.get(1)));
    diciplinas.add(new Diciplina(7,"calculo 3", "60", cursos.get(1)));
    diciplinas.add(new Diciplina(8,"geometria", "60", cursos.get(1)));
    diciplinas.add(new Diciplina(9,"Algebra", "60", cursos.get(1)));

    diciplinas.add(new Diciplina(10,"Direito Penal", "60", cursos.get(2)));
    diciplinas.add(new Diciplina(11,"Direito Civil", "60", cursos.get(1)));
    diciplinas.add(new Diciplina(12,"Filosofia do Direito", "60", cursos.get(1)));
    diciplinas.add(new Diciplina(13,"Historia do direiro", "60", cursos.get(1)));
    diciplinas.add(new Diciplina(14,"LGPD", "60", cursos.get(1)));

    
    alunos.add(new Aluno(0,"matheus", "123456789", "999557431", "123", "2011200", cursos.get(0)));
    professores.add(new Professor(0,"Frank", "987654321", "99785251", "123456", "9000", "ensino medio completo"));

        while (true) {
            System.out.println("1. Cadastrar curso");
            System.out.println("2. Cadastrar diciplina");
            System.out.println("3. Cadastrar aluno");
            System.out.println("4. Cadastrar professor");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Cursos");
            System.out.println("7. Listar Diciplinas");
            System.out.println("8. Listar Professores");
            System.out.println("9. Matricular Aluno");
            System.out.println("10. Relatorio do Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    cadastroCurso();
                    break;
                case 2:
                    cadastroDiciplina();
                    break;
                case 3:
                    cadastroAluno();
                    break;
                case 4:
                    cadastroProfessor();
                    break;
                case 5:
                    for(Aluno alunoTemp : alunos){
                        System.out.println(alunoTemp.getId()+". "+alunoTemp.getNome());
                    }
                    break;
                case 6:
                    for(Curso cursoTemp : cursos){
                    System.out.println(cursoTemp.getId()+". " + cursoTemp.getNomeCurso());
                    }                    
                    break;

                case 7:
                    for(Diciplina diciplinaTemp : diciplinas){
                    System.out.println(diciplinaTemp.getId()+ ". " 
                                        +diciplinaTemp.getNomeDiciplina() + " - " 
                                        + diciplinaTemp.getCurso().getNomeCurso());
                    }                    
                    break;

                case 8:            
                    for(Professor professorTemp : professores){
                        System.out.println(professorTemp.getNome());
                    }                    
                    break;
                case 9:
                    matricular();
                    break;

                case 10:
                    situacao();
                    break;

                case 0:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
            
        }
        
    }

    public static void cadastroCurso(){    
        System.out.println("Nome : ");
        String nome = input.nextLine();
        System.out.println( "Duração : ");
        String duracao = input.nextLine();
        int idTemp = cursos.size();
        cursos.add(new Curso(idTemp,nome, duracao));
        
    }

    public static void cadastroDiciplina(){       
        System.out.println("Nome : ");
        String nome = input.nextLine();
        System.out.println("Carga Horaria : ");
        String cargaHoraria = input.nextLine();
        for(Curso cursoTemp : cursos){
            System.out.println(cursoTemp.getId()+". "+cursoTemp.getNomeCurso());
        }
        System.out.println("Insira o id co curso ");
        int aux = (input.nextInt());

        int idTemp = diciplinas.size();
        diciplinas.add(new Diciplina(idTemp,nome, cargaHoraria,cursos.get(aux)));
         
    }

    public static void cadastroAluno(){
        System.out.println("Nome : ");
        String nome = input.nextLine();
        System.out.println("CPF : ");
        String cpf = input.nextLine();
        System.out.println("Numero de Celular : ");
        String celular = input.nextLine();
        System.out.println("Matricula : ");
        String matricula = input.nextLine();
        System.out.println("Data de Nascimento : ");
        String data = input.nextLine();

        for(Curso cursoTemp : cursos){
            System.out.println(cursoTemp.getId() + " - " + cursoTemp.getNomeCurso());
        }
        int aux = input.nextInt();
        int idTemp = alunos.size();
        alunos.add(new Aluno(idTemp,nome, cpf, celular, matricula, data, cursos.get(aux)));          
    }
    
    public static void cadastroProfessor(){
        System.out.println("Nome : ");
        String nome = input.nextLine();
        System.out.println("CPF : ");
        String cpf = input.nextLine();
        System.out.println("Numero de Celular : ");
        String celular = input.nextLine();
        System.out.println("Cracha : ");
        String cracha = input.nextLine();
        System.out.println("Salario R$ ");
        String salario = input.nextLine();
        System.out.println("Formação : ");
        String formacao = input.nextLine();
        int idTemp = professores.size();
        professores.add(new Professor(idTemp,nome, cpf, celular, cracha, salario, formacao) );
    }

    public static void lancarNotas(){
        //instacando a class avaliacao
        Avaliacao avaliacao = new Avaliacao();

        //imprimindo alunos e selecionando
        for(Aluno alunoTemp : alunos){
            System.out.println(alunoTemp.getId() + ". "+ alunoTemp.getNome());
        }
        System.out.println("Digite o codigo do aluno ");
        int idAluno = input.nextInt();
        avaliacao.setAluno(alunos.get(idAluno));

        //imprimindo materias do aluno escolhido e adicionando no objeto avaliacao
        alunos.get(idAluno).listarDiciplinas();
        System.out.println("Digite o codigo da diciplina ");
        int idDiciplina = input.nextInt();
        avaliacao.setDiciplina(alunos.get(idAluno).getDiciplina().get(idDiciplina));
        //pegando a data
        System.out.println("data da diciplina ");
        String data = input.nextLine();
        avaliacao.setData(data);

        System.out.println("Digite a primeira nota : ");
        Double nota = input.nextDouble(); 
        avaliacao.setNotas(nota);
        System.out.println("Digite a segunda nota : ");
        nota = input.nextDouble(); 
        avaliacao.setNotas(nota);
        System.out.println("Digite a terceira nota : ");
        nota = input.nextDouble(); 
        avaliacao.setNotas(nota);

        avaliacao.setMedia((nota+nota+nota)/3);

        alunos.get(idAluno).setAvaliacaos(avaliacao);
    }

    public static void matricular(){
        
        for(Aluno alunoTemp : alunos){
            System.out.println(alunoTemp.getId() + ". " + alunoTemp.getNome());
        }
        System.out.println("Digite o id do aluno : ");
        int idAluno = input.nextInt()-1;
        
        for(Diciplina diciplinaTemp : diciplinas){
        System.out.println(diciplinaTemp.getId()+ ". " 
                            +diciplinaTemp.getNomeDiciplina() + " - " 
                            + diciplinaTemp.getCurso().getNomeCurso());
        }   
        System.out.println("Digite o id do Diciplina : ");
        int idDisciplina = input.nextInt()-1;

        alunos.get(idAluno).setDiciplina(diciplinas.get(idDisciplina));
        
    }
    
    public static void situacao(){
        for(Aluno alunoTemp : alunos){
            System.out.println(alunoTemp.getId() + ". "+ alunoTemp.getNome());
        }
        System.out.println("Digite o codigo do aluno ");
        int idAluno = input.nextInt()-1;
        
        alunos.get(idAluno).imprimirSituacao();

    }
}