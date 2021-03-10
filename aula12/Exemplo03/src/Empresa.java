/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENTE
 */
public class Empresa {
    //atri
    private Trabalhador tab[];
    private Chefe diretor;

    public Empresa(Trabalhador[] tab, Chefe diretor) {
        this.tab = tab;
        this.diretor = diretor;
    }

    public Empresa(Chefe f) {
       diretor = f;
    }

    public Trabalhador[] getTab() {
        return tab;
    }

    public void setTab(Trabalhador[] tab) {
        this.tab = tab;
    }

    public Chefe getDiretor() {
        return diretor;
    }

    public void setDiretor(Chefe diretor) {
        this.diretor = diretor;
    }
    public double salarioMedia(){
        double soma=0, media;
        int i,qtde=0;
        for(i=0;i<tab.length;i++){
          if(tab[i]!=null){
            soma = soma + tab[i].getSalario();
            qtde++;
        }
        }
    media = soma / qtde;
    return media;
    }
    public void print(){
        // mostra os dados do trabalhadores 
        for(int i=0;i<tab.length;i++){
            if(tab[i]!=null){
                tab[i].print();
            }
        }
        System.out.println("Diretor");
        diretor.print();
    }
}
