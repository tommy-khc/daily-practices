package edx_java_ex_simple_data_UBCx_HtC1x._1b;

import org.junit.Test;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import java.awt.image.BufferedImage;

public class BoxifyTest {
    @Test
    public void testOne() throws IOException {
        Graphics2D graphInput = createGraph();
//        Graphics2D graphOutput = boxify(graphInput);
//        Assert.assertEquals();
    }

    public static Graphics2D createGraph() throws IOException {
        // Open a JPEG file, load into a BufferedImage.
        BufferedImage img = ImageIO.read(new File("image.jpg"));

// Obtain the Graphics2D context associated with the BufferedImage.
        Graphics2D g = img.createGraphics();

// Draw on the BufferedImage via the graphics context.
        int x = 10;
        int y = 10;
        int width = 10;
        int height = 10;
        g.drawOval(x, y, width, height);

        g.drawLine(0, 0, 50, 50);

// Clean up -- dispose the graphics context that was created.
        g.dispose();

        return g;
    }
}
