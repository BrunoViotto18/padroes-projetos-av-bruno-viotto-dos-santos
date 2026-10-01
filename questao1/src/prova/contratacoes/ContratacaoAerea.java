package prova.contratacoes;

import prova.fretes.Frete;
import prova.fretes.FreteAereo;

public class ContratacaoAerea extends Contratacao {

    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteAereo(valorCarga);
    }
}
