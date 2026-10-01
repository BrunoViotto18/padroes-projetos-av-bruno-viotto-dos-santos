package prova;

import prova.contratacoes.*;

public class Program {
    public static void main(String[] args) {
        Contratacao[] contratacoes = {
            new ContratacaoRodoviaria(),
            new ContratacaoAerea(),
            new ContratacaoMaritima()
        };

        for (Contratacao contratacao : contratacoes) {
            contratacao.contratar("Maria Silva", 10000.0);
        }
    }
}
