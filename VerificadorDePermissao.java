/*2. Criar uma nova classe com o nome VerificadorDePermissao. Crie duas variáveis, altura (ex: 1.55) e estaAcompanhada (ex: true). Verifique e exiba
no console se a pessoa pode entrar no brinquedo, sabendo que a regra é ter altura mínima de 1.60m OU estar acompanhada. */
public class VerificadorDePermissao {
    public static void main(String[] args) {
        double altura = 1.75;
        boolean acompanhada = true;
        if((altura <1.60) && (acompanhada == true)){
            System.out.println("Altura não corresponde a altura mínima, porém por estar acomapanhada, pode entrar no brinquedo! ");
        }else if((altura <1.60) && (acompanhada== false)){
            System.out.println("Altura não corresponde a altura mínima e não há responsáveis para o acompanhamento. Entrada no brinquedo Negada!");
        }else{
            System.out.println("Acesso ao brinquedo liberado!!  ");
        }
    }
}
