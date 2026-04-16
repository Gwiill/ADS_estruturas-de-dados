package Lista;

import modelo.Produto;

public class ListaCircular {
    private No inicio;
    private No fim;

    public void inserir(Produto produto) {
        No novoNo = new No(produto, null);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            fim.setProx(inicio);
        } else {
            fim.setProx(novoNo);
            fim = novoNo;
            fim.setProx(inicio);
        }
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista circular vazia.");
            return;
        }

        No e = inicio;
        do {
            System.out.println(e.getProduto());
            e = e.getProx();
        } while (e != inicio);

        System.out.println("(Retornou ao início)");
    }
}
