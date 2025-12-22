import javax.swing.JFrame;
import javax.swing.JLabel;      // <-- Yeni
import javax.swing.JTextField;  // <-- Yeni
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BirimDonusturucu_01 {
    public static void main(String[] args) {

        // Pencere nesnesini (çerçevesini) oluştur
        JFrame window = new JFrame("BirimDonusturucu");

        // Pencerenin başlığını ayarla
        window.setTitle("BirimDonusturucu");

        // Pencerenin boyutunu ayarla (genişlik, yükseklik piksel olarak)
        window.setSize(400, 300);

        // 'X' (kapat) tuşuna basınca programın tamamen durmasını sağla
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pencereye bileşenleri yan yana dizmesini söylüyoruz
        window.setLayout(new FlowLayout());

        // "Feet:" etiketini oluştur
        JLabel feetEtiquet = new JLabel("Feet: ");

        // Yanına bir metin kutusu oluştur (10 karakter genişliğinde)
        JTextField feetTextSpace = new JTextField(10);

        //bu iki bileşeni pencereye ekle
        window.add(feetEtiquet);
        window.add(feetTextSpace);



        window.setLayout(new FlowLayout());
        JLabel incEtiquet = new JLabel("İnç: ");
        JTextField incTextSpace = new JTextField(10);
        window.add(incEtiquet);
        window.add(incTextSpace);


        JButton convertButton = new JButton("Dönüştür");
        window.add(convertButton);



        //  Her şeyi ayarladıktan sonra pencereyi görünür yap (Bu her zaman en sonda olmalı)
        window.setVisible(true);
    }



}
