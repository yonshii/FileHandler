package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public String writeFile(String filePath, String fileContent) {
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(fileContent);
            return "Success";
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    public String readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            StringBuilder stringBuilder = new StringBuilder();
            int sym;
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}