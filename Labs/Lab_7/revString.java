import java.util.*;


public class revString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("Enter the String to reverse: ");
        str = scan.nextLine();
        String[] line;
        line = str.split("\\.");
        System.out.println("The reversed String is: ");

        for (int i = 0; i < line.length; i++) {
            Stack<String> Stack1 = new Stack<String>();
            String[] temp1;
            String delimit1 = " ";
            temp1 = line[i].split(delimit1);

            for (int j = 0; j < temp1.length; j++) {
                if(temp1[j].length() > 0) {
                    Stack1.push(temp1[j]);
                }
            }
            int size = Stack1.size();

            if(!Stack1.empty()) {
                String firstWord = Stack1.pop();
                firstWord = Character.toUpperCase(firstWord.charAt(0))+ firstWord.substring(1, firstWord.length());
                System.out.print(firstWord);
                System.out.print(" ");
            }
            for (int j = 1; j < size - 1; j++) {
                System.out.print(Stack1.pop());
                System.out.print(" ");
            }

            if(!Stack1.empty()) {
                String lastWord = Stack1.pop();
                lastWord = Character.toLowerCase(lastWord.charAt(0))+ lastWord.substring(1, lastWord.length());
                System.out.print(lastWord);
            }

            System.out.print(".");
            System.out.print(" ");
        }
    }
}

