import java.util.Scanner;

public class TesteForma {
    public static void main(String[] args) {
        //declaração de variáveis
        float a , b;
        
        // declaração de objetos
        Quadrado q;
        Triangulo t;
        Forma q1;
        Forma t1;
        
        Scanner leia = new Scanner(System.in);
        // entrada de dados

        System.out.println("Digite o valo da base: ");
        b = leia.nextFloat();
        //instancia o objeto b
        q = new Quadrado(b);
        q.mostra();
        //entrada de dados para o objeto triangulo
        System.out.println("Digite a base: ");
        b = leia.nextFloat();
       
        System.out.println("Digite a altura: ");
        a= leia.nextFloat();
        
        t = new Triangulo(b, a);
        t.mostra();
       
        System.out.println("Polimorfia");
       
        q1 = new Quadrado(30);
        q1.mostra();

        t1=new Triangulo(20, 10);
        t1.mostra();
    }
}
