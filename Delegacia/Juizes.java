public class Juizes {
    private String nome;
    private String cargo;
    private Delegacia delegacia;

    public Juizes() {
        // Construtor Vazio
    }

    // CONSTRUTORES
    public Juizes(String nome, String cargo) {
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
    public void setDelegacia(Delegacia delegacia) {
        this.delegacia = delegacia;
    }

    public Delegacia delegacia() {
        return delegacia;
    }
}