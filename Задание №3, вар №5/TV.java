class TV implements DisplayDevice {
    @Override
    public void display(String video) {
        System.out.println("Playing video on TV: " + video);
    }
}
