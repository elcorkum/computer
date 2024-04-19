public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x +"," + y + " in color " + color);
    }

}
