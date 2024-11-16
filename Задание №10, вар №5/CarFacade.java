class CarFacade {
    private Engine engine;
    private ClimateControl climateControl;
    private MusicSystem musicSystem;

    public CarFacade() {
        engine = new Engine();
        climateControl = new ClimateControl();
        musicSystem = new MusicSystem();
    }

    public void startCar(int temperature, String song) {
        engine.start();
        climateControl.setTemperature(temperature);
        musicSystem.playMusic(song);
    }

    public void stopCar() {
        musicSystem.stopMusic();
        engine.stop();
    }
}