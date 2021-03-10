/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENTE
 */
public class TesteAgrefacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instancia objetos que irão agregar o objeto venda 
        Produto p = new Produto(120.50f);
        Vendedor v = new Vendedor(0.20f);
      
        Venda hoje = new Venda(p,v);
        // concretisa venda
        hoje.concratisaVenda();
    
        hoje.imprimir();
    
    }
    
}
