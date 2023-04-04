public class Cliente {

    public static void main(String[] args) {
        Conta conta = new Conta();
        // System.out.println(conta.nome);
        // System.out.println(conta.salario);

        conta.setNumero(237);

        conta.setSalario(80000);

        conta.setNome("Felipe");

        System.out.println(conta.getNumero());
        System.out.println(conta.getSalario());
        System.out.println(conta.getNome());
    }

}
