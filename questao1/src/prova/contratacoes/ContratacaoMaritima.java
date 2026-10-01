package prova.contratacoes;

import prova.fretes.Frete;
import prova.fretes.FreteMaritimo;

public class ContratacaoMaritima extends Contratacao {

    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteMaritimo(valorCarga);
    }
}
