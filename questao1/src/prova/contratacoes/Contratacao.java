package prova.contratacoes;

import prova.fretes.Frete;

public abstract class Contratacao {

    public final void contratar(String cliente, double valorCarga) {
        Frete frete = this.criarFrete(valorCarga);
        double valorFrete = frete.calcular();

        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.println("Cliente: " + cliente);
        System.out.println("Frete: R$" + valorFrete);
        System.out.println("Documentos: " + String.join(", ", frete.getDocumentos()));
        System.out.println();
    }

    protected abstract Frete criarFrete(double valorCarga);
}
