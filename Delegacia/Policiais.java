public class Policiais {
    private String nome;
    private String cargo;
    private Delegacia delegacia;

    public Policiais() {
        // Construtor Vazio
    }

    // CONSTRUTORES
    public Policiais(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    // -----------------

    // SETTERS E GETTERS DO NOME E DO CARGO
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
    // -----------------

    // SETTERS E GETTERS DE JUIZES ASSOCIAÇÃO
    public void setDelegacia(Delegacia delegacia) {
        this.delegacia = delegacia;
    }

    public Delegacia delegacia() {
        return delegacia;
    }
}
