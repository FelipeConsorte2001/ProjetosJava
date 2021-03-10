
import javax.swing.JOptionPane;

public class Fornecedor extends Pessoa implements Seguranca{
    private float valorCompra;
    Fornecedor(){}
    Fornecedor(String n, String f, float vc){
        super(n,f);
        valorCompra=vc;
    }
    public float getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    public void print(){
        super.print();
        JOptionPane.showMessageDialog(null, "\nValor da Compra: " + valorCompra);
    }
    public void calculaImpostos(float imposto){
        valorCompra+=valorCompra*imposto/100;
    }

    @Override
    public boolean validar() {
        if(valorCompra<0){
            JOptionPane.showMessageDialog(null, "VAlor da compra invalido");
            return false;
        }else{
            if(this.getNome().equals("")|| this.getNome().length()<3){
                JOptionPane.showMessageDialog(null, "Nome invalido");
                return false;
            }
    }
    return true;}
}
