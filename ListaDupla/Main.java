package listadupla;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir(5);
        lista.inserir(15);
        lista.inserir(25);

        lista.listarFrente();
        lista.listarTras();

        System.out.println("Remover 15: " + lista.remover(15));
        lista.listarFrente();
    }
}
