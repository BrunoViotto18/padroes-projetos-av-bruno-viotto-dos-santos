package prova;

import prova.artefatos.GeradorArtefato;

public class Assinatura {
    private GeradorArtefato geradorArtefato;
    private double valor;

    public Assinatura(GeradorArtefato geradorArtefato, double valor) {
        super();
        this.geradorArtefato = geradorArtefato;
        this.valor = valor;
    }

    public void imprimirRelatorio(){
        System.out.println("Comprovante Fiscal: " + this.geradorArtefato.gerarComprovanteFiscal(this.valor));
        System.out.println("Pagamento: " + this.geradorArtefato.getMetodoPagamento());
        System.out.println("Termo de Privacidade: " + this.geradorArtefato.getTermoPrivacidade());
        System.out.println();
    }
}
