import java.util.Observable;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class Model extends Observable {
  private BufferedImage current;
  private BufferedImage chimp;
  private BufferedImage baboon;
  private BufferedImage human;

  public Model() {
    try {
      chimp = ImageIO.read(new File("chimpanzee.jpg"));
      baboon = ImageIO.read(new File("baboon.jpg"));
      human = ImageIO.read(new File("human.jpg"));
    } catch (IOException e) {
      System.err.println("Could not read in file: " + e.getMessage());
    }
    current = human;
  }

  public void setCurrentImage(String str){
    if(str.equals("Human")) {
      current = human;
    } else if (str.equals("Chimp")) {
      current = chimp;
    } else if (str.equals("Baboon")) {
      current = baboon;
    }
    setChanged();
    notifyObservers();
  }

  public BufferedImage getCurrentImage() {
    return current;
  }
}
