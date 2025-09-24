/* Corrigido, OKAY */
public class classificacaoDeIdade {
    public static void main(String[] args) {
        int idade = 12;
        if(idade <12){
            System.out.println(idade + " anos é classificado como: criança");
        }else if (idade<18){
            System.out.println(idade + " anos é classificado como: adolescente");
        }else if (idade<65){
            System.out.println(idade + " anos é classificado como: adulto");
        }else{
            System.out.println(idade + " anos é classificado como: idoso");
        }
    }
}
