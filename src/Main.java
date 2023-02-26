public class Main {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario();
        Funcionario ricardo = new Gerente();

        System.out.println(joao.obterCargo());
        System.out.println(ricardo.obterCargo());
    }
}