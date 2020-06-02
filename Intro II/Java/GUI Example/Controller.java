import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener{
  Model theModel;

  public Controller(Model theModel) {
    this.theModel = theModel;
  }

  public void actionPerformed(ActionEvent e) {
    String buttonLabel = e.getActionCommand();
    System.out.printf("%s button pressed\n", buttonLabel);
    theModel.setCurrentImage(buttonLabel);
  }
}
