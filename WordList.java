import java.util.concurrent.ThreadLocalRandom;

public class WordList {

    public static final String[] wordList = new String[] {

        "string",
        "result",
        "funnny",
        "superb",
        "wowiee",
        "dragon",
        "goblin"
    };

    public static String getRandomWord() {

        int index = ThreadLocalRandom.current().nextInt(0, wordList.length);
        
        return wordList[index];
        
    }
    
}
