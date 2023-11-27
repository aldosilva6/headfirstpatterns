import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by ainacio on Nov, 2023
 */
public class ImageNotLoaded implements ImageState {

    ImageProxy imageProxy;

    Thread retrievalThread;

    boolean retrieving = false;

    public ImageNotLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void setImageIcon(ImageIcon imageIcon) {
        imageProxy.setImageState(imageProxy.getImageLoaded());
        imageProxy.setImageIcon(imageIcon);
    }

    @Override
    public ImageIcon getImageIcon() {
        return null;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y, URL imageURL) {
        g.drawString("Loading album cover, please wait...", x+300, y+190);
        if (!retrieving) {
            retrieving = true;

            retrievalThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            retrievalThread = new Thread(() -> {
                try {
                    setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            retrievalThread.start();

        }
    }
}
