package imageviewer.software.ulpgc.es.swing;

import imageviewer.software.ulpgc.es.image.*;
import imageviewer.software.ulpgc.es.presenter.ImagePresenter;

import java.io.File;
import java.net.MalformedURLException;

public class Main {
    public static String root;
    public static void main(String[] args) throws MalformedURLException {
        PathFrame pathFrame = new PathFrame();
        pathFrame.setVisible(true);
        while (root == null) {
            root = pathFrame.getPath();
        }
        pathFrame.setVisible(false);
        Image image = new FileImageLoader(new File(root)).load();
        MainFrame mainFrame = new MainFrame();
        ImageDisplay imageDisplay = mainFrame.imageDisplay();
        new ImagePresenter(image, imageDisplay);
        mainFrame.setVisible(true);

    }
}
