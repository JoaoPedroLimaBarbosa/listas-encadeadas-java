package listadupla;

public class NoDuplo {
    int dado;
    NoDuplo ant, prox;

    public NoDuplo(int dado) {
        this.dado = dado;
        this.ant = null;
        this.prox = null;
    }
}
