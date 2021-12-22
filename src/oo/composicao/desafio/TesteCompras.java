package oo.composicao.desafio;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class TesteCompras {

    public static void main(String[] args) {

        Produto prod = Produto.builder()
                .id(1)
                .nome("Produto 1")
                .preco(100)
                .build();

        Produto prod2 = Produto.builder()
                .id(2)
                .nome("Produto 2")
                .preco(50)
                .build();

        Produto prod3 = Produto.builder()
                .id(2)
                .nome("Produto 3")
                .preco(30)
                .build();

        Compra compra = Compra.builder()
                .id(1)
                .dataCompra(LocalDateTime.now())
                .build();

        compra.adicionarItem(new Item(5, prod));
        compra.adicionarItem(new Item(3, prod2));

        List<Compra> listaCompras = new ArrayList<>();
        listaCompras.add(compra);


        Cliente cliente1 = Cliente.builder()
            .id(1)
            .nome("Everton")
            .compras(listaCompras)
            .build();

        System.out.println(cliente1.getValorTotalEmCompras());

    }
}
