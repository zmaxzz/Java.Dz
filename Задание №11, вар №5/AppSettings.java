import java.util.HashMap;
import java.util.Map;


public class AppSettings implements Prototype {
    private Map<String, String> settings;

    public AppSettings() {
        settings = new HashMap<>();
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    @Override
    public Prototype clone() {
        AppSettings clonedSettings = new AppSettings();
        clonedSettings.settings.putAll(this.settings); // Клонируем настройки
        return clonedSettings;
    }

    @Override
    public String toString() {
        return "AppSettings{" +
                "settings=" + settings +
                '}';
    }
}