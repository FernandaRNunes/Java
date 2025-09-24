/*Criar uma nova classe com o nome IdentificadorDeSemestre. Crie uma variável numeroDoMes (ex: 8) e utilize o operador ternário para verificar se o
mês pertence ao "Primeiro Semestre" (de 1 a 6) ou "Segundo Semestre" e exibir o resultado. */
/*corrigido= OKAY */
public class IdentificadorDeSemestre {
    public static void main(String[] args) {
        int numeroDoMes = 6;
        System.out.println( numeroDoMes <7 ? "Primeiro semestre!" : "Segundo semestre!");
        
    }
}
