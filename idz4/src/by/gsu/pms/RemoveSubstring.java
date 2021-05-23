package by.gsu.pms;

public class RemoveSubstring {

     public static String removeSubString(Word word, char start, char end)
    {
        StringBuilder str = new StringBuilder(word.getText());
        int s = -1;
        int e = -1;
        int pointer = 0;

        while(pointer < str.length())
        {
            while(pointer < str.length() && str.charAt(pointer)!=start && str.charAt(pointer)!=' ') pointer++;

            if (pointer < str.length() && str.charAt(pointer)==start)
            {
                int s1 = pointer;
                pointer++;
                while(pointer < str.length() && str.charAt(pointer)!=end && str.charAt(pointer)!=' ') pointer++;

                if (pointer < str.length() && str.charAt(pointer) == end)
                {
                    int e1 = pointer;

                    if(s == -1 || (e-s) < (e1-s1))
                    {
                        s=s1;
                        e=e1;
                    }
                }   else pointer++;
            } else pointer++;
        }

        String result = str.toString();

        if ((e-s) < 2) return result;
        return str.substring(0, s+1) + str.substring(e, str.length()-e);
    }

}
