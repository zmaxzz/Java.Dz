import java.io.Serializable;

public class GameSettings implements Serializable {
    private static final long serialVersionUID = 1L;

    private int volume;
    private String resolution;
    private String difficulty;

    public GameSettings(int volume, String resolution, String difficulty) {
        this.volume = volume;
        this.resolution = resolution;
        this.difficulty = difficulty;
    }

    // Геттеры и сеттеры
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "GameSettings{" +
                "громкость = " + volume +
                ", разрешение = '" + resolution + " " +
        ", сложность = " + difficulty + " " +
        '}';
    }
}