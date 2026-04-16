package principal;

import Lista.Lista;
import Lista.ListaCircular;
import modelo.Produto;

public class UsaLista {

    public static void main(String[] args) {

        System.out.println("======== PARTE 2: LISTA SIMPLES ========");

        Lista listaProdutos = new Lista();
        listaProdutos.inserir(new Produto("Coca", 12.32));
        listaProdutos.inserir(new Produto("Pepsi", 11.32));
        listaProdutos.inserir(new Produto("Água", 5.45));
        listaProdutos.inserir(new Produto("Fanta", 10.00));

        System.out.println("Lista inicial:");
        listaProdutos.exibir();
        System.out.println("Quantidade total de nós: " + listaProdutos.contarNos());

        System.out.println("\n--- Inserindo 'Suco' na posição 2 (meio) ---");
        listaProdutos.inserirNoMeio(new Produto("Suco", 8.50), 2);
        listaProdutos.exibir();
        System.out.println("Nova quantidade de nós: " + listaProdutos.contarNos());


        System.out.println("\n\n======== PARTE 3: LISTA CIRCULAR ========");
        ListaCircular listaCirc = new ListaCircular();
        listaCirc.inserir(new Produto("Teclado", 150.00));
        listaCirc.inserir(new Produto("Mouse", 80.00));
        listaCirc.inserir(new Produto("Monitor", 900.00));

        System.out.println("Exibindo Lista Circular:");
        listaCirc.exibir();
    }
}
