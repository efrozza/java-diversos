package oo.composicao.desafio;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private int id;
    private String nome;
    private List<Compra> compras;

    public double getValorTotalEmCompras(){
        double valorTotalEmCompras = 0;

        for (Compra compra: this.compras){
            valorTotalEmCompras += compra.getValorTotalCompra();
        }

        return valorTotalEmCompras;
    }




}
