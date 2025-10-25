package listasimples;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.listar();

        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Remover 10: " + lista.remover(10));

        lista.listar();
    }
}
