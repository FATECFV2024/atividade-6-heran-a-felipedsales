public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    //Construtor
    public Empregado(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public double getSalario() {

        return salario;
    }

    public double calcularIrpf(){
        double aux = 0;
        if (salario >= 2.259 && salario <= 2.826){
            aux = 0.075 * salario;
        }else if (salario >= 2.827 && salario <= 3.751){
            aux = 0.15 * salario;
        }else if (salario >= 3.752 && salario <= 4.664){
            aux = 0.225 * salario;
        }else if (salario > 4.665) {
            aux = 0.275 * salario;
        }
        return aux;
    }

    public double calcularINSS(){
        double calcINSS = 0;
        if(salario <= 1.512){
            calcINSS =  0.075 * salario;
        }else if(salario >= 1.513 && salario <= 2.682){
            calcINSS = 0.09 * salario;
        }else if(salario >= 2.683 && salario <= 3.763){
            calcINSS =  0.12 * salario;
        }else if(salario >= 3.764 && salario <= 7.907){
            calcINSS = 0.14 * salario ;
        }
        return calcINSS;
    }
}
