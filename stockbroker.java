import javax.swing.ImageIcon;

public class stockbroker extends enemy {
    
    public stockbroker(){
        super();
    }
    public String tostring(){
        return "stockbroker";
    }
    public stockbroker(int x, int y){
        super(x,y,500,500,2,172,2000,5, new ImageIcon("assets/stockbroker.png"),new gold());
    }

}
