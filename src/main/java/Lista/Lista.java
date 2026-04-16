package Lista;

import modelo.Produto;

public class Lista {
    private No inicio, atual, aux;

    public void inserir(Produto produto) {
        if (inicio == null) {
            inicio = new No(produto, null);
            aux = inicio;
        } else {
            atual = new No(produto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        No e = inicio;
        while (e != null) {
            System.out.println(e.getProduto());
            e = e.getProx();
        }
    }

    public boolean remover(int id) {
        No remov = inicio, anterior = inicio;
        while (remov != null) {
            if (id == remov.getProduto().getId()) {
                break;
            }
            anterior = remov;
            remov = remov.getProx();
        }

        if (remov != null) {
            if (remov == inicio) {
                inicio = remov.getProx();
                remov.setProx(null);
            } else if (remov == atual) {
                atual = anterior;
                aux = anterior;
                anterior.setProx(null);
            } else {
                anterior.setProx(remov.getProx());
                remov.setProx(null);
            }
            return true;
        }
        return false;
    }

    // --- NOVOS MÉTODOS ---

    public int contarNos() {
        int contador = 0;
        No e = inicio;
        while (e != null) {
            contador++;
            e = e.getProx();
        }
        return contador;
    }

    public void inserirNoMeio(Produto produto, int posicaoInsercao) {
        int total = contarNos();

        if (posicaoInsercao <= 0 || posicaoInsercao >= total) {
            System.out.println("Erro: Escolha uma posição entre 1 e " + (total - 1));
            return;
        }

        No novoNo = new No(produto, null);
        No e = inicio;

        for (int i = 0; i < posicaoInsercao - 1; i++) {
            e = e.getProx();
        }

        novoNo.setProx(e.getProx());
        e.setProx(novoNo);
    }
}