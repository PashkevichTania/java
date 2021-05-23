import by.gsu.pms.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        final String inputFile = "src/in.txt";
        try (Scanner scanner = new Scanner(new FileReader(inputFile))){
            Paragraph paragraph = new Paragraph(scanner);
            System.out.println(paragraph.toString());

            for (Sentence sentence: paragraph.sentences) {
                for (Word word: sentence.words) {
                    RemoveSubstring.removeSubString(word, 'I', 'i');
                }
            }

            System.out.println(paragraph.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}