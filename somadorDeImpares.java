/*use um laço For para iterar de 1 a 100. Use a condição if para verificar se o número atual é ímpar e adicione-o a uma variável soma. imprima o valor final da soma. */
public class somadorDeImpares {
    public static void main(String[] args) {
        int numero=1;
        int soma=0;
        for(int i=1; i<=100;i++){
            if(i%2!=0){
                soma+=i;
            
            }

    }
    System.out.println("A soma é " +soma);
}}
