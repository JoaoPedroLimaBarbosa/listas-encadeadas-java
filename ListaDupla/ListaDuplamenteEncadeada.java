package listadupla;

public class ListaDuplamenteEncadeada {
    private NoDuplo inicio, fim;

    public ListaDuplamenteEncadeada() {
        inicio = fim = null;
    }

    public void inserir(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            novo.ant = fim;
            fim = novo;
        }
    }

    public boolean buscar(int valor) {
        NoDuplo atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) return true;
            atual = atual.prox;
        }
        return false;
    }

    public boolean remover(int valor) {
        if (inicio == null) return false;

        NoDuplo atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) {
                if (atual == inicio) inicio = atual.prox;
                if (atual == fim) fim = atual.ant;
                if (atual.ant != null) atual.ant.prox = atual.prox;
                if (atual.prox != null) atual.prox.ant = atual.ant;
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public void listarFrente() {
        NoDuplo atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        }
        System.out.println();
    }

    public void listarTras() {
        NoDuplo atual = fim;
        System.out.print("Reverso: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.ant;
        }
        System.out.println();
    }
}
