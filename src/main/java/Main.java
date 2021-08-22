import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int size;
    static int max;
    static int threshold;
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввестивходные данные для списка");
        insertParams();
        logger.log("Введены параметры:\n размер = " + size + "\n граница = " + max + "\n порог = " + threshold);
        logger.log("Генерируем список");
        List list = new ArrayList<Integer>();
        generateList(list);
        logger.log("Список: " + list);
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        List resultList = filter.filterOut(list);
        logger.log("Итоговый список: " + resultList);
    }

    private static void generateList(List list) {
        Random random = new Random();
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(max));
        }
    }

    private static void insertParams() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        size = scanner.nextInt();
        System.out.print("Введите верхнюю границу значений: ");
        max = scanner.nextInt();
        System.out.print("Введите порог для фильтрации: ");
        threshold = scanner.nextInt();
    }
}
