package ru.java.homeworks.homework20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket socket = new ServerSocket(9122)) {
            System.out.println("Запуск сервера!");
            while (true) {
                Socket clientSocket = socket.accept();
                System.out.println("Подключился клиент");
                DataInputStream reader = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream writer = new DataOutputStream(clientSocket.getOutputStream());

                try {

                    writer.writeUTF("Список доступных операций: +,-,*,/");
                    writer.flush();
                    System.out.println("1");
                    String operandA = reader.readUTF();
                    System.out.println("2");
                    String operandB = reader.readUTF();
                    String operation = reader.readUTF();
                    writer.writeUTF(getResult(operandA, operandB, operation));
                    writer.flush();
                } finally {
                    System.out.println("Отключился клиент");
                    clientSocket.close();
                    reader.close();
                    writer.close();
                }

            }
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String getResult(String a, String b, String operation) {
        int operandA = Integer.parseInt(a);
        int operandB = Integer.parseInt(b);
        if (operation.equals("+")) {
            return "Результат сложения " + (operandA + operandB);
        }
        if (operation.equals("-")) {
            return "Результат вычитания " + (operandA - operandB);
        }
        if (operation.equals("*")) {
            return "Результат умножения " + (operandA * operandB);
        }
        if (operation.equals("/")) {
            if (operandB == 0) {
                return "Делить на ноль нельзя";
            }
            return "Результат деления " + (operandA / operandB);
        }

        return "Введен неизвестный оператор";

    }

}
