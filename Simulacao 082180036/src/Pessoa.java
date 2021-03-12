public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dizerOla() {
        System.out.println(this.nome + ": Olá!");
    }

    public void dizerOlaParaPessoa(Pessoa pessoa) {
        System.out.println(this.nome + ": Olá " + pessoa.getNome());
        pessoa.dizerOla();
    }
}
