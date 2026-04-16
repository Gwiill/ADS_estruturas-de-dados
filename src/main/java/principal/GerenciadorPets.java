package principal;

import modelo.Pet;

public class GerenciadorPets {

    public Pet buscaBinariaRecursiva(Pet[] vetor, int procurado, int inicio, int fim) {
        if (inicio > fim) { return null; }
        int meio = (inicio + fim) / 2;
        if (vetor[meio].getId() == procurado) { return vetor[meio]; }
        else if (procurado < vetor[meio].getId()) { return buscaBinariaRecursiva(vetor, procurado, inicio, meio - 1); }
        else { return buscaBinariaRecursiva(vetor, procurado, meio + 1, fim); }
    }

    public void ordenarPorNome(Pet[] vetor, int tamanhoValido) {
        for (int i = 0; i < tamanhoValido - 1; i++) {
            for (int j = 0; j < tamanhoValido - 1 - i; j++) {
                if (vetor[j].getNome().compareToIgnoreCase(vetor[j + 1].getNome()) > 0) {
                    Pet aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorPets gp = new GerenciadorPets();
        Pet[] meusPets = new Pet[4];

        meusPets[0] = new Pet("Rex", 5, "Cachorro");
        meusPets[1] = new Pet("Bolinha", 2, "Gato");
        meusPets[2] = new Pet("Thor", 4, "Cachorro");
        meusPets[3] = new Pet("Akira", 1, "Pássaro");

        System.out.println("=== LISTA ORIGINAL (Ordenada por ID) ===");
        for (Pet p : meusPets) { System.out.println(p); }

        System.out.println("\n=== BUSCA BINÁRIA (Buscando ID 3) ===");
        Pet encontrado = gp.buscaBinariaRecursiva(meusPets, 3, 0, meusPets.length - 1);
        System.out.println(encontrado != null ? "Encontrado: " + encontrado : "Não encontrado.");

        System.out.println("\n=== ORDENAÇÃO POR NOME (Bubble Sort) ===");
        gp.ordenarPorNome(meusPets, meusPets.length);
        for (Pet p : meusPets) { System.out.println(p); }
    }
}
