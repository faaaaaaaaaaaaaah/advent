import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class day1{
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("/workspaces/advent/Day 1/input.txt");
        Scanner sc = new Scanner(input);

        int dial = 50;
        String command;
        int password = 0;
        while(sc.hasNextLine()){
            command = sc.nextLine();
            if(command.charAt(0) == 'L'){
                dial -= Integer.parseInt(command.substring(1,command.length()));
            }
            else{
                dial += Integer.parseInt(command.substring(1,command.length()));
            }

            dial %= 100;

            if(dial == 0){
                password++;
            }

        }

        System.out.println(password);

        sc.close();
    }
}