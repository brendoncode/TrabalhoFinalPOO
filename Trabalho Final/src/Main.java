/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */
/*POLIMORFISMO OLHAR SE PRECISA */

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
    cursos.add(new Curso("Ciencia da Computação", "4"));
    cursos.add(new Curso("Matematica", "4"));
    cursos.add(new Curso("Direito", "5"));

    diciplinas.add(new Diciplina("alg 1", "60", cursos.get(0)));
    diciplinas.add(new Diciplina("alg 2", "60", cursos.get(0)));
    diciplinas.add(new Diciplina("estrutura de dados 1", "60", cursos.get(0)));
    diciplinas.add(new Diciplina("estrutura de dados 2", "60", cursos.get(0)));
    diciplinas.add(new Diciplina("Lab Rede", "60", cursos.get(0)));

    diciplinas.add(new Diciplina("calculo 1", "60", cursos.get(1)));
    diciplinas.add(new Diciplina("calculo 2", "60", cursos.get(1)));
    diciplinas.add(new Diciplina("calculo 3", "60", cursos.get(1)));
    diciplinas.add(new Diciplina("geometria", "60", cursos.get(1)));
    diciplinas.add(new Diciplina("Algebra", "60", cursos.get(1)));

    diciplinas.add(new Diciplina("Direito Penal", "60", cursos.get(2)));
    diciplinas.add(new Diciplina("Direito Civil", "60", cursos.get(1)));
    diciplinas.add(new Diciplina("Filosofia do Direito", "60", cursos.get(1)));
    diciplinas.add(new Diciplina("Historia do direiro", "60", cursos.get(1)));
    diciplinas.add(new Diciplina("LGPD", "60", cursos.get(1)));

        while (true) {
            System.out.println("1. Cadastrar curso");
            System.out.println("2. Cadastrar diciplina");
            System.out.println("3. Cadastrar aluno");
            System.out.println("4. Cadastrar professor");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Cursos");
            System.out.println("7. Listar Diciplinas");
            System.out.println("8. Listar Professores");
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
                        System.out.println(alunoTemp.getNome());
                    }
                    break;
                case 6:
                    for(Curso cursoTemp : cursos){
                    System.out.println(cursoTemp.getNomeCurso());
                    }                    
                    break;

                case 7:
                    for(Diciplina diciplinaTemp : diciplinas){
                    System.out.println(diciplinaTemp.getNomeDiciplina() + " - " + diciplinaTemp.getCurso().getNomeCurso());
                    }                    
                    break;

                case 8:
                    for(Professor professorTemp : professores){
                    System.out.println(professorTemp.getNome());
                    }                    
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
        cursos.add(new Curso(nome, duracao));
    }

    public static void cadastroDiciplina(){       
        System.out.println("Nome : ");
        String nome = input.nextLine();
        System.out.println("Carga Horaria : ");
        String cargaHoraria = input.nextLine();
        for(Curso cursoTemp : cursos){
            System.out.println(cursoTemp.getNomeCurso());
        }
        int aux = (input.nextInt())-1;
        diciplinas.add(new Diciplina(nome, cargaHoraria,cursos.get(aux)));          
    }

    public static void cadastroAluno(){
        int contador = 1;
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
            System.out.println(contador + " - " + cursoTemp.getNomeCurso());
            contador++;
        }
        contador = (input.nextInt())-1;            
        alunos.add(new Aluno(nome, cpf, celular, matricula, data, cursos.get(contador)));           
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
        professores.add(new Professor(nome, cpf, celular, cracha, salario, formacao) );
    }

    public static void lancarNotas(){
        //validação
        
        for(Aluno alunoTemp : alunos){
            System.out.println(alunoTemp.listAlunos());
        }
        System.out.println("Digite o codigo do aluno ");
        int opcao = input.nextInt();
        System.out.println("Digite a primeira nota : ");
        Double nota = input.nextDouble(); 
        alunos.get(opcao).setNotas(nota);
        System.out.println("Digite a segunda nota : ");
        nota = input.nextDouble(); 
        alunos.get(opcao).setNotas(nota);
        System.out.println("Digite a terceira nota : ");
        nota = input.nextDouble(); 
        alunos.get(opcao).setNotas(nota);
    }
    
    
}