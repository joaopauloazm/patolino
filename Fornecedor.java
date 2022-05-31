package br.com.triersistemas.patolino;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class Fornecedor extends Pessoa{



    public Fornecedor() {


        List<String, BigDecimal> produtosOferta = new ArrayList<>();
        produtosOferta.add("cotonete");
        produtosOferta.add("vitamina");
        produtosOferta.add("shampoo");
        produtosOferta.add("pasta de dente");
        produtosOferta.add("escova de dente");
        produtosOferta.add("fio dental");
        produtosOferta.add("perfume";
        produtosOferta.add("dipirona");
        produtosOferta.add("paracetamol");
        produtosOferta.add("tilex");

    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Integer getDocumento() {
        return super.getDocumento();
    }

    //produtos(objeto);

}
