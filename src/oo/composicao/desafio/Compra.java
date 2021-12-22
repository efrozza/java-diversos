package oo.composicao.desafio;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Compra {

    private int id;
    private LocalDateTime dataCompra;
    private List<Item> itens;

    public void adicionarItem (Item item){
        this.itens.add(item);
    }
    public double getValorTotalCompra (){
        double valorTotalCompra = 0;
        for (Item item: itens){
            valorTotalCompra += item.getQuantidade() * item.getProduto().getPreco();
        }
        return valorTotalCompra;
    }



}
