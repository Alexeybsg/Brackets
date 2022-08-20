package org.example;

import java.io.*;

public class Example {

    public static void main(String[] args) throws IOException
    {
        //кладем данные в строку
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        //Оборачиваем строку в класс ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        //подменяем in
        System.setIn(is);

        //вызываем обычный метод, который не подозревает о наших манипуляциях
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException
    {
        //InputStreamReader isr = new InputStreamReader(System.in);
       // BufferedReader reader = new BufferedReader(isr);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String line = bufferedReader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        bufferedReader.close();
        //isr.close();
    }

}
