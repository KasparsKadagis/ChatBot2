package lv.rcs.Chatbot;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Čau uzdod kādu jautājumu man");

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Sasveicinies ar mani")) {
                System.out.println("Esi Sveicināts draugs");
            } else if (command.equals("Vai tev ir kāds kompliments priekš manis?")) {
                System.out.println("Tu esi ļoti zinkārīgs");
            } else if (command.equals("Kāds arā ir laiks?")) {
                System.out.println("Spriežot pēc debēsim ļoti skaidrs un silts");
            } else if (command.equals("exit")) {
                System.out.println("Beidzam darbu........");
                System.exit(0);
            }
        }

    }
}
