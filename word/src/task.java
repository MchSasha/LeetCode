import java.util.HashMap;
import java.util.Map;

public class task {
        public static boolean equalFrequency(String word) {
            Map<Character, Integer> CHAR_freq = new HashMap<>();  // to store chars and their frequencies
            for (char i : word.toCharArray()) {
                if(CHAR_freq.containsKey(i))  //if char has already added, frequency++
                    CHAR_freq.replace(i, CHAR_freq.get(i), CHAR_freq.get(i)+1);
                else CHAR_freq.put(i, 1); //else add it
            } printMap(CHAR_freq);

            boolean has_one = false; Integer prev;  //case when it's just one char to remove
            if (CHAR_freq.get(word.toCharArray()[0]) != 1)
                prev = CHAR_freq.get(word.toCharArray()[0]);
            else prev = CHAR_freq.get(word.toCharArray()[1]);

            int rep = 0; boolean time = false;
            for (int j = 0; j < word.length(); j++)
            {
                if (CHAR_freq.get(word.toCharArray()[j]) == 1) {
                    has_one = true;
                }

                if (CHAR_freq.get(word.toCharArray()[j]) == prev) //count the same freqs except for "1"
                    rep++;
                if (CHAR_freq.get(word.toCharArray()[j]) != 1 )
                    prev = CHAR_freq.get(word.toCharArray()[j]);
            }
            if (has_one && rep == (word.length()-1)) //if odd character is the only one and the others have the same frequency
                return true;

            int need_to_change = 0;

            Character[] key = CHAR_freq.keySet().toArray(new Character[0]);

            for (int i = 1; i < word.length(); i++)
            {
                if (CHAR_freq.get(word.toCharArray()[i]) != CHAR_freq.get(word.toCharArray()[i - 1])) //look through freqs of all cars in the word, if find any mismatch -> we have already find the char to remove
                {
                    need_to_change++;
                    if (CHAR_freq.get(word.toCharArray()[i]) > CHAR_freq.get(word.toCharArray()[i - 1]))
                        CHAR_freq.replace(word.toCharArray()[i], CHAR_freq.get(word.toCharArray()[i]), CHAR_freq.get(word.toCharArray()[i]) - 1 );
                    else CHAR_freq.replace(word.toCharArray()[i - 1], CHAR_freq.get(word.toCharArray()[i - 1]), CHAR_freq.get(word.toCharArray()[i - 1]) - 1 );
                }
            }
            if (need_to_change == 0 && CHAR_freq.size() == 1) // the whole word is from 1 char
                return true;
            if (need_to_change == 1 && CHAR_freq.values().toArray()[0] != CHAR_freq.values().toArray()[CHAR_freq.size() - 1]) // for example, "wwwwweeeee"
                return false;
            if (need_to_change > 1|| (need_to_change == 0 && CHAR_freq.get(key[0]) != 1))  // more than 1 mismetch, or the same freq for all chars
                return false;

            else return true;
        }

    private static void printMap(Map<Character, Integer> ind) {
        for (Object i : ind.keySet())
        {
            System.out.println(i + " " + ind.get(i));
        }
    }
}
