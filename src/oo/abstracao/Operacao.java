package oo.abstracao;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Operacao {
    private String nome;
    private boolean permite;
}
