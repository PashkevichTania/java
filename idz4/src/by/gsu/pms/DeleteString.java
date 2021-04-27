package by.gsu.pms;

public class DeleteString {
    public static Word delete(Word word){

        StringBuilder wordString = new StringBuilder(word.getText());

        char firstChar = wordString.charAt(0);

        for (int i = 0; i < wordString.length() - 1; i++) {
            if (wordString.charAt(i) == firstChar) {
                wordString.deleteCharAt(i);
            }
        }

        word.setText(wordString.toString());

        return word;
    }
}
