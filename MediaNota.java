
import java.util.Scanner;

public class MediaNota {
 
    public static void main(String[] args) {
       
       
    float n1, n2, n3, n4, n5, n6, media1, media2, mediaFinal;    
       
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a nota 1");
            n1 = entrada.nextFloat();
           
            System.out.println("Digite a nota 2");
            n2 = entrada.nextFloat();
           
            System.out.println("Digite a nota 3");
            n3 = entrada.nextFloat();
           
            System.out.println("Digite a nota 4");
            n4 = entrada.nextFloat();
           
            System.out.println("Digite a nota 5");
            n5 = entrada.nextFloat();
           
            System.out.println("Digite a nota 6");
            n6 = entrada.nextFloat();
           
            media1 = (n1 + n2 + n3) /3;
            System.out.println("O valor da média 1 é: " + media1);
           
            media2 = (n4 + n5 + n6) /3;
            System.out.println("O valor da média 2 é: " + media2);
           
            mediaFinal= (media1 + media2) /2;
            System.out.println("O valor da média final é: " + mediaFinal);
        }
     
    }
}
 