import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by ainacio on Nov, 2023
 */
public class ImageLoaded implements ImageState {

    ImageProxy imageProxy;

    ImageIcon imageIcon;

    public ImageLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y, URL imageURL) {
        imageIcon.paintIcon(c, g, x, y);
    }
}
