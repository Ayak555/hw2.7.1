import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> dictionary = new HashMap<>();

        dictionary.put("синий", new String[]{"холодный", "бирюзовый", "лазурный", "васильковый", "лазоревый"});
        dictionary.put("машина", new String[]{"авто", "тачка", "атомашина", "транспортное средство", "средство передвижения"});
        dictionary.put("женщина", new String[]{"человек", "девочка", "девушка", "дама", "барышня", "баба", "девица", "старуха"});
        dictionary.put("мужчина", new String[]{"человек", "парень", "мужик", "дядя", "мужчинка", "старик"});
        dictionary.put("друг", new String[]{"приятель", "побратим", "брат", "товарищ", "близкий", "доброжелатель"});
        dictionary.put("доброта", new String[]{"благородство", "сострадание", "милосердие", "человечность", "отзывчивость", "сердечность", "человеколюбие"});


        Map<String, String[]> dictionaries = new HashMap<>();
        Set<String> keys = dictionary.keySet();
        Iterator iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next().toString();
            String[] value = dictionary.get(key);
            dictionaries.put(key, value);
            for (int i = 0; i < value.length; i++) {
                String futureKey = value[i];
                ArrayList<String> newSynonyms = new ArrayList<>(value.length);
                newSynonyms.addAll(Arrays.asList(value));
                newSynonyms.remove(futureKey);
                newSynonyms.add(key);
                String[] newValues = new String[newSynonyms.size()];
                newValues = newSynonyms.toArray(newValues);
                System.out.println(futureKey + " - " + Arrays.toString(newValues));
                dictionaries.put(futureKey, newValues);
            }
        }
    }
}
