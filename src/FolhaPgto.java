public class FolhaPgto {
    public static void main(String[] args) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        //Empregados mensalistas
        men1 = new Mensalista("José", "Rua ABC", "Pleno");
        men1.calcularSalario();
        men1.calcularINSS();
        System.out.println("Nome: " + men1.getNome());
        System.out.println("EndereçoNome: " + men1.getEndereco());
        System.out.println("Salário: " + men1.getSalario());

        //Empregados horistas
        hora1 = new Horista("Maria", "Rua 123", 20);
        men1.calcularSalario();

        System.out.println("Nome: " + hora1.getNome());
        System.out.println("EndereçoNome: " + hora1.getEndereco());
        System.out.println("Salário: " + hora1.getSalario());
    }
}
