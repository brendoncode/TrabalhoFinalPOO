public abstract class Pessoa {
    private String nome ;
    private String cpf;
    private String rg;
    private String celular;

    public Pessoa(String nome, String cpf, String rg, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.celular = celular;
    }
}
