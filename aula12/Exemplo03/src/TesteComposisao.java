/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENTE
 */
public class TesteComposisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa sistemas;
        Chefe diretor;
        
    //instancia o vetor de trabalhadores
    Trabalhador trab[]=new Trabalhador[3];
    
    trab[0]= new Trabalhador("Fulano","2312",100);
    trab[1]= new Trabalhador("Felipe","79809",31231);
    trab[2]= new Trabalhador("Soclano","67",330);
    
    //objeto tipo Chefe
    diretor = new Chefe("Silvio Santos","0",12999,299);
    
    //instanciando o objeto sistemas -composicao
    sistemas=new Empresa(trab,diretor);
    sistemas.print();
        System.out.println("Salario Mediio: "+sistemas.salarioMedia());
    }   
}