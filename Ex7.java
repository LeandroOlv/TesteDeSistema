public class Ex7 {

    public static int buscaBinaria(int[] lista, int buscar) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (lista[meio] == buscar) {
                return meio; // Elemento encontrado
            } else if (lista[meio] < buscar) {
                inicio = meio + 1; // Procura na metade direita
            } else {
                fim = meio - 1; // Procura na metade esquerda
            }
        }

        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        int[] lista1 = {1, 3, 5, 7, 9, 11, 13, 15};
        int buscar1 = 7;
        int resultado1 = buscaBinaria(lista1, buscar1);
        
        if (resultado1 != -1) {
            System.out.println("Resultado: O número " + buscar1 + " foi encontrado na posição " + resultado1 + ".");
        } else {
            System.out.println("Resultado: O número " + buscar1 + " não foi encontrado na lista.");
        }

        int[] lista2 = {2, 4, 6, 8, 10};
        int buscar2 = 3;
        int resultado2 = buscaBinaria(lista2, buscar2);

        if (resultado2 != -1) {
            System.out.println("Resultado: O número " + buscar2 + " foi encontrado na posição " + resultado2 + ".");
        } else {
            System.out.println("Resultado: O número " + buscar2 + " não foi encontrado na lista.");
        }
    }
}
