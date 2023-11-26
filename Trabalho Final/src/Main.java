import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    Scanner input = new Scanner(System.in);
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Diciplina> diciplinas = new ArrayList<>();
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        
        while (true) {
            // System.out.println("1. Cadastrar curso");
            // System.out.println("2. Cadastrar diciplina");
            // System.out.println("3. Cadastrar aluno");
            // System.out.println("4. Cadastrar professor");
            // System.out.println("5. Lançar notas");
            // System.out.println("6. Gerar relatório");
            // System.out.println("0. Sair");
            // System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt((JOptionPane.showInputDialog(null, "1. Cadastrar curso\n2. Cadastrar diciplina\n3. Cadastrar aluno\n4. Cadastrar professor\n5. Lançar notas\n6. Gerar relatório\n0. Sair\nEscolha uma opção: ")));
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
                    // Implementar lançamento de notas
                    break;
                case 6:
                    // Implementar geração de relatório
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void cadastroCurso(){
        String nome = JOptionPane.showInputDialog(null, "Nome do Curso ");
        Double duracao = Double.parseDouble(JOptionPane.showInputDialog(null, "Nome do Curso "));
        cursos.add(new Curso(nome, duracao));
    }

    public static void cadastroDiciplina(){
        if (cursos.size()>0){
            String nome = JOptionPane.showInputDialog(null, "Nome da diciplina : ");
            Double cargaHoraria = Double.parseDouble(JOptionPane.showInputDialog(null, "Carga Horaria : "));
            int opcao = Integer.parseInt((JOptionPane.showInputDialog(null, "curso :")));   
            diciplinas.add(new Diciplina(nome, cargaHoraria));
        }else{
            JOptionPane.showMessageDialog(null, "Não a nenhum curso cadastrado", null, 0);
        }        
    }

    public static void cadastroAluno(){
        String nome = JOptionPane.showInputDialog(null, "Nome do Curso ");
        String cpf = JOptionPane.showInputDialog(null, "CPF : ");
        String celular = JOptionPane.showInputDialog(null, "Numero de celular :");
        int matricula = Integer.parseInt((JOptionPane.showInputDialog(null, "Matricula :")));
        String data = JOptionPane.showInputDialog(null, "Daa de nascimento :");
        alunos.add(new Aluno(nome, cpf, celular, matricula, data));
    }
    
    public static void cadastroProfessor(){
        String nome = JOptionPane.showInputDialog(null, "Nome do Curso ");
        String cpf = JOptionPane.showInputDialog(null, "CPF : ");
        String celular = JOptionPane.showInputDialog(null, "Numero de celular :");
        int cracha = Integer.parseInt((JOptionPane.showInputDialog(null, "cracha :")));
        Double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario R$ "));
        String formacao = JOptionPane.showInputDialog(null, "Formação : ");
        professores.add(new Professor(nome, cpf, celular, cracha, salario, formacao) );
    }
    
    public static void lancaNotas(){

    }
    
}