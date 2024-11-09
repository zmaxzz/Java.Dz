import java.io.*;

public class Settings {
    private static final String SETTINGS_FILE = "game_settings.ser";

    // Сохранение настроек
    public static void saveSettings(GameSettings settings) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SETTINGS_FILE))) {
            oos.writeObject(settings);
            System.out.println("Настройки успешно сохранены.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static GameSettings loadSettings() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SETTINGS_FILE))) {
            GameSettings settings = (GameSettings) ois.readObject();
            System.out.println("Настройки успешно загружены: " + settings);
            return settings;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}