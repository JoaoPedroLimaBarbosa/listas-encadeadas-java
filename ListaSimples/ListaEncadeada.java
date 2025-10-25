package listasimples;

public class ListaEncadeada {
    private No inicio;

    public ListaEncadeada() {
        inicio = null;
    }

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = novo;
        }
    }

    public boolean buscar(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public boolean remover(int valor) {
        if (inicio == null) return false;

        if (inicio.dado == valor) {
            inicio = inicio.prox;
            return true;
        }

        No anterior = inicio;
        No atual = inicio.prox;

        while (atual != null) {
            if (atual.dado == valor) {
                anterior.prox = atual.prox;
                return true;
            }
            anterior = atual;
            atual = atual.prox;
        }
        return false;
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}
