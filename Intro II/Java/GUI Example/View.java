
import java.util.Observer;
import java.util.Observable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class View extends JFrame {
  private JPanel buttonPanel;
  private JButton humanButton;
  private JButton chimpButton;
  private JButton baboonButton;
  private ImageComponent imageComponent;
  private Model theModel;

  public View(Model theModel) {
    super();
    this.theModel = theModel;

    setLayout(new BorderLayout());
    buttonPanel = new JPanel();

    buttonPanel.setLayout(new FlowLayout());

    Controller buttonController = new Controller(this.theModel);
    humanButton = new JButton("Human");
    humanButton.addActionListener(buttonController);
    chimpButton = new JButton("Chimp");
    chimpButton.addActionListener(buttonController);
    baboonButton = new JButton("Baboon");
    baboonButton.addActionListener(buttonController);

    buttonPanel.add(humanButton);
    buttonPanel.add(chimpButton);
    buttonPanel.add(baboonButton);

    this.imageComponent = new ImageComponent();
    add(imageComponent, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }


  public ImageComponent getImageComponent() {
    return this.imageComponent;
  }

  private class ImageComponent extends JComponent implements Observer{
    BufferedImage image;

    public ImageComponent() {
      this.image = theModel.getCurrentImage();
      repaint();
    }

    public void paintComponent(Graphics g) {
      g.drawImage(image, 1, 1, this);
    }

    @Override
    public void update(Observable obs, Object obj) {
      this.image = theModel.getCurrentImage();
      repaint();
    }

  }
}
