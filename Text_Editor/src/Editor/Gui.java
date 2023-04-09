package Editor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import BuilderPattern.*;
import CommandPattern.*;
import ObserverPattern.LoggingListener;

public class Gui extends javax.swing.JFrame {

    Belge belge = new Belge();
    String adres;

    JFileChooser dosyaAcmaGoruntuleme;

    public Gui() {
        super("Metin Editorü");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        YaziAlani = new javax.swing.JTextArea();
        Cubuk = new javax.swing.JMenuBar();
        BelgeMenusu = new javax.swing.JMenu();
        BelgeOlustur = new javax.swing.JMenuItem();
        BelgeAc = new javax.swing.JMenuItem();
        BelgeKaydet = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Kapat = new javax.swing.JMenuItem();
        YaziEylemleriMenusu = new javax.swing.JMenu();
        YaziGeriAl = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Tema1 = new javax.swing.JMenuItem();
        Tema2 = new javax.swing.JMenuItem();
        Tema3 = new javax.swing.JMenuItem();

        KelimeDegistir = new javax.swing.JMenuItem();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        YaziAlani.setColumns(20);
        YaziAlani.setRows(5);


        YaziAlani.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {
                YaziAlaniKeyPressed(evt);
            }
        });

        jScrollPane1.setViewportView(YaziAlani);
        BelgeMenusu.setText("Belge");
        BelgeOlustur.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BelgeOlustur.setText("Oluştur");
        BelgeOlustur.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelgeOlusturActionPerformed(evt);
            }
        });
        BelgeMenusu.add(BelgeOlustur);
        BelgeAc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BelgeAc.setText("Aç...");
        BelgeAc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelgeAcActionPerformed(evt);
            }
        });
        BelgeMenusu.add(BelgeAc);
        BelgeKaydet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BelgeKaydet.setText("Kaydet");
        BelgeKaydet.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelgeKaydetActionPerformed(evt);
            }
        });
        BelgeMenusu.add(BelgeKaydet);
        BelgeMenusu.add(jSeparator2);
        Kapat.setText("Kapat");
        Kapat.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KapatActionPerformed(evt);
            }
        });
        BelgeMenusu.add(Kapat);
        Cubuk.add(BelgeMenusu);
        YaziEylemleriMenusu.setText("Değiştir");
        YaziGeriAl.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        YaziGeriAl.setText("Geri Al");
        YaziGeriAl.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YaziGeriAlActionPerformed(evt);
            }
        });
        YaziEylemleriMenusu.add(YaziGeriAl);
        YaziEylemleriMenusu.add(jSeparator1);

        KelimeDegistir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        KelimeDegistir.setText("Değiştir...");
        KelimeDegistir.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelimeDegistirActionPerformed(evt);
            }
        });
        YaziEylemleriMenusu.add(KelimeDegistir);
        YaziEylemleriMenusu.add(jSeparator3);


        Tema1.setText("Tema1");
        Tema1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tema1ActionPerformed(evt);
            }
        });
        YaziEylemleriMenusu.add(Tema1);

        Tema2.setText("Tema2");
        Tema2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tema2ActionPerformed(evt);
            }
        });
        YaziEylemleriMenusu.add(Tema2);

        Tema3.setText("Tema3");
        Tema3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tema3ActionPerformed(evt);
            }
        });
        YaziEylemleriMenusu.add(Tema3);

        Cubuk.add(YaziEylemleriMenusu);


        setJMenuBar(Cubuk);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE));
        pack();
    }// </editor-fold>

    private void Tema1ActionPerformed(ActionEvent evt) {
        TemaDirector director = new TemaDirector();
        Tema1Builder tema1Builder = new Tema1Builder();
        director.setTemaBuilder(tema1Builder);
        director.temaKur();
        Tema tema = director.temaAl();
        applyTheme(YaziAlani, tema);

    }

    private void Tema2ActionPerformed(ActionEvent evt) {
        TemaDirector director = new TemaDirector();
        Tema2Builder tema2Builder = new Tema2Builder();
        director.setTemaBuilder(tema2Builder);
        director.temaKur();
        Tema tema = director.temaAl();
        applyTheme(YaziAlani, tema);

    }

    private void Tema3ActionPerformed(ActionEvent evt) {
        TemaDirector director = new TemaDirector();
        Tema3Builder tema3Builder = new Tema3Builder();
        director.setTemaBuilder(tema3Builder);
        director.temaKur();
        Tema tema = director.temaAl();
        applyTheme(YaziAlani, tema);

    }

    private void KapatActionPerformed(java.awt.event.ActionEvent evt) {
        belge.kapat();
        setTitle("Metin Editorü");
        YaziAlani.setText(belge.icerigiAl());
        adres = null;
    }

    private void BelgeOlusturActionPerformed(java.awt.event.ActionEvent evt) {
        dosyaAcmaGoruntuleme = new JFileChooser();
        dosyaAcmaGoruntuleme.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        dosyaAcmaGoruntuleme.setCurrentDirectory(new File(System.getProperty("user.dir") + "/belgeler"));
        int result = dosyaAcmaGoruntuleme.showOpenDialog(BelgeOlustur);
        if (result == JFileChooser.APPROVE_OPTION) {
            adres = dosyaAcmaGoruntuleme.getSelectedFile().getAbsolutePath();
            Invoker kontrol = new Invoker();
            BelgeOlusturCommand belgeOlustur = new BelgeOlusturCommand(belge, adres);
            kontrol.commandBelirle(belgeOlustur);
            kontrol.uygula();
            adres += "/" + belge.getIsim();
            setTitle(belge.getIsim());
            YaziAlani.setText(belge.icerigiAl());
        }
    }

    private void BelgeAcActionPerformed(java.awt.event.ActionEvent evt) {
        dosyaAcmaGoruntuleme = new JFileChooser();
        dosyaAcmaGoruntuleme.setFileFilter(new FileNameExtensionFilter("Txt belgeleri", "txt"));
        dosyaAcmaGoruntuleme.setCurrentDirectory(new File(System.getProperty("user.dir") + "/belgeler"));
        int result = dosyaAcmaGoruntuleme.showOpenDialog(BelgeAc);
        if (result == JFileChooser.APPROVE_OPTION) {
            adres = dosyaAcmaGoruntuleme.getSelectedFile().getPath();
            //belge.belgeAc(adres);
            Invoker kontrol = new Invoker();
            BelgeAcCommand belgeAc = new BelgeAcCommand(belge, adres);
            kontrol.commandBelirle(belgeAc);
            kontrol.uygula();
            YaziAlani.setText(belge.icerigiAl());
            setTitle(dosyaAcmaGoruntuleme.getSelectedFile().getName());
        }
    }

    private void BelgeKaydetActionPerformed(java.awt.event.ActionEvent evt) {
        if (adres != null) {

            String yazilar = YaziAlani.getText();
            belge.icerigiDegistir(yazilar);
            Invoker kontrol = new Invoker();
            BelgeKaydetCommand belgeKaydet = new BelgeKaydetCommand(belge, adres);

            kontrol.commandBelirle(belgeKaydet);
            kontrol.uygula();

        } else {
            String yazilar = YaziAlani.getText();
            BelgeOlusturActionPerformed(evt);
            if (adres == null)
                return;
            belge.icerigiDegistir(yazilar);
            try {
                belge.belgeKaydet(adres);
            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            YaziAlani.setText(yazilar);

        }
    }


    private void KelimeDegistirActionPerformed(java.awt.event.ActionEvent evt) {
        String degiscek_kelime = JOptionPane.showInputDialog(null, "Değişcek kelimeyi giriniz.");
        String yerine_gelicek_kelime = JOptionPane.showInputDialog(null, "Yerine gelicek kelimeyi giriniz.");
        belge.icerigiDegistir(YaziAlani.getText());
        belge.bulDegistir(degiscek_kelime, yerine_gelicek_kelime);
        YaziAlani.setText(belge.icerigiAl());
    }

    private void YaziGeriAlActionPerformed(java.awt.event.ActionEvent evt) {
        Invoker kontrol = new Invoker(); //Dependency
        GeriAlCommand geri_al = new GeriAlCommand(belge); //Dependency
        kontrol.commandBelirle(geri_al);
        kontrol.uygula();
        YaziAlani.setText(belge.icerigiAl());
    }

    private void YaziAlaniKeyPressed(java.awt.event.KeyEvent evt) {
        if ((evt.getKeyChar() != KeyEvent.CHAR_UNDEFINED && !(evt.isControlDown() || evt.isAltDown())) || ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) || ((evt.getKeyCode() == KeyEvent.VK_X) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)))
            belge.aksiyonEkle(YaziAlani.getText());
    }

    public void applyTheme(JTextArea text, Tema tema) {
        text.setBackground(tema.getRenk());
        text.setForeground(tema.getTextRenk());
        text.setFont(new Font(tema.getFont(), Font.PLAIN, tema.getTextBoyutu()));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem BelgeAc;
    private javax.swing.JMenuItem BelgeKaydet;
    private javax.swing.JMenu BelgeMenusu;
    private javax.swing.JMenuItem BelgeOlustur;
    private javax.swing.JMenuBar Cubuk;
    private javax.swing.JMenuItem Kapat;
    private javax.swing.JMenuItem KelimeDegistir;
    private javax.swing.JTextArea YaziAlani;
    private javax.swing.JMenu YaziEylemleriMenusu;
    private javax.swing.JMenuItem YaziGeriAl;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem Tema1;
    private javax.swing.JMenuItem Tema2;
    private javax.swing.JMenuItem Tema3;
    // End of variables declaration
}
