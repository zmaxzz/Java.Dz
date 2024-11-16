public class Main {
    public static void main(String[] args) {
        // Создадим общие настройки приложения
        AppSettings defaultSettings = new AppSettings();
        defaultSettings.setSetting("тема", "светлая");
        defaultSettings.setSetting("уведомления", "включены");

        User user1 = new User("maxon", (AppSettings) defaultSettings.clone());
        user1.getAppSettings().setSetting("тема", "темная");


        User user2 = new User("max", (AppSettings) defaultSettings.clone());


        System.out.println(user1.getName() + " настройки: " + user1.getAppSettings());
        System.out.println(user2.getName() + " настройки: " + user2.getAppSettings());
    }
}