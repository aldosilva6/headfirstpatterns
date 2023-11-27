import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by ainacio on Nov, 2023
 */
public interface ImageState {

    public int getIconWidth();

    public int getIconHeight();

    public void setImageIcon(ImageIcon imageIcon);

    public ImageIcon getImageIcon();

    void paintIcon(final Component c, Graphics  g, int x, int y, URL imageURL);
}
