import java.net.*;
import java.awt.*;
import javax.swing.*;

class ImageProxy implements Icon {
	final URL imageURL;

	ImageState imageLoaded;

	ImageState imageNotLoaded;

	volatile ImageState imageState;

	public ImageProxy(URL url) {
		imageURL = url;
		imageLoaded = new ImageLoaded(this);
		imageNotLoaded = new ImageNotLoaded(this);
		imageState = imageNotLoaded;
	}
     
	public int getIconWidth() {
		return imageState.getIconWidth();
	}
 
	public int getIconHeight() {
		return imageState.getIconHeight();
	}
	
	synchronized void setImageIcon(ImageIcon imageIcon) {
		imageState.setImageIcon(imageIcon);
	}
     
	public void paintIcon(final Component c, Graphics  g, int x,  int y) {
		imageState.paintIcon(c, g, x, y, imageURL);
	}

	public void setImageState(ImageState imageState) {
		this.imageState = imageState;
	}

	public ImageState getImageLoaded() {
		return imageLoaded;
	}

	public ImageState getImageNotLoaded() {
		return imageNotLoaded;
	}
}
