public class PC {
    private Monitor monitor;
    private Motherboard motherboard;
    private Case aCase;


    public PC(Case acase, Motherboard motherboard, Monitor monitor){
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo(int x, int y, String color){
        monitor.drawPixel(x,y,color);
    }

    public void description(){
        //print description of case, monitor, motherboard  use toString()
        //Welcome to worst buy. Below is the description of the PC on sale today:
    }

//    public void powerUp(){
//        aCase.pressPowerButton();
//        drawLogo(int x, int y, String color);
//        motherboard.loadProgram();
//    }
}
