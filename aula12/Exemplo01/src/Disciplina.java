/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENTE
 */
public class Disciplina {
    private String nomeProf;
    private Curso curso;

    public Disciplina(String nomeProf, Curso curso) {
        this.nomeProf = nomeProf;
        this.curso = curso;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
   public void imprimir(){
       System.out.println("Nome do professor: "+nomeProf+""
               + "\nCódigo: "+curso.getCodigo()
                +"\nNome: "+ curso.getNome());
   }
}
