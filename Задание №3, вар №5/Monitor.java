class Monitor implements DisplayDevice {
    @Override
    public void display(String video) {
        System.out.println("Playing video on Monitor: " + video);
    }
}