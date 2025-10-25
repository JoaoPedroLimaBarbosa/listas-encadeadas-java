package listacircular;

public class NoCircular {
    int dado;
    NoCircular prox;

    public NoCircular(int dado) {
        this.dado = dado;
        this.prox = null;
    }
}
