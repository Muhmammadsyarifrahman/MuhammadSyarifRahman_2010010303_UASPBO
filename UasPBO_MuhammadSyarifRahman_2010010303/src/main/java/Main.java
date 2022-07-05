import frame.MobilViewFrame;
import helpers.Koneksi;

public class Main {
    public static void main(String[] args) {
        Koneksi.getConnection();
        MobilViewFrame viewFrame = new MobilViewFrame();
        viewFrame.setVisible(true);
    }
}
