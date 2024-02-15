package ru.java.homeworks.homework28;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainApplication {

    public static final String DIR_PATH = "./src/main/java/ru/java/homeworks/homework28";
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File dir = new File(DIR_PATH);
        File[] listFiles = dir.listFiles(new TxtFileNameFilter(".txt"));
        if (listFiles == null || listFiles.length == 0) {
            System.out.println("В рабочем каталоге отсутствуют файлы. Хотите создать файл?");
            System.out.println("1 - да \n2 - нет");
            int answer = SCANNER.nextInt();
            if (answer == 2) {
                System.out.println("До свидания!");
                return;
            }
            createNewFile();
            listFiles = dir.listFiles(new TxtFileNameFilter(".txt"));
        }

        while (true) {
            printTxtFiles(listFiles);
            System.out.println("Введите имя нужного файла:");
            String selectFileName = SCANNER.next();

            if (Arrays.stream(listFiles).anyMatch(fileArr -> !fileArr.getName().equals(selectFileName + ".txt"))) {
                System.out.println("Указанный файл не найден. Попробуйте еще раз.");
                continue;
            }
            workWithTxtFile(new File(DIR_PATH, selectFileName + ".txt"));
            System.out.println("Хотите выбрать файл?\n1 - да\n2 - нет");
            int answer = SCANNER.nextInt();
            if (answer == 2) {
                System.out.println("До свидания!");
                return;
            }
        }


    }

    public static void createNewFile() {

        System.out.println("Введите имя:");
        String fileName = SCANNER.next();
        File newFile = new File(DIR_PATH, fileName + ".txt");
        try {
            boolean created = newFile.createNewFile();
            if (created) {
                System.out.println("Создан файл " + newFile.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printTxtFiles(File[] listFiles) {
        System.out.println("Список файлов:");
        for (File file : listFiles) {
            System.out.println(file.getName());
        }
    }


    public static void workWithTxtFile(File file) {
        System.out.println("Введите последовательность символов");
        String findLine = SCANNER.nextLine();
        int result = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file.getPath()))) {
            String line;

            while ((line = reader.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, " ,.!?");
                while (stringTokenizer.hasMoreTokens()) {
                    String word = stringTokenizer.nextToken();
                    result += (word.length() - word.replaceAll(findLine, "").length()) / findLine.length();
                }
            }
            System.out.printf("Слово '%s' встречается %d раз\n", findLine, result);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public static class TxtFileNameFilter implements FilenameFilter {
        private final String ext;

        public TxtFileNameFilter(String ext) {
            this.ext = ext;
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }
}
