package br.com.triersistemas.patolino;

import java.util.SplittableRandom;

public abstract class Pessoa {

    private String nome;
    protected Integer documento;

    public Pessoa() {


        var rd = new SplittableRandom();
        //this.nome = nomes.get(rd.nextInt(0, nomes.size()));

    }

    public String getNome() {
        return nome;
    }

    public Integer getDocumento() {
        return documento;
    }

    //public String geraDocumento(){
    //}

}
// documento
//nome
//produtos
//oferta