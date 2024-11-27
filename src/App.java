public class App {
    public static void main(String[] args) throws Exception {
        
        Mensalista m1 = new Mensalista("José","Rua A", "Junior");
        Horista h1 = new Horista("Maria", "Rua B", 10);

        m1.calcularSalario();
        System.out.println("Mensalista: " + m1.getNome());
        System.out.println("INSS: "+ m1.calcularINSS());
        System.out.println("IR: "+ m1.calcularIrpf());

        h1.calcularSalario();
        System.out.println("Horista: "+ h1.getNome());
        System.out.println("INSS: "+ h1.calcularINSS());
        System.out.println("IR: "+ h1.calcularIrpf());
        System.out.println("Salario: " + h1.getSalario());
    }
}
