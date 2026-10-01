package prova;

import prova.artefatos.GeradorArtefato;
import prova.artefatos.GeradorArtefatoBrasil;
import prova.artefatos.GeradorArtefatoMexico;

public class Program {
    public static void main(String[] args) {
        GeradorArtefato[] geradoresArtefato = {
            new GeradorArtefatoBrasil(),
            new GeradorArtefatoMexico()
        };

        for (var geradorArtefato : geradoresArtefato){
            var assinatura = new Assinatura(geradorArtefato, 10000);

            assinatura.imprimirRelatorio();
        }
    }
}
