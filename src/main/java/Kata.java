import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(greet("english"));

    }

    public static String greet(String language) {

        String locales = """
                  english: "Welcome",
                  czech: "Vitejte",
                  danish: "Velkomst",
                  dutch: "Welkom",
                  estonian: "Tere tulemast",
                  finnish: "Tervetuloa",
                  flemish: "Welgekomen",
                  french: "Bienvenue",
                  german: "Willkommen",
                  irish: "Failte",
                  italian: "Benvenuto",
                  latvian: "Gaidits",
                  lithuanian: "Laukiamas",
                  polish: "Witamy",
                  spanish: "Bienvenido",
                  swedish: "Valkommen",
                  welsh: "Croeso"
                """;
        String[] keyValuePairs = locales.split(",");
        Map<String, String> localesMap = new HashMap<>();

        for (String pair : keyValuePairs) {
            String[] entry = pair.split(": ");
            localesMap.put(entry[0].trim(), entry[1].trim().replace("\"", ""));
        }
        Stream.of(localesMap).forEach(System.out::println);
        return localesMap.getOrDefault(language, localesMap.get("english"));
    }
}