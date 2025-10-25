package listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);

        lista.listar();
        System.out.println("Buscar 2: " + lista.buscar(2));
        System.out.println("Remover 1: " + lista.remover(1));

        lista.listar();
    }
}
