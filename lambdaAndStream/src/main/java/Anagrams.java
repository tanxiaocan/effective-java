import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: xiaocan
 * @Date: 2018/7/9 15:06
 * @Description:
 */
public class Anagrams {
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get("/Users/xiaocan/Desktop/pri-gitRepo/effective_java/alphabetize.txt");
        int minGroupSize = Integer.parseInt("1");
        try(Stream<String> words = Files.lines(dictionary)){
            words.collect(Collectors.groupingBy(word -> alphabetize(word))).values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(g -> System.out.println(g.size() + ":" + g));
        }
    }

    private static String alphabetize(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
