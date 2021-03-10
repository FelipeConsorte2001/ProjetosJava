/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENTE
 */
public class Venda {
    //atributos
    private Produto produto;
    private Vendedor vendedor;
    private float vfinal;
    
    public Venda(){}
    public Venda(Produto produto, Vendedor vendedor) {
        this.produto = produto;
        this.vendedor = vendedor;
   
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }


    public void setVfinal(float vfinal) {
        this.vfinal = vfinal;
    }
    public void concratisaVenda(){
        float aux = produto.getPreco()*vendedor.getComissao();//valor da comisão sera 10% do valor do produto
      
        vfinal =  aux+ produto.getPreco();
        
    }
    public void imprimir(){
        System.out.print("Valor: "+produto.getPreco()+""
                + "\nComissão: "+ vendedor.getComissao()+
                "\nValor Final: "+ getVfinal());
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public float getVfinal() {
        return vfinal;
    }
}
