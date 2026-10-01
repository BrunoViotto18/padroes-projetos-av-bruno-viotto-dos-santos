package prova.contratacoes;

import prova.fretes.Frete;
import prova.fretes.FreteRodoviario;

public class ContratacaoRodoviaria extends Contratacao {

    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteRodoviario(valorCarga);
    }
}
