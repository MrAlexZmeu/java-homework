package ru.java.homeworks.homework20;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9122)) {
            Scanner clientReader = new Scanner(System.in);
            DataInputStream serverReader = new DataInputStream(socket.getInputStream());
            DataOutputStream serverWriter = new DataOutputStream(socket.getOutputStream());


            String line = serverReader.readUTF();
            System.out.println(line);

            System.out.println("Введите первое число:");
            serverWriter.writeUTF(clientReader.nextLine());
            System.out.println("Введите второе число:");
            serverWriter.writeUTF(clientReader.nextLine());
            System.out.println("Введите операцию");
            serverWriter.writeUTF(clientReader.nextLine());
            System.out.println(serverReader.readUTF());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
