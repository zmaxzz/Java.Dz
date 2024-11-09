public class Main {
    public static void main(String[] args) {
        GameSettings settings = new GameSettings(30, "1920x1080", "Сложная");


        Settings.saveSettings(settings);


        GameSettings loadedSettings = Settings.loadSettings();

        if (loadedSettings != null) {
            System.out.println("Загруженные настройки: " + loadedSettings);
        }
    }
}