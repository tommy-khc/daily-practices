package practiceQuestions.question3;

public class TextProblemCanNotCallArray {

        public static String modifyString(String text){
            char empty = (char)32;
            StringBuilder newWords = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if(Character.compare(text.charAt(i), empty) != 0){
                    String newWord = String.valueOf(text.charAt(i));
                    newWords.append(newWord);
                }
            }
            return newWords.toString();
        }

}
