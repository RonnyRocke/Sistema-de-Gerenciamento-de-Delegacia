public class Ladroes {
    private String nome;
    private String crime;
    private Delegacia delegacia;

    public Ladroes() {
        // Construtor Vazio
    }

    // CONSTRUTORES
    public Ladroes(String nome, String crime) {
        this.nome = nome;
        this.crime = crime;
    }

    // -----------------

    // SETTERS E GETTERS DO NOME E DO CRIME COMETIDO
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getNome() {
        return nome;
    }

    public String getCrime() {
        return crime;
    }

    // -----------------
    public void setDelegacia(Delegacia delegacia) {
        this.delegacia = delegacia;
    }

    public Delegacia delegacia() {
        return delegacia;
    }
}
