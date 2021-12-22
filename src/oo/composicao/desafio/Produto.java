package oo.composicao.desafio;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private int id;
    private String nome;
    private double preco;
}
