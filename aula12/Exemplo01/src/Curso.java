
public class Curso {
    private int codigo;
    private String nome;
    
    Curso(){}
    Curso(int c, String n){
        codigo=c;
        nome=n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("Código: " + codigo + "\nNome: " + nome);
    }
     
}
