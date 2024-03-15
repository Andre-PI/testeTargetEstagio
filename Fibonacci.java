import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número para a sequencia de fibonacci");
        int num = scanner.nextInt();
        scanner.close();
        list.add(0);
        list.add(1);
        int next, previous;
        for(int i = 0;i <= num;i++){
            next = list.get(i);
            previous = list.get(i + 1);
            list.add(next + previous);

    }   
        if(list.contains(num)){
            System.out.printf("o número %d pertence a esta sequência", num);
        }else{
            System.out.printf("o número %d não pertence a esta sequência", num);
        }
}
}
