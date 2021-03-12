public class App {
    public static void main(String[] args) {
        Pessoa Humberto = new Pessoa();
        Humberto.setNome("Humberto Silveira");
        Humberto.setIdade(20);

        Pessoa heitor = new Pessoa();
        heitor.setNome("Heitor Gonzaga");
        heitor.setIdade(23);

        saopaulino gustavo = new saopaulino();
        gustavo.setNome("Gustavo Henrique");
        gustavo.setIdade(26);

        heitor.dizerOlaParaPessoa(Humberto);
        heitor.dizerOlaParaPessoa(Humberto);
    }
}