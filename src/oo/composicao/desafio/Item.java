package oo.composicao.desafio;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private int quantidade;
    private Produto produto;

}
