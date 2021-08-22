import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        //List<Integer> result = new ArrayList<>();
        Predicate<Integer> lambda = (i) -> {boolean isPositive = i > this.threshold;
            logger.log("Элемент " + i + (isPositive ? "": " не") + " подходит");
            return i > this.threshold;};
        List<Integer> result = source.stream()
                .filter(lambda)
                .collect(Collectors.toList());

        return result;
    }
}
