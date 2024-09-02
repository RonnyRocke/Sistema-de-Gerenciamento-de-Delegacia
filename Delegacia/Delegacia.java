public class Delegacia {
    private static String nome;
    private Juizes[] juizes;
    private Ladroes[] ladroes;
    private Policiais[] policiais;

    public Delegacia() {
        // CONSTRUTOR PADRÃO
    }

    public Delegacia(String nome) {
        Delegacia.nome = nome;

    }

    public Delegacia(String nome, Juizes[] juizes, Ladroes[] ladroes, Policiais[] policiais) {
        Delegacia.nome = nome;
        this.juizes = juizes;
        this.ladroes = ladroes;
        this.policiais = policiais;
    }

    // SETTERS E GETTERS DO NOME
    public void setNome(String nome) {
        Delegacia.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // -------------------------

    // SETTERS DA ASSOCIAÇÃO

    public void setJuizes(Juizes[] juizes) {
        this.juizes = juizes;
    }

    public void setLadroes(Ladroes[] ladroes) {
        this.ladroes = ladroes;
    }

    public void setPoliciais(Policiais[] policiais) {
        this.policiais = policiais;
    }

    // GETTERS DA ASSOCIAÇÃO
    public Juizes[] getJuizes() {
        return juizes;
    }

    public Ladroes[] getLadroes() {
        return ladroes;
    }

    public Policiais[] getPoliciais() {
        return policiais;
    }

    public void infoDelegacia() {
        System.out.println("\n\t---------------------------");
        System.out.println("\n\tDELEGACIA: " + Delegacia.nome);
        System.out.println("\n\tANO FUNDADO: 1998");
        System.out.println("\t---------------------------");

    }

}