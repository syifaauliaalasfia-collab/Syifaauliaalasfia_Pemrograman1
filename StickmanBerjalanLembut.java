import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

public class StickmanBerjalanLembut extends JPanel implements ActionListener {
    private int x = 100;
    private double waktu = 0;
    private Timer timer;

    public StickmanBerjalanLembut() {
        timer = new Timer(30, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);

        // Judul Nama
        g.setColor(Color.GREEN);
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        g.drawString("DWI SUTIKNO", 50, 50);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.WHITE);

        int headY = 150;
        int headX = x;

        // Kepala
        g2.fillOval(headX, headY, 20, 20);

        // Badan
        int badanX = headX + 10;
        int badanY1 = headY + 20;
        int badanY2 = headY + 70;
        g2.drawLine(badanX, badanY1, badanX, badanY2);

        // Sudut ayunan
        double sudut = Math.sin(waktu) * 0.6;  // ~ ±35 derajat

        // Gambar tangan dan kaki dengan rotasi
        gambarAnggota(g2, badanX, headY + 35, 30, sudut, true);   // tangan kiri
        gambarAnggota(g2, badanX, headY + 35, 30, -sudut, true);  // tangan kanan
        gambarAnggota(g2, badanX, badanY2, 30, -sudut, false);    // kaki kiri
        gambarAnggota(g2, badanX, badanY2, 30, sudut, false);     // kaki kanan
    }

    // Fungsi menggambar anggota tubuh dengan rotasi
    private void gambarAnggota(Graphics2D g2, int x1, int y1, int panjang, double sudut, boolean atas) {
        AffineTransform old = g2.getTransform();
        g2.translate(x1, y1);
        g2.rotate(sudut);
        g2.drawLine(0, 0, 0, atas ? panjang : panjang); // anggota lurus ke bawah
        g2.setTransform(old);
    }

    public void actionPerformed(ActionEvent e) {
        waktu += 0.1;
        x += 2;
        if (x > getWidth() - 50) x = -30;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stickman Melangkah Alami");
        StickmanBerjalanLembut panel = new StickmanBerjalanLembut();
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}