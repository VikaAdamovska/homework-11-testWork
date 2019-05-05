import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {
    public static void main(String[] args) {
           /*1) Создать класс код которого указан выше:
      2) в классе ListOfNumbers создать метод writeContentToFile(String fileLocation) - который должен записать
      в файл содержимое списка (каждое значение на новой строке) в файл fileLocation
      если файла fileLocation не существует - создать его
      3) в классе ListOfNumbers создать метод readContentFromFile(String fileLocation)
      в котором считать из файла данные в список list из файла fileLocation (считать что в файле fileLocation каждое значение расположено на новой строке).
      - если файла fileLocation не существует - реализовать собственное исключение и бросить его
      - если файл пустой - реализовать собственное исключение и бросить его

      Создать класс ListOfNubersDemo - где показать пример использования методов ListOfNumbers с обработкой всех возможных исключений.*/

       /* ListOfNumbers listOfNumbers = new ListOfNumbers("C:\\Users\\Public\\Documents\\Test_for_Java\\test.txt");

        try {
            listOfNumbers.writeContentToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            listOfNumbers.readContentFromFile("C:\\Users\\Public\\Documents\\Test_for_Java\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private List<Integer> list;
    private static final int SIZE = 10;
    private String fileLocation;

    public ListOfNumbers(String fileLocation) {
        setFileLocation(fileLocation);
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void writeContentToFile() throws Exception {
        File file = new File(fileLocation);
        if (file.isDirectory()) {
            throw new Exception("File can't be directory");
        }

        if (!file.exists()) {
            if (!file.createNewFile()) {
                throw new IOException("Can't create a file");
            }
        } else if (!file.canWrite()) {
            throw new IOException("Can't write a file");
        }
        Writer writer = new FileWriter(fileLocation, false);

        try {
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i).toString() + System.lineSeparator());
            }
        } finally {
            writer.close();
        }*/
        File file = new File("C:\\Users\\Public\\Documents\\Test_for_Java\\test.txt");
        File file1 = new File("C:\\Users\\Public\\Documents\\Test_for_Java\\test1.txt");
        readContentFromFile("C:\\Users\\Public\\Documents\\Test_for_Java\\test1.txt");


    }


    public static void readContentFromFile(String fileLocation) {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        String line;
        try {
            reader = new FileReader(fileLocation);
            bufferedReader = new BufferedReader(reader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

