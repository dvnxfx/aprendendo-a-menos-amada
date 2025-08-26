
import java.util.Scanner;

public class MediaNota {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
       
       
        try (Scanner entrada = new Scanner(System.in)) {

            //array que armazena nota  -> array no lugar de repetir a nota 6 vezes  
            float[] notas = new float[6]; 

            //loop pra ler nota
            for (int i = 0; i < 6; i++) {
                System.out.println("Digite a nota: " + (i + 1));
                notas[i] = entrada.nextFloat();
            }

            // calcula média1
            float soma1 = 0;
            for (int i = 0; i < 3; i++) {
                soma1 += notas[i];
            }

            float media1 = soma1 / 3;

            // calcula média2
            float soma2 = 0;
            for (int i = 3; i < 6; i++) {
                soma2 += notas[i];
            }

            float media2 = soma2/ 3;

            //calcula media final 
            
            float mediaFinal = (media1 + media2) / 2;


            // mostra resultados 
            System.out.println("Média 1 é: " + media1);
            System.out.println("Média 2 é: " + media2);
            System.out.println("Média final é: " + mediaFinal);

    
    }
  }  
}