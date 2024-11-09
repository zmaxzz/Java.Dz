import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Cache<String, String> dataCache = new Cache<>(10, TimeUnit.SECONDS);

        String key = "user";
        String cachedData = dataCache.get(key);

        if (cachedData == null) {

            String dataFromDb = fetchFromDatabase(key);
            dataCache.put(key, dataFromDb);
            System.out.println("Получено из БД: " + dataFromDb);
        } else {
            System.out.println("Получено из кэша: " + cachedData);
        }

        String cachedDataAgain = dataCache.get(key);
        if (cachedDataAgain != null) {
            System.out.println("Получено снова из кэша: " + cachedDataAgain);
        }
    }

    private static String fetchFromDatabase(String key) {

        return "Данные для " + key;
    }
}