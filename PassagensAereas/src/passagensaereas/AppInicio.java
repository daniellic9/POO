package passagensaereas;

import Disco.Disco;
import static Disco.Disco.agendaVoos;
import static Disco.Disco.agendaVoo;
import com.itextpdf.text.Chunk;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


/**
 *
 * @author arthur
 */
public class AppInicio extends javax.swing.JFrame {
    
    Disco disc = new Disco();
    int poltx,polty;
    
    public AppInicio() {
    
     

      /*  agendaVoo.add(new Voos("São Paulo", "Rio de Janeiro"));
    agendaVoo.add(new Voos("São Paulo","Vitória"));
    agendaVoo.add(new Voos("São Paulo","Porto Alegre"));
    agendaVoo.add(new Voos("São Paulo","Brasília"));
    agendaVoo.add(new Voos("São Paulo","Belo Horizonte"));
    agendaVoo.add(new Voos("São Paulo","Manaus"));
    agendaVoo.add(new Voos("São Paulo","Fortaleza"));
    agendaVoo.add(new Voos("São Paulo","Natal"));
    agendaVoo.add(new Voos("Brasília","São Paulo"));
    agendaVoo.add(new Voos("Brasília","Rio de Janeiro"));
    agendaVoo.add(new Voos("Brasília","Vitória"));
    agendaVoo.add(new Voos("Brasília","Porto Alegre"));
    agendaVoo.add(new Voos("Brasília","Manaus"));
    agendaVoo.add(new Voos("Brasília","Fortaleza"));
    agendaVoo.add(new Voos("Brasília","Belo Horizonte"));
    agendaVoo.add(new Voos("Brasília","Natal"));
    agendaVoo.add(new Voos("Rio de Janeiro","São Paulo"));
    agendaVoo.add(new Voos("Rio de Janeiro","Vitória"));
    agendaVoo.add(new Voos("Rio de Janeiro","Porto Alegre"));
    agendaVoo.add(new Voos("Rio de Janeiro","Belo Horizonte"));
    agendaVoo.add(new Voos("Rio de Janeiro","Brasília"));
    agendaVoo.add(new Voos("Rio de Janeiro","Manaus"));
    agendaVoo.add(new Voos("Rio de Janeiro","Fortaleza"));
    agendaVoo.add(new Voos("Rio de Janeiro","Natal"));
    agendaVoo.add(new Voos("Vitória","Rio de Janeiro"));
    agendaVoo.add(new Voos("Vitória","São Paulo"));
    agendaVoo.add(new Voos("Vitória","Porto Alegre"));
    agendaVoo.add(new Voos("Vitória","Belo Horizonte"));
    agendaVoo.add(new Voos("Vitória","Brasília"));
    agendaVoo.add(new Voos("Vitória","Manaus"));
    agendaVoo.add(new Voos("Vitória","Fortaleza"));
    agendaVoo.add(new Voos("Vitória","Natal"));
    agendaVoo.add(new Voos("Manaus","Natal"));
    agendaVoo.add(new Voos("Manaus","Fortaleza"));
    agendaVoo.add(new Voos("Manaus","Brasília"));
    agendaVoo.add(new Voos("Manaus","São Paulo"));
    agendaVoo.add(new Voos("Manaus","Rio de Janeiro"));
    agendaVoo.add(new Voos("Manaus","Vitória"));
    agendaVoo.add(new Voos("Manaus","Porto Alegre"));
    agendaVoo.add(new Voos("Manaus","Belo Horizonte"));
    agendaVoo.add(new Voos("Natal","Manaus"));
    agendaVoo.add(new Voos("Natal","Fortaleza"));
    agendaVoo.add(new Voos("Natal","Brasília"));
    agendaVoo.add(new Voos("Natal","São Paulo"));
    agendaVoo.add(new Voos("Natal","Rio de Janeiro"));
    agendaVoo.add(new Voos("Natal","Vitória"));
    agendaVoo.add(new Voos("Natal","Porto Alegre"));
    agendaVoo.add(new Voos("Natal","Belo Horizonte"));
    agendaVoo.add(new Voos("Fortaleza","Manaus"));
    agendaVoo.add(new Voos("Fortaleza","Natal"));
    agendaVoo.add(new Voos("Fortaleza","Brasília"));
    agendaVoo.add(new Voos("Fortaleza","São Paulo"));
    agendaVoo.add(new Voos("Fortaleza","Rio de Janeiro"));
    agendaVoo.add(new Voos("Fortaleza","Vitória"));
    agendaVoo.add(new Voos("Fortaleza","Porto Alegre"));
    agendaVoo.add(new Voos("Fortaleza","Belo Horizonte"));
    agendaVoo.add(new Voos("Porto Alegre","São Paulo"));
    agendaVoo.add(new Voos("Porto Alegre","Rio de Janeiro"));
    agendaVoo.add(new Voos("Porto Alegre","Vitória"));
    agendaVoo.add(new Voos("Porto Alegre","Natal"));
    agendaVoo.add(new Voos("Porto Alegre","Brasília"));
    agendaVoo.add(new Voos("Porto Alegre","Manaus"));
    agendaVoo.add(new Voos("Porto Alegre","Fortaleza"));
    agendaVoo.add(new Voos("Porto Alegre","Natal"));
    disc.salvarVoo();
   */
          
        initComponents();
        setIconImage(new ImageIcon("Icons/Whale.png").getImage());
        
//        Toolkit tool = Toolkit.getDefaultToolkit();
//        Dimension dim = new Dimension(tool.getScreenSize());
//        int height = (int) dim.getHeight();
//        int width = (int) dim.getWidth();
//        setSize(width, height);
//        setLocation(width/2 - getWidth() / 2, height / 2 - getHeight() / 2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTOTAL = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jSubtitulo = new javax.swing.JLabel();
        pConta = new javax.swing.JPanel();
        JIconConta = new javax.swing.JLabel();
        jlblConta = new javax.swing.JLabel();
        pCheckIn = new javax.swing.JPanel();
        jIconCheckIn = new javax.swing.JLabel();
        jlblCheckIn = new javax.swing.JLabel();
        pNovidade = new javax.swing.JPanel();
        jIconNovidades = new javax.swing.JLabel();
        jlblNovidades = new javax.swing.JLabel();
        pVender = new javax.swing.JPanel();
        jIconVender = new javax.swing.JLabel();
        jlblVender = new javax.swing.JLabel();
        pRepresentante = new javax.swing.JPanel();
        jIconRepresentante = new javax.swing.JLabel();
        jlblRepresentante = new javax.swing.JLabel();
        PainelTelas = new javax.swing.JPanel();
        PainelBoasVindas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        jlblExit = new javax.swing.JLabel();
        PainelRepresentante = new javax.swing.JPanel();
        btnExit5 = new javax.swing.JPanel();
        jlblExit5 = new javax.swing.JLabel();
        jlblEquipeAzul = new javax.swing.JLabel();
        lblArthur = new javax.swing.JLabel();
        lblDanielli = new javax.swing.JLabel();
        lblThayza = new javax.swing.JLabel();
        PainelNovidades = new javax.swing.JPanel();
        btnExit4 = new javax.swing.JPanel();
        jlblExit4 = new javax.swing.JLabel();
        painelNovidades = new javax.swing.JPanel();
        pNovidadesEsq = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pNovidadesDir = new javax.swing.JPanel();
        lblNovidades = new javax.swing.JLabel();
        PainelVenderPassagem = new javax.swing.JPanel();
        btnExit3 = new javax.swing.JPanel();
        jlblExit3 = new javax.swing.JLabel();
        painelVenderPassagem = new javax.swing.JPanel();
        pVenderPassagemEsq = new javax.swing.JPanel();
        pVPassagemBaleia = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pVPoltronas = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        lblPoltA = new javax.swing.JLabel();
        lblPoltB = new javax.swing.JLabel();
        lblPoltC = new javax.swing.JLabel();
        lblPoltD = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pVenderPassagemDir = new javax.swing.JPanel();
        pSelecaoPassagem = new javax.swing.JPanel();
        txtOrigem = new javax.swing.JTextField();
        lblOrigem = new javax.swing.JLabel();
        jSepOrigem = new javax.swing.JSeparator();
        btnPesquisar = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        jSepData = new javax.swing.JSeparator();
        txtDestino = new javax.swing.JTextField();
        lblDestino = new javax.swing.JLabel();
        jSepDestino = new javax.swing.JSeparator();
        jFormattedData = new javax.swing.JFormattedTextField();
        pCompradePassagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtIDVOOPASSAGEM = new javax.swing.JTextField();
        lblDestino1 = new javax.swing.JLabel();
        jSepDestino1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pSelecaoPoltrona = new javax.swing.JPanel();
        txtOrigem1 = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jSepOrigem1 = new javax.swing.JSeparator();
        btnComprarPoltrona = new javax.swing.JButton();
        lblNumPoltrona = new javax.swing.JLabel();
        jSepData1 = new javax.swing.JSeparator();
        lblCPF = new javax.swing.JLabel();
        jSepDestino3 = new javax.swing.JSeparator();
        jFormattedData1 = new javax.swing.JFormattedTextField();
        lblPoltrona = new javax.swing.JLabel();
        PainelCheckIn = new javax.swing.JPanel();
        btnExit2 = new javax.swing.JPanel();
        jlblExit2 = new javax.swing.JLabel();
        painelCheckIn = new javax.swing.JPanel();
        pCheckInEsq = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pCheckInDir = new javax.swing.JPanel();
        txtIDVoo = new javax.swing.JTextField();
        lblIdDoVoo = new javax.swing.JLabel();
        jSepIdDoVoo = new javax.swing.JSeparator();
        btnCarregar = new javax.swing.JButton();
        PainelConta = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JPanel();
        jlblExit1 = new javax.swing.JLabel();
        painelConta = new javax.swing.JPanel();
        pContaEsq = new javax.swing.JPanel();
        lblIconLogin = new javax.swing.JLabel();
        lblImagemLogin = new javax.swing.JLabel();
        pContaDir = new javax.swing.JPanel();
        pLogin = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblLogin = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrarLogin = new javax.swing.JButton();
        pMenu = new javax.swing.JPanel();
        lblBemvindo = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        btnverVendas = new javax.swing.JPanel();
        iconeVendas = new javax.swing.JLabel();
        nomevendas = new javax.swing.JLabel();
        btnSai = new javax.swing.JPanel();
        nomesai = new javax.swing.JLabel();
        iconesai = new javax.swing.JLabel();
        btnGerar2Via = new javax.swing.JPanel();
        nomeGerar = new javax.swing.JLabel();
        iconeGerar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelTOTAL.setBackground(PainelTOTAL.getBackground());
        PainelTOTAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(30, 153, 219));
        SidePanel.setForeground(new java.awt.Color(123, 84, 167));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(SidePanel.getBackground());
        Titulo.setToolTipText("");
        Titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Universalis ADF Std", 1, 52)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 250, 250));
        jTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/LogoBaleia.png"))); // NOI18N
        jTitulo.setText("Orca");
        Titulo.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 90));

        jSubtitulo.setForeground(new java.awt.Color(254, 254, 254));
        jSubtitulo.setText("Linhas Aereas.");
        Titulo.add(jSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        SidePanel.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 100));

        pConta.setBackground(SidePanel.getBackground());
        pConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pContaMousePressed(evt);
            }
        });
        pConta.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        JIconConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Conta.png"))); // NOI18N
        JIconConta.setText(" ");
        pConta.add(JIconConta);

        jlblConta.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblConta.setForeground(new java.awt.Color(254, 254, 254));
        jlblConta.setText("Conta");
        pConta.add(jlblConta);

        SidePanel.add(pConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 50));

        pCheckIn.setBackground(SidePanel.getBackground());
        pCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCheckInMousePressed(evt);
            }
        });
        pCheckIn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Checkin.png"))); // NOI18N
        pCheckIn.add(jIconCheckIn);

        jlblCheckIn.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblCheckIn.setForeground(new java.awt.Color(254, 254, 254));
        jlblCheckIn.setText("Check-in");
        pCheckIn.add(jlblCheckIn);

        SidePanel.add(pCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 290, 50));

        pNovidade.setBackground(SidePanel.getBackground());
        pNovidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pNovidadeMousePressed(evt);
            }
        });
        pNovidade.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconNovidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Novidades.png"))); // NOI18N
        jIconNovidades.setText(" ");
        pNovidade.add(jIconNovidades);

        jlblNovidades.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblNovidades.setForeground(new java.awt.Color(254, 254, 254));
        jlblNovidades.setText("Novidades");
        pNovidade.add(jlblNovidades);

        SidePanel.add(pNovidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 290, 50));

        pVender.setBackground(SidePanel.getBackground());
        pVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pVenderMousePressed(evt);
            }
        });
        pVender.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/VendaPassagem.png"))); // NOI18N
        pVender.add(jIconVender);

        jlblVender.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblVender.setForeground(new java.awt.Color(254, 254, 254));
        jlblVender.setText("Vender passagem");
        pVender.add(jlblVender);

        SidePanel.add(pVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 290, 50));

        pRepresentante.setBackground(SidePanel.getBackground());
        pRepresentante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pRepresentanteMousePressed(evt);
            }
        });
        pRepresentante.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jIconRepresentante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Representantes.png"))); // NOI18N
        pRepresentante.add(jIconRepresentante);

        jlblRepresentante.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 18)); // NOI18N
        jlblRepresentante.setForeground(new java.awt.Color(254, 254, 254));
        jlblRepresentante.setText("Representante");
        pRepresentante.add(jlblRepresentante);

        SidePanel.add(pRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 50));

        PainelTOTAL.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 647));

        PainelTelas.setBackground(new java.awt.Color(254, 254, 254));
        PainelTelas.setLayout(new java.awt.CardLayout());

        PainelBoasVindas.setBackground(new java.awt.Color(254, 254, 254));
        PainelBoasVindas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 153, 219));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Janelinha.png"))); // NOI18N
        jLabel1.setText("Seja bem vindo à linha aérea Orca");
        PainelBoasVindas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 620));

        btnExit.setBackground(PainelBoasVindas.getBackground());
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        jlblExit.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit.setText("X");

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelBoasVindas.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        PainelTelas.add(PainelBoasVindas, "card7");

        PainelRepresentante.setBackground(new java.awt.Color(0, 77, 128));
        PainelRepresentante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit5.setBackground(PainelBoasVindas.getBackground());
        btnExit5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit5MouseClicked(evt);
            }
        });

        jlblExit5.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit5.setText("X");

        javax.swing.GroupLayout btnExit5Layout = new javax.swing.GroupLayout(btnExit5);
        btnExit5.setLayout(btnExit5Layout);
        btnExit5Layout.setHorizontalGroup(
            btnExit5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnExit5Layout.setVerticalGroup(
            btnExit5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelRepresentante.add(btnExit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        jlblEquipeAzul.setFont(new java.awt.Font("TeX Gyre DejaVu Math", 0, 48)); // NOI18N
        jlblEquipeAzul.setForeground(new java.awt.Color(254, 254, 254));
        jlblEquipeAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Equipe.png"))); // NOI18N
        jlblEquipeAzul.setText("Equipe ");
        PainelRepresentante.add(jlblEquipeAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 90));

        lblArthur.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 36)); // NOI18N
        lblArthur.setForeground(new java.awt.Color(254, 254, 254));
        lblArthur.setText("Arthur Costa de Novais");
        PainelRepresentante.add(lblArthur, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblDanielli.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 36)); // NOI18N
        lblDanielli.setForeground(new java.awt.Color(254, 254, 254));
        lblDanielli.setText("Danielli dos Reis Costa");
        PainelRepresentante.add(lblDanielli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        lblThayza.setFont(new java.awt.Font("Te X Gyre Adventor", 0, 36)); // NOI18N
        lblThayza.setForeground(new java.awt.Color(254, 254, 254));
        lblThayza.setText("Thayza Sacconi Guarnier");
        PainelRepresentante.add(lblThayza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        PainelTelas.add(PainelRepresentante, "card2");

        PainelNovidades.setBackground(new java.awt.Color(0, 77, 128));
        PainelNovidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit4.setBackground(PainelBoasVindas.getBackground());
        btnExit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit4MouseClicked(evt);
            }
        });

        jlblExit4.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit4.setText("X");

        javax.swing.GroupLayout btnExit4Layout = new javax.swing.GroupLayout(btnExit4);
        btnExit4.setLayout(btnExit4Layout);
        btnExit4Layout.setHorizontalGroup(
            btnExit4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit4Layout.setVerticalGroup(
            btnExit4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelNovidades.add(btnExit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelNovidades.setBackground(new java.awt.Color(0, 77, 128));
        painelNovidades.setLayout(new java.awt.GridLayout(1, 0));

        pNovidadesEsq.setBackground(new java.awt.Color(24, 116, 210));
        pNovidadesEsq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load5.gif"))); // NOI18N
        pNovidadesEsq.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 410, 530));

        painelNovidades.add(pNovidadesEsq);

        pNovidadesDir.setBackground(new java.awt.Color(27, 62, 111));
        pNovidadesDir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNovidades.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lblNovidades.setForeground(new java.awt.Color(254, 254, 254));
        lblNovidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNovidades.setText("NOVIDADES EM BREVE!!");
        pNovidadesDir.add(lblNovidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 530));

        painelNovidades.add(pNovidadesDir);

        PainelNovidades.add(painelNovidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelNovidades, "card2");

        PainelVenderPassagem.setBackground(new java.awt.Color(0, 77, 128));
        PainelVenderPassagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit3.setBackground(PainelBoasVindas.getBackground());
        btnExit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit3MouseClicked(evt);
            }
        });

        jlblExit3.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit3.setText("X");

        javax.swing.GroupLayout btnExit3Layout = new javax.swing.GroupLayout(btnExit3);
        btnExit3.setLayout(btnExit3Layout);
        btnExit3Layout.setHorizontalGroup(
            btnExit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit3Layout.setVerticalGroup(
            btnExit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelVenderPassagem.add(btnExit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelVenderPassagem.setBackground(new java.awt.Color(0, 77, 128));
        painelVenderPassagem.setLayout(new java.awt.GridLayout(1, 0));

        pVenderPassagemEsq.setLayout(new java.awt.CardLayout());

        pVPassagemBaleia.setBackground(new java.awt.Color(24, 116, 210));
        pVPassagemBaleia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load2.gif"))); // NOI18N
        pVPassagemBaleia.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 330, 280));

        pVenderPassagemEsq.add(pVPassagemBaleia, "card2");

        pVPoltronas.setBackground(new java.awt.Color(254, 254, 254));
        pVPoltronas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 50, 52, -1));

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 111, 52, -1));

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 172, 52, -1));

        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 233, 52, -1));

        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 294, 52, -1));

        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 355, 52, -1));

        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 416, 52, -1));

        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 477, 52, -1));

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 50, 52, -1));

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 111, 52, -1));

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 172, 52, -1));

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 233, 52, -1));

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 294, 52, -1));

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 355, 52, -1));

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 416, 52, -1));

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 477, 52, -1));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 50, 52, -1));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 111, 52, -1));

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 172, 52, -1));

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 233, 52, -1));

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 294, 52, -1));

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 355, 52, -1));

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 416, 52, -1));

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 477, 52, -1));

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 50, 52, -1));

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 111, 52, -1));

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 172, 52, -1));

        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 233, 52, -1));

        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 294, 52, -1));

        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 355, 52, -1));

        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 416, 52, -1));

        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 477, 52, -1));

        lblPoltA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoltA.setText("A");
        pVPoltronas.add(lblPoltA, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 12, 52, -1));

        lblPoltB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoltB.setText("B");
        pVPoltronas.add(lblPoltB, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 12, 52, -1));

        lblPoltC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoltC.setText("C");
        pVPoltronas.add(lblPoltC, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 12, 52, -1));

        lblPoltD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoltD.setText("D");
        pVPoltronas.add(lblPoltD, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 12, 52, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1");
        pVPoltronas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 40, 49));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("2");
        pVPoltronas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 111, 40, 49));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("4");
        pVPoltronas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 233, 40, 49));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("3");
        pVPoltronas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, 40, 49));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("6");
        pVPoltronas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 355, 40, 49));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("7");
        pVPoltronas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 416, 40, 49));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("5");
        pVPoltronas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 294, 40, 49));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("8");
        pVPoltronas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 40, 50));

        pVenderPassagemEsq.add(pVPoltronas, "card3");

        painelVenderPassagem.add(pVenderPassagemEsq);

        pVenderPassagemDir.setLayout(new java.awt.CardLayout());

        pSelecaoPassagem.setBackground(new java.awt.Color(27, 62, 111));
        pSelecaoPassagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrigem.setBackground(new java.awt.Color(27, 62, 111));
        txtOrigem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtOrigem.setForeground(new java.awt.Color(254, 254, 254));
        txtOrigem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtOrigem.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        txtOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigemActionPerformed(evt);
            }
        });
        pSelecaoPassagem.add(txtOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 30));

        lblOrigem.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblOrigem.setForeground(new java.awt.Color(254, 254, 254));
        lblOrigem.setText("ORIGEM");
        pSelecaoPassagem.add(lblOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 30));

        jSepOrigem.setBackground(new java.awt.Color(254, 254, 254));
        jSepOrigem.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(jSepOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 10));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pSelecaoPassagem.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 110, -1));

        lblData.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(254, 254, 254));
        lblData.setText("DATA");
        pSelecaoPassagem.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        jSepData.setBackground(new java.awt.Color(254, 254, 254));
        jSepData.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(jSepData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 10));

        txtDestino.setBackground(new java.awt.Color(27, 62, 111));
        txtDestino.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(254, 254, 254));
        txtDestino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDestino.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 30));

        lblDestino.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(254, 254, 254));
        lblDestino.setText("DESTINO");
        pSelecaoPassagem.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jSepDestino.setBackground(new java.awt.Color(254, 254, 254));
        jSepDestino.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPassagem.add(jSepDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 10));

        jFormattedData.setBackground(new java.awt.Color(27, 62, 111));
        jFormattedData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jFormattedData.setForeground(new java.awt.Color(254, 254, 254));
        try {
            jFormattedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedData.setText("  /        /    ");
        pSelecaoPassagem.add(jFormattedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 30));

        pVenderPassagemDir.add(pSelecaoPassagem, "card2");

        pCompradePassagem.setBackground(new java.awt.Color(27, 62, 111));
        pCompradePassagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pCompradePassagem.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 180));

        txtIDVOOPASSAGEM.setBackground(new java.awt.Color(27, 62, 111));
        txtIDVOOPASSAGEM.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtIDVOOPASSAGEM.setForeground(new java.awt.Color(254, 254, 254));
        txtIDVOOPASSAGEM.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIDVOOPASSAGEM.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        pCompradePassagem.add(txtIDVOOPASSAGEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 30));

        lblDestino1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblDestino1.setForeground(new java.awt.Color(254, 254, 254));
        lblDestino1.setText("ID DO VOO");
        pCompradePassagem.add(lblDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, 30));

        jSepDestino1.setBackground(new java.awt.Color(254, 254, 254));
        jSepDestino1.setForeground(new java.awt.Color(254, 254, 254));
        pCompradePassagem.add(jSepDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, 10));

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pCompradePassagem.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 90, -1));

        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pCompradePassagem.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 90, -1));

        pVenderPassagemDir.add(pCompradePassagem, "card3");

        pSelecaoPoltrona.setBackground(new java.awt.Color(27, 62, 111));
        pSelecaoPoltrona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrigem1.setBackground(new java.awt.Color(27, 62, 111));
        txtOrigem1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtOrigem1.setForeground(new java.awt.Color(254, 254, 254));
        txtOrigem1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtOrigem1.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        txtOrigem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigem1ActionPerformed(evt);
            }
        });
        pSelecaoPoltrona.add(txtOrigem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 30));

        lblNome.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(254, 254, 254));
        lblNome.setText("NOME");
        pSelecaoPoltrona.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 30));

        jSepOrigem1.setBackground(new java.awt.Color(254, 254, 254));
        jSepOrigem1.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPoltrona.add(jSepOrigem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 10));

        btnComprarPoltrona.setText("Comprar");
        btnComprarPoltrona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPoltronaActionPerformed(evt);
            }
        });
        pSelecaoPoltrona.add(btnComprarPoltrona, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 110, -1));

        lblNumPoltrona.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblNumPoltrona.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPoltrona.add(lblNumPoltrona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 40, 30));

        jSepData1.setBackground(new java.awt.Color(254, 254, 254));
        jSepData1.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPoltrona.add(jSepData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 40, 10));

        lblCPF.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(254, 254, 254));
        lblCPF.setText("CPF");
        pSelecaoPoltrona.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jSepDestino3.setBackground(new java.awt.Color(254, 254, 254));
        jSepDestino3.setForeground(new java.awt.Color(254, 254, 254));
        pSelecaoPoltrona.add(jSepDestino3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 10));

        jFormattedData1.setBackground(new java.awt.Color(27, 62, 111));
        jFormattedData1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jFormattedData1.setForeground(new java.awt.Color(254, 254, 254));
        try {
            jFormattedData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedData1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedData1.setText("584.545.454-54");
        pSelecaoPoltrona.add(jFormattedData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 30));

        lblPoltrona.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblPoltrona.setForeground(new java.awt.Color(254, 254, 254));
        lblPoltrona.setText("POLTRONA");
        pSelecaoPoltrona.add(lblPoltrona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        pVenderPassagemDir.add(pSelecaoPoltrona, "card2");

        painelVenderPassagem.add(pVenderPassagemDir);

        PainelVenderPassagem.add(painelVenderPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelVenderPassagem, "card2");

        PainelCheckIn.setBackground(new java.awt.Color(0, 77, 128));
        PainelCheckIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit2.setBackground(PainelBoasVindas.getBackground());
        btnExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit2MouseClicked(evt);
            }
        });

        jlblExit2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit2.setText("X");

        javax.swing.GroupLayout btnExit2Layout = new javax.swing.GroupLayout(btnExit2);
        btnExit2.setLayout(btnExit2Layout);
        btnExit2Layout.setHorizontalGroup(
            btnExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit2Layout.setVerticalGroup(
            btnExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PainelCheckIn.add(btnExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelCheckIn.setBackground(new java.awt.Color(0, 77, 128));
        painelCheckIn.setLayout(new java.awt.GridLayout(1, 0));

        pCheckInEsq.setBackground(new java.awt.Color(254, 254, 254));
        pCheckInEsq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load4.gif"))); // NOI18N
        pCheckInEsq.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -40, -1, -1));

        painelCheckIn.add(pCheckInEsq);

        pCheckInDir.setBackground(new java.awt.Color(27, 62, 111));
        pCheckInDir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIDVoo.setBackground(new java.awt.Color(27, 62, 111));
        txtIDVoo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtIDVoo.setForeground(new java.awt.Color(254, 254, 254));
        txtIDVoo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIDVoo.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        pCheckInDir.add(txtIDVoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 129, 290, 30));

        lblIdDoVoo.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblIdDoVoo.setForeground(new java.awt.Color(254, 254, 254));
        lblIdDoVoo.setText("ID DO VOO");
        pCheckInDir.add(lblIdDoVoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 30));

        jSepIdDoVoo.setBackground(new java.awt.Color(254, 254, 254));
        jSepIdDoVoo.setForeground(new java.awt.Color(254, 254, 254));
        pCheckInDir.add(jSepIdDoVoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 10));

        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        pCheckInDir.add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 80, -1));

        painelCheckIn.add(pCheckInDir);

        PainelCheckIn.add(painelCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelCheckIn, "card2");

        PainelConta.setBackground(new java.awt.Color(0, 77, 128));
        PainelConta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit1.setBackground(PainelBoasVindas.getBackground());
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit1MouseClicked(evt);
            }
        });

        jlblExit1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jlblExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit1.setText("X");

        javax.swing.GroupLayout btnExit1Layout = new javax.swing.GroupLayout(btnExit1);
        btnExit1.setLayout(btnExit1Layout);
        btnExit1Layout.setHorizontalGroup(
            btnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExit1Layout.setVerticalGroup(
            btnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblExit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelConta.add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        painelConta.setBackground(new java.awt.Color(0, 77, 128));
        painelConta.setLayout(new java.awt.GridLayout(1, 0));

        pContaEsq.setBackground(new java.awt.Color(254, 254, 254));
        pContaEsq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/LoginConta.png"))); // NOI18N
        pContaEsq.add(lblIconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        lblImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Load3.gif"))); // NOI18N
        lblImagemLogin.setText("jLabel5");
        pContaEsq.add(lblImagemLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -10, 650, -1));

        painelConta.add(pContaEsq);

        pContaDir.setLayout(new java.awt.CardLayout());

        pLogin.setBackground(new java.awt.Color(27, 62, 111));
        pLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSenha.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(254, 254, 254));
        lblSenha.setText("SENHA");
        pLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 30));

        txtLogin.setBackground(new java.awt.Color(27, 62, 111));
        txtLogin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(254, 254, 254));
        txtLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtLogin.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        pLogin.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 129, 290, 30));

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setForeground(new java.awt.Color(254, 254, 254));
        pLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 10));

        lblLogin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(254, 254, 254));
        lblLogin.setText("LOGIN");
        pLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 30));

        jSeparator2.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator2.setForeground(new java.awt.Color(254, 254, 254));
        pLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 10));

        txtSenha.setBackground(new java.awt.Color(27, 62, 111));
        txtSenha.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(254, 254, 254));
        txtSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        pLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 30));

        btnEntrarLogin.setText("ENTRAR");
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });
        pLogin.add(btnEntrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 80, -1));

        pContaDir.add(pLogin, "card3");

        pMenu.setBackground(new java.awt.Color(254, 254, 254));
        pMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemvindo.setFont(new java.awt.Font("Universalis ADF Std", 0, 30)); // NOI18N
        lblBemvindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemvindo.setText("Bem vindo a sua conta,");
        pMenu.add(lblBemvindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, -1));

        lblNomeUsuario.setFont(new java.awt.Font("Universalis ADF Std", 0, 30)); // NOI18N
        lblNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pMenu.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, 50));

        btnverVendas.setBackground(new java.awt.Color(30, 153, 219));
        btnverVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnverVendasMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnverVendasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnverVendasMouseEntered(evt);
            }
        });

        iconeVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/Vendas.png"))); // NOI18N

        nomevendas.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomevendas.setForeground(new java.awt.Color(254, 254, 254));
        nomevendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomevendas.setText("Vendas");

        javax.swing.GroupLayout btnverVendasLayout = new javax.swing.GroupLayout(btnverVendas);
        btnverVendas.setLayout(btnverVendasLayout);
        btnverVendasLayout.setHorizontalGroup(
            btnverVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomevendas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnverVendasLayout.setVerticalGroup(
            btnverVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnverVendasLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nomevendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(iconeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pMenu.add(btnverVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 110, 110));

        btnSai.setBackground(new java.awt.Color(30, 153, 219));
        btnSai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaiMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaiMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaiMouseEntered(evt);
            }
        });

        nomesai.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomesai.setForeground(new java.awt.Color(254, 254, 254));
        nomesai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomesai.setText("Sair");

        iconesai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconesai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/SairConta.png"))); // NOI18N

        javax.swing.GroupLayout btnSaiLayout = new javax.swing.GroupLayout(btnSai);
        btnSai.setLayout(btnSaiLayout);
        btnSaiLayout.setHorizontalGroup(
            btnSaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomesai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconesai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnSaiLayout.setVerticalGroup(
            btnSaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaiLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nomesai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(iconesai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pMenu.add(btnSai, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 110, 110));

        btnGerar2Via.setBackground(new java.awt.Color(30, 153, 219));
        btnGerar2Via.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGerar2ViaMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGerar2ViaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGerar2ViaMouseEntered(evt);
            }
        });

        nomeGerar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomeGerar.setForeground(new java.awt.Color(254, 254, 254));
        nomeGerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeGerar.setText("Gerar 2 via");

        iconeGerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/SegundaVia.png"))); // NOI18N

        javax.swing.GroupLayout btnGerar2ViaLayout = new javax.swing.GroupLayout(btnGerar2Via);
        btnGerar2Via.setLayout(btnGerar2ViaLayout);
        btnGerar2ViaLayout.setHorizontalGroup(
            btnGerar2ViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGerar2ViaLayout.createSequentialGroup()
                .addGroup(btnGerar2ViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        btnGerar2ViaLayout.setVerticalGroup(
            btnGerar2ViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGerar2ViaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nomeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(iconeGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
        );

        pMenu.add(btnGerar2Via, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, 110));

        pContaDir.add(pMenu, "card3");

        painelConta.add(pContaDir);

        PainelConta.add(painelConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 530));

        PainelTelas.add(PainelConta, "card2");

        PainelTOTAL.add(PainelTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 930, 620));

        getContentPane().add(PainelTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xy,xx;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void pRepresentanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRepresentanteMousePressed
        setColor(pRepresentante);
        resetColor(pConta);
        resetColor(pVender);
        resetColor(pCheckIn);
        resetColor(pNovidade);
        //resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelRepresentante);
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
    }//GEN-LAST:event_pRepresentanteMousePressed

    private void pVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVenderMousePressed
        setColor(pVender);
        resetColor(pConta);
        //resetColor(pVender);
        resetColor(pCheckIn);
        resetColor(pNovidade);
        resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelVenderPassagem);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pVenderMousePressed

    private void pNovidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNovidadeMousePressed
        setColor(pNovidade);
        resetColor(pConta);
        resetColor(pVender);
        resetColor(pCheckIn);
        //resetColor(pNovidade);
        resetColor(pRepresentante);

        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelNovidades);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pNovidadeMousePressed

    private void pCheckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCheckInMousePressed
        setColor(pCheckIn);
        resetColor(pConta);
        resetColor(pVender);
        //resetColor(pCheckIn);
        resetColor(pNovidade);
        resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        PainelTelas.add(PainelCheckIn);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pCheckInMousePressed

    private void pContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pContaMousePressed
        setColor(pConta);
        //resetColor(pConta);
        resetColor(pVender);
        resetColor(pCheckIn);
        resetColor(pNovidade);
        resetColor(pRepresentante);
        
        PainelTelas.removeAll();
        PainelTelas.repaint();
        PainelTelas.revalidate();
        
        
        PainelTelas.add(PainelConta);
        PainelTelas.repaint();
        PainelTelas.revalidate();
    }//GEN-LAST:event_pContaMousePressed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit1MouseClicked

    private void btnExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit2MouseClicked

    private void btnExit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit3MouseClicked

    private void btnExit5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit5MouseClicked

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLoginActionPerformed
        if(txtLogin.getText().equals("Arthur") && txtSenha.getText().equals("123")) {
            pLogin.setVisible(false);
            lblIconLogin.setIcon(null);
            pMenu.setVisible(true);
            lblNomeUsuario.setText(txtLogin.getText());
        }
        else if(txtLogin.getText().equals("Dani") && txtSenha.getText().equals("123")) {
            pLogin.setVisible(false);
            lblIconLogin.setIcon(null);
            pMenu.setVisible(true);
            lblNomeUsuario.setText(txtLogin.getText());
        }
        else if(txtLogin.getText().equals("Thayza") && txtSenha.getText().equals("123")) {
            pLogin.setVisible(false);
            lblIconLogin.setIcon(null);
            pMenu.setVisible(true);
            lblNomeUsuario.setText(txtLogin.getText());
        }
    }//GEN-LAST:event_btnEntrarLoginActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            btnEntrarLogin.doClick();
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnGerar2ViaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerar2ViaMousePressed
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        
        //gera segunda via é o mesmo método pra gerar o check-in
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("2via.pdf"));
            document.open();
            TabelaVendas a = new TabelaVendas();
            Font f = new Font(FontFamily.COURIER, 20, Font.ITALIC);
            document.add(new Paragraph("Segunda via de Check-in", f));
            for (int i = 0; i < 6; i++) {
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(i) )));
                document.add(new Paragraph(" "));
            }
            document.add(new Paragraph(" "));
            PdfContentByte cb = writer.getDirectContent();
            BarcodeEAN codeEAN = new BarcodeEAN();
            document.add(new Paragraph(" "));
            codeEAN.setCodeType(codeEAN.EAN13);
            codeEAN.setCode("9070802124510"); // fazer random para cada pessoa
            Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
            document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
            
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro: " + ex.toString());
        } finally {
            document.close();
        }
        
        //abre o pdf gerado
        try {
            Desktop.getDesktop().open(new File("2via.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
        }
    }//GEN-LAST:event_btnGerar2ViaMousePressed

    private void btnverVendasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverVendasMousePressed

        Document vendas = new Document();
        try {
            PdfWriter.getInstance(vendas, new FileOutputStream("Vendas.pdf"));
            vendas.open();
            vendas.add(new Paragraph("Quantas vendas foram feitas no dia .. / .. / .... "));
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro: " + ex.toString());
        } finally {
            vendas.close();
        }
        
        try {
            Desktop.getDesktop().open(new File("Vendas.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
        }
    }//GEN-LAST:event_btnverVendasMousePressed

    private void btnSaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaiMousePressed
        pLogin.setVisible(true);
        lblIconLogin.setIcon(new ImageIcon("Icons/Usuario100.png"));
        pMenu.setVisible(false);
        txtLogin.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btnSaiMousePressed
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        System.out.println(jFormattedData.getText());
        int i=0,j=0;
        Voos p  = new Voos();
        TabelaHorarios tab= new TabelaHorarios();
        jTable1.setModel(tab);
        boolean naoexiste = true;
        
        for (int k = 0; k < agendaVoos.size(); k++) {//Confere se tem um Voo para o mesmo destino
            if((txtOrigem.getText().equals(agendaVoos.get(k).getOrigem()))&&(txtDestino.getText().equals(agendaVoos.get(k).getDestino()))){
                tab.addRow(agendaVoos.get(k));
                naoexiste=false;
            }
            
        }
        
        if(naoexiste){//Se nao existir um Voo para o mesmo Destino entao ele Cria
            if(txtOrigem.getText().isEmpty() || txtDestino.getText().isEmpty()){//Se oigem e destino tiver vazio
                ;
            }
            else{

                for(;i<agendaVoo.size();i++){
                    if((txtOrigem.getText().equals(agendaVoo.get(i).getOrigem()))&&(txtDestino.getText().equals(agendaVoo.get(i).getDestino()))){
                        int a=(int)Math.floor(Math.random()*22);
                        p.setDestino(agendaVoo.get(i).getDestino());
                        p.setOrigem(agendaVoo.get(i).getOrigem());
                        p.setIdvoo(agendaVoos.size());
                        p.setData(jFormattedData.getText());
                        p.setData(jFormattedData.getText());
                        p.setHorarioSaida(a+":00");
                        p.setHorarioChegada((a+2)+":00");
                        tab.addRow(p);
                        agendaVoos.add(p);
                        j=i;
                    }
                    else{
                        //Se não existir passagem, sumir com a tabela
                        //Botar mensagem na tela que n exite passagem      
                    }
                }
            for(int k=0;k<6;k++){  
                Voos p1= new Voos();
                int a=(int)Math.floor(Math.random()*22);
                p1.setDestino(agendaVoo.get(j).getDestino());
                p1.setOrigem(agendaVoo.get(j).getOrigem());
                p1.setData(jFormattedData.getText());
                p1.setIdvoo(agendaVoos.size());
                p1.setHorarioSaida(a+":00");
                p1.setHorarioChegada((a+2)+":00");
                tab.addRow(p1);
                agendaVoos.add(p1);

            }
             /*
                  */


             for(int b=0;b<agendaVoos.size();b++){
                if(agendaVoos.get(b).getOrigem().equals("São Paulo")||agendaVoos.get(b).getDestino().equals("São Paulo")){
                    if(agendaVoos.get(b).getOrigem().equals("Rio de Janeiro")||agendaVoos.get(b).getDestino().equals("Rio de Janeiro")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+239);
                        if(agendaVoos.get(b).getDestino().equals("Rio de Janeiro")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+312);
                        if(agendaVoos.get(b).getDestino().equals("Vitória")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Porto Alegre")||agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+365);
                        if(agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Brasília")||agendaVoos.get(b).getDestino().equals("Brasília")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+408);
                        if(agendaVoos.get(b).getDestino().equals("Brasília")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Manaus")||agendaVoos.get(b).getDestino().equals("Manaus")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1560);
                        if(agendaVoos.get(b).getDestino().equals("Manaus")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+795);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Belo Horizonte")||agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+320);
                        if(agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+429);
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Brasília")||agendaVoos.get(b).getDestino().equals("Brasíia")){
                    if(agendaVoos.get(b).getOrigem().equals("Rio de Janeiro")||agendaVoos.get(b).getDestino().equals("Rio de Janeiro")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+336);
                        if(agendaVoos.get(b).getDestino().equals("Rio de Janeiro")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+818);
                        if(agendaVoos.get(b).getDestino().equals("Vitória")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Porto Alegre")||agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+896);
                        if(agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Manaus")||agendaVoos.get(b).getDestino().equals("Manaus")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+987);
                        if(agendaVoos.get(b).getDestino().equals("Manaus")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1131);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Belo Horizonte")||agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+340);
                        if(agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+825);
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Rio de Janeiro")||agendaVoos.get(b).getDestino().equals("Rio de Janeiro")){
                    if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+289);
                        if(agendaVoos.get(b).getDestino().equals("Vitória")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Porto Alegre")||agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+558);
                        if(agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Manaus")||agendaVoos.get(b).getDestino().equals("Manaus")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1152);
                        if(agendaVoos.get(b).getDestino().equals("Manaus")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+696);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Belo Horizonte")||agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+226);
                        if(agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1037 );
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Manaus")||agendaVoos.get(b).getDestino().equals("Manaus")){
                    if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1230);
                        if(agendaVoos.get(b).getDestino().equals("Vitória")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Porto Alegre")||agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1169);
                        if(agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+884);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Belo Horizonte")||agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1184);
                        if(agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1214);
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Rio de Janeiro")||agendaVoos.get(b).getDestino().equals("Rio de Janeiro")){
                    if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+289);
                        if(agendaVoos.get(b).getDestino().equals("Vitória")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Porto Alegre")||agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+558);
                        if(agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Manaus")||agendaVoos.get(b).getDestino().equals("Manaus")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1152);
                        if(agendaVoos.get(b).getDestino().equals("Manaus")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+696);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Belo Horizonte")||agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+226);
                        if(agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1037);
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Porto Alegre")||agendaVoos.get(b).getDestino().equals("Porto Alegre")){
                    if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+558);
                        if(agendaVoos.get(b).getDestino().equals("Vitória")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1035);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Belo Horizonte")||agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+365);
                        if(agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1026);
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Belo Horizonte")||agendaVoos.get(b).getDestino().equals("Belo Horizonte")){
                    if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+312);
                        if(agendaVoos.get(b).getDestino().equals("Vitória")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+795);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+429);
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Vitória")||agendaVoos.get(b).getDestino().equals("Vitória")){
                    if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+696);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+1037);
                        if(agendaVoos.get(b).getDestino().equals("Natal")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }else if(agendaVoos.get(b).getOrigem().equals("Natal")||agendaVoos.get(b).getDestino().equals("Natal")){
                    if(agendaVoos.get(b).getOrigem().equals("Fortaleza")||agendaVoos.get(b).getDestino().equals("Fortaleza")){
                        agendaVoos.get(b).setValor( ((int)Math.floor(Math.random()*100))+884);
                        if(agendaVoos.get(b).getDestino().equals("Fortaleza")){
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }else{
                            Random r= new Random();
                            //agendaVoos.get(b).setIdvoo(i);
                        }
                    } 
                }
            }
        }
    }
    disc.salvarVoos();
    pCompradePassagem.setVisible(true);
    pSelecaoPassagem.setVisible(false);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExit4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExit4MouseClicked

    private void btnverVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverVendasMouseEntered
        setColor(btnverVendas);
    }//GEN-LAST:event_btnverVendasMouseEntered

    private void btnSaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaiMouseEntered
        setColor(btnSai);
    }//GEN-LAST:event_btnSaiMouseEntered

    private void btnGerar2ViaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerar2ViaMouseEntered
        setColor(btnGerar2Via);
    }//GEN-LAST:event_btnGerar2ViaMouseEntered

    private void btnverVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverVendasMouseExited
        resetColor(btnverVendas);
    }//GEN-LAST:event_btnverVendasMouseExited

    private void btnSaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaiMouseExited
        resetColor(btnSai);
    }//GEN-LAST:event_btnSaiMouseExited

    private void btnGerar2ViaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerar2ViaMouseExited
        resetColor(btnGerar2Via);
    }//GEN-LAST:event_btnGerar2ViaMouseExited

    private void txtOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigemActionPerformed

    }//GEN-LAST:event_txtOrigemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pSelecaoPassagem.setVisible(true);
        pCompradePassagem.setVisible(false);
        txtIDVOOPASSAGEM.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setPoltronaVermelha(int x, int y){
        if(x==0 && y==0){
            A1.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==1){
            A2.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==2){
            A3.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFormattedData1.setText("");
        int i,j;
        for( i =0; i<7;i++){
            for( j =0; j<3;j++){
                            System.out.println("i:"+i+"  j:"+j);
                        if(agendaVoos.get(Integer.parseInt(txtIDVOOPASSAGEM.getText())).IsPoltronaOcupada(i, j))
                            setPoltronaVermelha(i, j);
                        
            }
        }
        
        pVPoltronas.setVisible(true);
        pSelecaoPoltrona.setVisible(true);
        pVPassagemBaleia.setVisible(false);
        pCompradePassagem.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void txtOrigem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigem1ActionPerformed

    private void btnComprarPoltronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPoltronaActionPerformed
        System.out.println("Voce Escolheu a poltrona "+poltx+polty);
        agendaVoos.get(Integer.parseInt(txtIDVOOPASSAGEM.getText())).setPoltronaOcupada(poltx, polty);
    }//GEN-LAST:event_btnComprarPoltronaActionPerformed

    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed

        resetAllbtn();
        A1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A1");
        poltx = 0;
        polty = 0;
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed

        resetAllbtn();
        A2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A2");
        poltx = 0;
        polty = 1;

    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed

        resetAllbtn();
        A3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A3");
        poltx = 0;
        polty = 2;

    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed

        resetAllbtn();
        A4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A4");
        poltx = 0;
        polty = 3;

    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        resetAllbtn();
        A5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A5");
        poltx = 0;
        polty = 4;

    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        resetAllbtn();
        A6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A6");
        poltx = 0;
        polty = 5;

    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        resetAllbtn();
        A7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A7");
        poltx = 0;
        polty = 6;

    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed

        resetAllbtn();
        A8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("A8");
        poltx = 0;
        polty = 7;

    }//GEN-LAST:event_A8ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        resetAllbtn();
        B1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B1");
        poltx = 1;
        polty = 0;
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        resetAllbtn();
        B2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B2");
        poltx = 1;
        polty = 1;
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        resetAllbtn();
        B3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B3");
        poltx = 1;
        polty = 2;
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        resetAllbtn();
        B4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B4");
        poltx = 1;
        polty = 3;
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        resetAllbtn();
        B5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B5");
        poltx = 1;
        polty = 4;
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        resetAllbtn();
        B6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B6");
        poltx = 1;
        polty = 5;
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        resetAllbtn();
        B7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B7");
        poltx = 1;
        polty = 6;
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        resetAllbtn();
        B8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("B8");
        poltx = 1;
        polty = 7;
    }//GEN-LAST:event_B8ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        resetAllbtn();
        C1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C1");
        poltx = 2;
        polty = 0;
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        resetAllbtn();
        C2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C2");
        poltx = 2;
        polty = 1;
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        resetAllbtn();
        C3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C3");
        poltx = 2;
        polty = 2;
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        resetAllbtn();
        C4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C4");
        poltx = 2;
        polty = 3;
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        resetAllbtn();
        C5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C5");
        poltx = 2;
        polty = 4;
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        resetAllbtn();
        C6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C6");
        poltx = 2;
        polty = 5;
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        resetAllbtn();
        C7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C7");
        poltx = 2;
        polty = 6;
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        resetAllbtn();
        C8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("C8");
        poltx = 2;
        polty = 7;
    }//GEN-LAST:event_C8ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        resetAllbtn();
        D1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D1");
        poltx = 3;
        polty = 0;
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        resetAllbtn();
        D2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D2");
        poltx = 3;
        polty = 1;
        
    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        resetAllbtn();
        D3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D3");
        poltx = 3;
        polty = 2;
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        resetAllbtn();
        D4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D4");
        poltx = 3;
        polty = 3;
    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        resetAllbtn();
        D5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D5");
        poltx = 3;
        polty = 4;
    }//GEN-LAST:event_D5ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        resetAllbtn();
        D6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D6");
        poltx = 3;
        polty = 5;
    }//GEN-LAST:event_D6ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        resetAllbtn();
        D7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D7");
        poltx = 3;
        polty = 6;
    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        resetAllbtn();
        D8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
        lblNumPoltrona.setText("D8");
        poltx = 3;
        polty = 7;
    }//GEN-LAST:event_D8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*
                
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                */
                new AppInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JLabel JIconConta;
    private javax.swing.JPanel PainelBoasVindas;
    private javax.swing.JPanel PainelCheckIn;
    private javax.swing.JPanel PainelConta;
    private javax.swing.JPanel PainelNovidades;
    private javax.swing.JPanel PainelRepresentante;
    private javax.swing.JPanel PainelTOTAL;
    private javax.swing.JPanel PainelTelas;
    private javax.swing.JPanel PainelVenderPassagem;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnComprarPoltrona;
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnExit1;
    private javax.swing.JPanel btnExit2;
    private javax.swing.JPanel btnExit3;
    private javax.swing.JPanel btnExit4;
    private javax.swing.JPanel btnExit5;
    private javax.swing.JPanel btnGerar2Via;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel btnSai;
    private javax.swing.JPanel btnverVendas;
    private javax.swing.JLabel iconeGerar;
    private javax.swing.JLabel iconeVendas;
    private javax.swing.JLabel iconesai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedData;
    private javax.swing.JFormattedTextField jFormattedData1;
    private javax.swing.JLabel jIconCheckIn;
    private javax.swing.JLabel jIconNovidades;
    private javax.swing.JLabel jIconRepresentante;
    private javax.swing.JLabel jIconVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSepData;
    private javax.swing.JSeparator jSepData1;
    private javax.swing.JSeparator jSepDestino;
    private javax.swing.JSeparator jSepDestino1;
    private javax.swing.JSeparator jSepDestino3;
    private javax.swing.JSeparator jSepIdDoVoo;
    private javax.swing.JSeparator jSepOrigem;
    private javax.swing.JSeparator jSepOrigem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jSubtitulo;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jlblCheckIn;
    private javax.swing.JLabel jlblConta;
    private javax.swing.JLabel jlblEquipeAzul;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblExit1;
    private javax.swing.JLabel jlblExit2;
    private javax.swing.JLabel jlblExit3;
    private javax.swing.JLabel jlblExit4;
    private javax.swing.JLabel jlblExit5;
    private javax.swing.JLabel jlblNovidades;
    private javax.swing.JLabel jlblRepresentante;
    private javax.swing.JLabel jlblVender;
    private javax.swing.JLabel lblArthur;
    private javax.swing.JLabel lblBemvindo;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDanielli;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblDestino1;
    private javax.swing.JLabel lblIconLogin;
    private javax.swing.JLabel lblIdDoVoo;
    private javax.swing.JLabel lblImagemLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNovidades;
    private javax.swing.JLabel lblNumPoltrona;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblPoltA;
    private javax.swing.JLabel lblPoltB;
    private javax.swing.JLabel lblPoltC;
    private javax.swing.JLabel lblPoltD;
    private javax.swing.JLabel lblPoltrona;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblThayza;
    private javax.swing.JLabel nomeGerar;
    private javax.swing.JLabel nomesai;
    private javax.swing.JLabel nomevendas;
    private javax.swing.JPanel pCheckIn;
    private javax.swing.JPanel pCheckInDir;
    private javax.swing.JPanel pCheckInEsq;
    private javax.swing.JPanel pCompradePassagem;
    private javax.swing.JPanel pConta;
    private javax.swing.JPanel pContaDir;
    private javax.swing.JPanel pContaEsq;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pNovidade;
    private javax.swing.JPanel pNovidadesDir;
    private javax.swing.JPanel pNovidadesEsq;
    private javax.swing.JPanel pRepresentante;
    private javax.swing.JPanel pSelecaoPassagem;
    private javax.swing.JPanel pSelecaoPoltrona;
    private javax.swing.JPanel pVPassagemBaleia;
    private javax.swing.JPanel pVPoltronas;
    private javax.swing.JPanel pVender;
    private javax.swing.JPanel pVenderPassagemDir;
    private javax.swing.JPanel pVenderPassagemEsq;
    private javax.swing.JPanel painelCheckIn;
    private javax.swing.JPanel painelConta;
    private javax.swing.JPanel painelNovidades;
    private javax.swing.JPanel painelVenderPassagem;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIDVOOPASSAGEM;
    private javax.swing.JTextField txtIDVoo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtOrigem;
    private javax.swing.JTextField txtOrigem1;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 77, 128));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(SidePanel.getBackground());
    }
        private void resetAllbtn(){
        jButton1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        jButton2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A7.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        A8.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B7.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        B8.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C7.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        C8.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        D1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        D2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        D3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        D4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        D5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        D6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
    }
    
}
