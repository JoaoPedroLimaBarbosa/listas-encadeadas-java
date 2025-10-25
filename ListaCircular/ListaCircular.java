package listacircular;

public class ListaCircular {
    private NoCircular ultimo;

    public ListaCircular() {
        ultimo = null;
    }

    public void inserir(int valor) {
        NoCircular novo = new NoCircular(valor);
        if (ultimo == null) {
            ultimo = novo;
            ultimo.prox = ultimo;
        } else {
            novo.prox = ultimo.prox;
            ultimo.prox = novo;
            ultimo = novo;
        }
    }

    public boolean buscar(int valor) {
        if (ultimo == null) return false;
        NoCircular atual = ultimo.prox;
        do {
            if (atual.dado == valor) return true;
            atual = atual.prox;
        } while (atual != ultimo.prox);
        return false;
    }

    public boolean remover(int valor) {
        if (ultimo == null) return false;

        NoCircular atual = ultimo.prox;
        NoCircular anterior = ultimo;

        do {
            if (atual.dado == valor) {
                if (atual == ultimo && atual == ultimo.prox) {
                    ultimo = null;
                } else {
                    anterior.prox = atual.prox;
                    if (atual == ultimo) ultimo = anterior;
                }
                return true;
            }
            anterior = atual;
            atual = atual.prox;
        } while (atual != ultimo.prox);
        return false;
    }

    public void listar() {
        if (ultimo == null) {
            System.out.println("Lista vazia.");
            return;
        }
        NoCircular atual = ultimo.prox;
        do {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        } while (atual != ultimo.prox);
        System.out.println();
    }
}
