abstract class VideoPlayer {
    protected DisplayDevice displayDevice;

    protected VideoPlayer(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public abstract void playVideo(String video);
}

// Реализация видеоплеера: Стандартный видеоплеер
class StandardVideoPlayer extends VideoPlayer {
    public StandardVideoPlayer(DisplayDevice displayDevice) {
        super(displayDevice);
    }

    @Override
    public void playVideo(String video) {
        displayDevice.display(video);
    }
}