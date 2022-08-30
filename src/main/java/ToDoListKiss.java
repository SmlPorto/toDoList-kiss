import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListKiss {

   public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        int option, i, length;
        String item;
        
        Scanner read = new Scanner(System.in);
        
        boolean encerrar = false;
        do {
            System.out.println("\n1 | Adicionar Tarefa \n2 | Concluir Tarefa \n3 | Ver Tarefas");       
            option = read.nextInt();
            
            switch (option) {
                case 1 -> {               
                    item = read.nextLine();
                    item += read.nextLine();
                    list.add(item);
                }
                case 2 -> {
                    System.out.println("Informe o indice do item concluido: ");
                    i = read.nextInt();
                    list.remove(i);
                }
                case 3 -> {
                    length = list.size();
                    System.out.printf("\n");
                    for (i=0; i<length; i++) {
                        System.out.printf("%d - %s\n", i, list.get(i));
                    }
                }
                default -> encerrar = true;     
            }   
        }   
        while (!encerrar);
    }
}
