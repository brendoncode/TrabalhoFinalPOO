import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String cracha;
    private String salario;
    private String formacao;
    private List<Diciplina> diciplinas = new ArrayList<>(); 

    //Contrutor
    public Professor(int id,String nome, String cpf, String celular, String cracha, String salario, String formacao) {
        super(id,nome, cpf,  celular);
        this.cracha = cracha;
        this.salario = salario;
        this.formacao = formacao;
    }
        
    //Metodos de Acesso

    @Override
    public void setId(int id) {
        super.setId(id);
        id +=id;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }


    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }


    public List<Diciplina> getDiciplinas() {
        return diciplinas;
    }


    public void setDiciplinas(List<Diciplina> diciplinas) {
        this.diciplinas = diciplinas;
    }

}
