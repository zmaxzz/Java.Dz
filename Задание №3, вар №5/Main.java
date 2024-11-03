public class Main {

    public static void main(String[] args) {

        DisplayDevice tv = new TV();
        DisplayDevice monitor = new Monitor();
        DisplayDevice projector = new Projector();

        VideoPlayer standardPlayerOnTV = new StandardVideoPlayer(tv);
        VideoPlayer standardPlayerOnMonitor = new StandardVideoPlayer(monitor);
        VideoPlayer standardPlayerOnProjector = new StandardVideoPlayer(projector);

        standardPlayerOnTV.playVideo("Movie A");
        standardPlayerOnMonitor.playVideo("Movie B");
        standardPlayerOnProjector.playVideo("Movie C");
    }
}