/* OKAY - 3 Simule a entrada de 5 notas em um laço for. Se a nota for maior que 10, use
continue para ignorá-la. Se a nota for negativa, use break para sair do loop. Calcule e imprima a média das
notas válidas. (Desafio: Use scanner ou/e vetor) */
import java.util.Scanner;
public class MediaDeNotas{
    
    public static void main(String[] args) {
    double nota, soma=0;
    int cont=0;
    Scanner sc= new Scanner(System.in);
    for(int i=1; i<=5;i++){
        System.out.println("Digite a "+i+"ª nota: ");
        nota = sc.nextDouble();

        if(nota >10){
            continue;
        }else if(nota <0){
            break;
        }
        soma += nota;
        cont++;
    }
        
        System.out.printf("A média das notas válidas é: %2f ", soma/cont);
}
}
