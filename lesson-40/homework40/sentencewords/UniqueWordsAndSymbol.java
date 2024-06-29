package homework40.sentencewords;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsAndSymbol {
    public static void main(String[] args) {
        String sentence = "Он был человек, безусловно, больной, потому что в мире, видимо, есть две категории людей, - одни, способные видеть божество, и другие, не способные видеть божество, - и первая категория, хотя и содержит в себе много людей с мятежным духом, всё-таки живёт в богословском веке, тогда как вторая категория, к которой принадлежал Иван Фёдорович, неизбежно и вполне сознательно вступает в тьму, ибо человек, который хотя бы только один раз, даже всего на одну минуту, видит Бога, уже не может отказаться от этого видения и опять стать обыкновенным человеком.";
        Set<String> wordsSet = new HashSet<>();
        String[] words = sentence.split("\\P{L}+");
        for (String word : words) {
            wordsSet.add(word.toLowerCase());
        }
        int uniqueWordCount = wordsSet.size();
        System.out.println("Количество уникальных слов: " + uniqueWordCount);
        // Подсчет количества уникальных слов
        wordsSet = new HashSet<>();
        words = sentence.split("\\P{L}+");
        for (String word : words) {
            wordsSet.add(word.toLowerCase()); // Сохраняем слова в нижнем регистре для уникальности
        }
        uniqueWordCount = wordsSet.size();
        System.out.println("Количество уникальных слов: " + uniqueWordCount);

        // Подсчет количества уникальных символов
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : sentence.replaceAll("\\P{L}", "").toCharArray()) {
            uniqueChars.add(c);
        }
        int uniqueCharCount = uniqueChars.size();
        System.out.println("Количество уникальных символов: " + uniqueCharCount);
    }
}


