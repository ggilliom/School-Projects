import javax.swing.JFrame;

public class Runner {
  public static void main(String[] args) {
    Model theModel = new Model();
    View theView = new View(theModel);
    theModel.addObserver(theView.getImageComponent());


    theView.setSize(600,500);
    theView.setVisible(true);
  }
}
