package br.com.triersistemas.patolino;

import java.math.BigDecimal;
import java.util.HashMap;

public class Farmaceutico extends Pessoa{

    public Farmaceutico() {

        HashMap<String, BigDecimal> produtosOferta = new HashMap<>();
        produtosOferta.add("cotonete", 4,50);
        produtosOferta.add("vitamina", 5,00);
        produtosOferta.add("shampoo", 6,50);
        produtosOferta.add("pasta de dente", 7,75);
        produtosOferta.add("escova de dente", 9,65);
        produtosOferta.add("fio dental", 6,50);
        produtosOferta.add("perfume", 4,25;
        produtosOferta.add("dipirona", 4,32);
        produtosOferta.add("paracetamol", 9,72);
        produtosOferta.add("tilex", 10,65);

    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Integer getDocumento() {
        return super.getDocumento();
    }

    // ofertadia (objeto)
}
