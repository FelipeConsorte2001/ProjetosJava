/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENTE
 */
public class TesteAssociacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //instanciando o objeto disciplina,que tem associado o objet curso
        Curso ads = new Curso(01,"ADS");
        Disciplina poo =new Disciplina("Felipe",ads);
        
        poo.imprimir();
        
    }
    
}
