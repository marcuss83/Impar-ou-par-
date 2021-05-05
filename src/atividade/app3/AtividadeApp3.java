
package atividade.app3;


public class AtividadeApp3 {

   
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero = entrada.nextInt();
   
    if((numero % 2)== 0){
        System.out.println("Par");
    }else{
        System.out.println("Impar");
    }
    }
    
}
