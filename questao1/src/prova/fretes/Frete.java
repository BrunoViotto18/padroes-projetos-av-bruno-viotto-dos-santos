package prova.fretes;

import java.util.List;

public abstract class Frete {
    protected final double valorCarga;

    protected Frete(double valorCarga) {
        this.valorCarga = valorCarga;
    }

    public abstract String getModalidade();

    public abstract double calcular();

    public abstract List<String> getDocumentos();
}
