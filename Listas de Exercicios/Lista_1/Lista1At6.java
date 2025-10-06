import java.util.Scanner;

public class Lista1At6 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);

            // Prenchendo
            int[] vetor = new int[4]; 
            int vetorLength = vetor.length;
            for (int i = 0; i < vetorLength; i++){
                System.out.println("Insira o valor:");
                vetor[i] = scan.nextInt();
            }
            
            int[] vetorDiv3 = new int[4];
            for(int i = 0; i < vetorLength; i++){
                int resto = vetor[i];
                if(resto % 2 == 0){
                    System.out.println("Numero divisivel por 2");
                }else if(resto % 3 == 0){
                    System.out.println("Numero divisivel por 3");
                }else{
                    System.out.println("Nao divisivel por 2 ou 3");
                }
                
            }

            for(int i = 0; i < vetorLength; i++){
                String div3 = String.valueOf(vetor[i]);
                for (int j = 0; j < div3.length(); j++) {
                    char casaDec = div3.charAt(j);
                    vetorDiv3[i] += Character.getNumericValue(casaDec);
                }

            }
            for(int i = 0; i < vetorLength; i++){
                System.out.println("String: " + vetorDiv3[i]);                
            }  

        }
}