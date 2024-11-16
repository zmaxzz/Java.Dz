public class User {
    private String name;
    private AppSettings appSettings;

    public User(String name, AppSettings appSettings) {
        this.name = name;
        this.appSettings = appSettings;
    }

    public String getName() {
        return name;
    }

    public AppSettings getAppSettings() {
        return appSettings;
    }

    public void setAppSettings(AppSettings appSettings) {
        this.appSettings = appSettings;
    }
}