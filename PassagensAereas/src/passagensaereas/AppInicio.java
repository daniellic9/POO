package passagensaereas;

import Data.Data;
import Disco.Disco;
import static Disco.Disco.agendaPassagem;
import static Disco.Disco.agendaVoos;
import static Disco.Disco.agendaVoo;
import static Disco.Disco.agenda;
import com.itextpdf.text.Chunk;
import java.awt.Color;
import java.awt.event.KeyEvent;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;


/**
 *
 * @author arthur
 */
public class AppInicio extends javax.swing.JFrame {
    
    Disco disc = new Disco();
    int poltx,polty;
    boolean logado;
    Administradores adm;
    public AppInicio() throws InterruptedException {
     

      /* 
     
    agendaVoo.add(new Voos("São Paulo", "Rio de Janeiro"));
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
        Som.music();
        logado = false;
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
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
        A9 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        A11 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        A13 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        A15 = new javax.swing.JButton();
        A16 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        C11 = new javax.swing.JButton();
        C12 = new javax.swing.JButton();
        C13 = new javax.swing.JButton();
        C14 = new javax.swing.JButton();
        C15 = new javax.swing.JButton();
        C16 = new javax.swing.JButton();
        D9 = new javax.swing.JButton();
        D10 = new javax.swing.JButton();
        D11 = new javax.swing.JButton();
        D12 = new javax.swing.JButton();
        D13 = new javax.swing.JButton();
        D14 = new javax.swing.JButton();
        D15 = new javax.swing.JButton();
        D16 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
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
        btnSairComprarPassagem = new javax.swing.JButton();
        btnComprarPassagem = new javax.swing.JButton();
        pSelecaoPoltrona = new javax.swing.JPanel();
        txtSelecaoPoltronaNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jSepOrigem1 = new javax.swing.JSeparator();
        btnComprarPoltrona = new javax.swing.JButton();
        lblNumPoltrona = new javax.swing.JLabel();
        jSepData1 = new javax.swing.JSeparator();
        lblCPF = new javax.swing.JLabel();
        jSepDestino3 = new javax.swing.JSeparator();
        txtSelecaoPoltronaCPF = new javax.swing.JFormattedTextField();
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
        pVPoltronas.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 52, -1));

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 52, -1));

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 52, -1));

        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 52, -1));

        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 52, -1));

        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 52, -1));

        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 52, -1));

        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 52, -1));

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 52, -1));

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 52, -1));

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 52, -1));

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 52, -1));

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 52, -1));

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 52, -1));

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 52, -1));

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 52, -1));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 52, -1));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 52, -1));

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 52, -1));

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 52, -1));

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 52, -1));

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 52, -1));

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 52, -1));

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 52, -1));

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 52, -1));

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 52, -1));

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 52, -1));

        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 52, -1));

        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 52, -1));

        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 52, -1));

        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 52, -1));

        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 52, -1));

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

        A9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 52, -1));

        A10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 52, -1));

        A11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 52, -1));

        A12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, 52, -1));

        A13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 770, 52, -1));

        A14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A14ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 830, 52, -1));

        A15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A15ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 890, 52, -1));

        A16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        A16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A16ActionPerformed(evt);
            }
        });
        pVPoltronas.add(A16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 950, 52, -1));

        B9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 52, -1));

        B10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 52, -1));

        B11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, 52, -1));

        B12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 52, -1));

        B13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 770, 52, -1));

        B14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 830, 52, -1));

        B15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 890, 52, -1));

        B16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });
        pVPoltronas.add(B16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 950, 52, -1));

        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 52, -1));

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 52, -1));

        C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, 52, -1));

        C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, 52, -1));

        C13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 770, 52, -1));

        C14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 830, 52, -1));

        C15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C15ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 890, 52, -1));

        C16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C16ActionPerformed(evt);
            }
        });
        pVPoltronas.add(C16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 950, 52, -1));

        D9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 52, -1));

        D10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D10ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 52, -1));

        D11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D11ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 52, -1));

        D12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D12ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 710, 52, -1));

        D13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D13ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 770, 52, -1));

        D14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D14ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 830, 52, -1));

        D15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D15ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 890, 52, -1));

        D16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_ICons/PoltronaVerdeG.png"))); // NOI18N
        D16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D16ActionPerformed(evt);
            }
        });
        pVPoltronas.add(D16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 950, 52, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("9");
        pVPoltronas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 40, 49));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("10");
        pVPoltronas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 40, 49));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("12");
        pVPoltronas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 40, 49));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("11");
        pVPoltronas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 40, 49));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("13");
        pVPoltronas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, 40, 49));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("14");
        pVPoltronas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 890, 40, 49));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("12");
        pVPoltronas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 40, 49));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("15");
        pVPoltronas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 940, 40, 50));

        jScrollPane2.setViewportView(pVPoltronas);

        pVenderPassagemEsq.add(jScrollPane2, "card4");

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

        btnSairComprarPassagem.setText("Sair");
        btnSairComprarPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairComprarPassagemActionPerformed(evt);
            }
        });
        pCompradePassagem.add(btnSairComprarPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 90, -1));

        btnComprarPassagem.setText("Comprar");
        btnComprarPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPassagemActionPerformed(evt);
            }
        });
        pCompradePassagem.add(btnComprarPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 90, -1));

        pVenderPassagemDir.add(pCompradePassagem, "card3");

        pSelecaoPoltrona.setBackground(new java.awt.Color(27, 62, 111));
        pSelecaoPoltrona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSelecaoPoltronaNome.setBackground(new java.awt.Color(27, 62, 111));
        txtSelecaoPoltronaNome.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSelecaoPoltronaNome.setForeground(new java.awt.Color(254, 254, 254));
        txtSelecaoPoltronaNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSelecaoPoltronaNome.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        txtSelecaoPoltronaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelecaoPoltronaNomeActionPerformed(evt);
            }
        });
        pSelecaoPoltrona.add(txtSelecaoPoltronaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 30));

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

        txtSelecaoPoltronaCPF.setBackground(new java.awt.Color(27, 62, 111));
        txtSelecaoPoltronaCPF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSelecaoPoltronaCPF.setForeground(new java.awt.Color(254, 254, 254));
        try {
            txtSelecaoPoltronaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSelecaoPoltronaCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pSelecaoPoltrona.add(txtSelecaoPoltronaCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 30));

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
        if(logado){

            setColor(pVender);
            resetColor(pConta);
            resetColor(pCheckIn);
            resetColor(pNovidade);
            resetColor(pRepresentante);

            PainelTelas.removeAll();
            PainelTelas.repaint();
            PainelTelas.revalidate();


            PainelTelas.add(PainelVenderPassagem);
            PainelTelas.repaint();
            PainelTelas.revalidate();
        }else{
            Som.erro();
            setUnavaible(pVender);
            resetColor(pConta);
            resetColor(pCheckIn);
            resetColor(pNovidade);
            resetColor(pRepresentante);
        }
    }//GEN-LAST:event_pVenderMousePressed

    private void pNovidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNovidadeMousePressed
        if(logado){

            setColor(pNovidade);
            resetColor(pConta);
            resetColor(pVender);
            resetColor(pCheckIn);
            resetColor(pRepresentante);


            PainelTelas.removeAll();
            PainelTelas.repaint();
            PainelTelas.revalidate();


            PainelTelas.add(PainelNovidades);
            PainelTelas.repaint();
            PainelTelas.revalidate();
        }else{
            Som.erro();
            setUnavaible(pNovidade);
            resetColor(pConta);
            resetColor(pVender);
            resetColor(pCheckIn);
            resetColor(pRepresentante);
        }
    }//GEN-LAST:event_pNovidadeMousePressed

    private void pCheckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCheckInMousePressed
        if(logado){

            setColor(pCheckIn);
            resetColor(pConta);
            resetColor(pVender);
            resetColor(pNovidade);
            resetColor(pRepresentante);

            PainelTelas.removeAll();
            PainelTelas.repaint();
            PainelTelas.revalidate();

            PainelTelas.add(PainelCheckIn);
            PainelTelas.repaint();
            PainelTelas.revalidate();
        }else{
            Som.erro();
            setUnavaible(pCheckIn);
            resetColor(pConta);
            resetColor(pVender);
            resetColor(pNovidade);
            resetColor(pRepresentante);
            
        }
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
        
        for (int i = 0; i <agenda.size(); i++) {
            
            if(agenda.get(i).testaSenha(txtLogin.getText(),txtSenha.getText())){
                pLogin.setVisible(false);
                lblIconLogin.setIcon(null);
                pMenu.setVisible(true);
                lblNomeUsuario.setText(txtLogin.getText());
            }
            
        }
        logado = true;
        
        txtLogin.setText("");
        txtSenha.setText("");

    }//GEN-LAST:event_btnEntrarLoginActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            btnEntrarLogin.doClick();
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnGerar2ViaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerar2ViaMousePressed
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        
        //gera segunda via é o mesmo método pra gerar o check-in
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("2via.pdf")); //muda aqui o nome de cada coisa
            document.open();
            Image logo;
            try {
                logo = Image.getInstance("whale-filled300.png");
                document.add(logo);
                logo.setAlignment(0);
            } catch (IOException ex) {
                Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            TabelaVendas a = new TabelaVendas();
            Font f = new Font(FontFamily.COURIER, 20, Font.ITALIC);
            Paragraph p = new Paragraph();
            document.add(new Paragraph("Passagem", f));
            p.setAlignment(50);
            
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
            String codigo = Integer.toString((int)Math.floor(Math.random()*1000000000));
            codeEAN.setCode(codigo); // fazer random para cada pessoa
            Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
            document.add(new Phrase(new Chunk(imageEAN, 50, 50)));
            
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

        int i;
        Document vendas = new Document();
        try {
            PdfWriter.getInstance(vendas, new FileOutputStream("Vendas.pdf"));
            vendas.open();
            Image logo;
            try {
                logo = Image.getInstance("whale-filled300.png");
                vendas.add(logo);
                logo.setAlignment(0);
            } catch (IOException ex) {
                Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            vendas.add(new Paragraph("idVoo"+"   Nome"+"   Horário"+"   Origem"+"   Destino"+"   Valor"));
            for(i=0;i<agendaPassagem.size();i++)
                vendas.add(new Paragraph(agendaPassagem.get(i).getIdvoo()+"   "+agendaPassagem.get(i).passageiro.getNomePessoa()+"   "+agendaPassagem.get(i).getHorarioSaida()+"-"+agendaPassagem.get(i).getHorarioChegada()+"   "+agendaPassagem.get(i).getOrigem()+"   "+agendaPassagem.get(i).getDestino()+"   "+agendaPassagem.get(i).getValor()));
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
        logado=false;
    }//GEN-LAST:event_btnSaiMousePressed

        public static boolean validarData(String dateString){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                sdf.parse(dateString);
                return true;
            } catch (ParseException ex) {
                return false;
            }
        }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Data data = new Data(jFormattedData.getText());
    if( !validarData(jFormattedData.getText()) 
       || (new DateTime().isAfter(data.getData().minusDays(2)))){
            jFormattedData.setText("");
            
            
    }
    if( new DateTime().isAfter(data.getData().minusYears(1)) ){
        System.out.println("Entrou aqui");
            jFormattedData.setText("");
        
    }
    else {
        System.out.println("Entra aqui");
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
                     lblData.setForeground(Color.white);

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
                                p.data = new Data(jFormattedData.getText());
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
                        p1.data = new Data(jFormattedData.getText());
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
    }
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

    private void btnSairComprarPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairComprarPassagemActionPerformed
        pSelecaoPassagem.setVisible(true);
        pCompradePassagem.setVisible(false);
        txtIDVOOPASSAGEM.setText("");
    }//GEN-LAST:event_btnSairComprarPassagemActionPerformed

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
        else if(x==0 && y==3){
            A4.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==4){
            A5.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==5){
            A6.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==6){
            A7.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==7){
            A8.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==8){
            A9.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==9){
            A10.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==10){
            A11.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==11){
            A12.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==12){
            A13.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==13){
            A14.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==14){
            A15.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==0 && y==15){
            A16.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==0){
            B1.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==1){
            B2.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==2){
            B3.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==3){
            B4.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==4){
            B5.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==5){
            B6.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==6){
            B7.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==7){
            B8.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==8){
            B9.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==9){
            B10.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==10){
            B11.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==11){
            B12.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==12){
            B13.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==13){
            B14.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==14){
            B15.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==1 && y==15){
            B16.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==0){
            C1.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==1){
            C2.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==2){
            C3.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==3){
            C4.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==4){
            C5.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==5){
            C6.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==6){
            C7.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==7){
            C8.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==8){
            C9.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==9){
            C10.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==10){
            C11.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==11){
            C12.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==12){
            C13.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==13){
            C14.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==14){
            C15.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==2 && y==15){
            C16.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==0){
            D1.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==1){
            D2.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==2){
            D3.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==3){
            D4.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==4){
            D5.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==5){
            D6.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==6){
            D7.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==7){
            D8.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==8){
            D9.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==9){
            D10.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==10){
            D11.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==11){
            D12.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==12){
            D13.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==13){
            D14.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==14){
            D15.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        else if(x==3 && y==15){
            D16.setIcon(new ImageIcon(("PoltronaVermelhaG.png")));
        }
        
        
    }
    
    private void btnComprarPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPassagemActionPerformed
        if(!txtIDVOOPASSAGEM.getText().isEmpty()){
            
        int i,j;
        for( i = 0; i<16;i++){
            for( j = 0; j<4;j++){
                System.out.println("i:"+i+"  j:"+j);
                if(agendaVoos.get(Integer.parseInt(txtIDVOOPASSAGEM.getText())).IsPoltronaOcupada(i, j)){
                System.out.println(agendaVoos.get(Integer.parseInt(txtIDVOOPASSAGEM.getText())).IsPoltronaOcupada(i, j));
                setPoltronaVermelha(j, i);
                }
                        
            }
        }
        //disc.salvarPassagem(); //#########################################################################
        
        //txtIDVOOPASSAGEM.setText("");
        //txtSelecaoPoltronaCPF.setText("");
        //txtSelecaoPoltronaNome.setText("");
        pVPoltronas.setVisible(true);
        pSelecaoPoltrona.setVisible(true);
        pVPassagemBaleia.setVisible(false);
        jScrollPane2.setVisible(true);
        pCompradePassagem.setVisible(false);
        
        }
    }//GEN-LAST:event_btnComprarPassagemActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
       int num = Integer.parseInt(txtIDVoo.getText()) - 1;
        if( num <= agendaPassagem.size()){
           try {
               agendaPassagem.get(num).getPdf();
           } catch (DocumentException ex) {
               Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void txtSelecaoPoltronaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelecaoPoltronaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelecaoPoltronaNomeActionPerformed


    private void btnComprarPoltronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPoltronaActionPerformed
        System.out.println("Voce Escolheu a poltrona "+poltx+polty);
        agendaVoos.get(Integer.parseInt(txtIDVOOPASSAGEM.getText())).setPoltronaOcupada(polty, poltx);
        pVPoltronas.setVisible(false);
        pVPassagemBaleia.setVisible(true);
        pCompradePassagem.setVisible(true);
        pSelecaoPoltrona.setVisible(false);
        agendaPassagem.add(new Passagem(agendaPassagem.size(), agendaVoos.get(Integer.parseInt(txtIDVOOPASSAGEM.getText())), txtSelecaoPoltronaNome.getText(),txtSelecaoPoltronaCPF.getText()));
        String codigo;
        
        //new SocketCliente().run();
        //GERAR O PDF AQUI
        
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        
        //gera segunda via é o mesmo método pra gerar o check-in
        
        
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(agendaPassagem.size() + "passagem.pdf")); //muda aqui o nome de cada coisa
            document.open();
            Image logo;
            try {
                logo = Image.getInstance("whale-filled300.png");
                document.add(logo);
                logo.setAlignment(0);
            } catch (IOException ex) {
                Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            TabelaVendas a = new TabelaVendas();
            Font f = new Font(FontFamily.COURIER, 20, Font.ITALIC);
            Paragraph p = new Paragraph();
            document.add(new Paragraph("Passagem", f));
            p.setAlignment(50);
            
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(0).toString() + ":\t " + agendaPassagem.get(agendaPassagem.size()-1).getIdvoo() )));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( "idPassagem: \t " + agendaPassagem.size())));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(1).toString() + ":\t " + agendaPassagem.get(agendaPassagem.size()-1).passageiro.getNomePessoa() )));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(2).toString() + ":\t " + agendaPassagem.get(agendaPassagem.size()-1).getHorarioSaida())));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(3).toString() + ":\t " + agendaPassagem.get(agendaPassagem.size()-1).getOrigem())));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(4).toString() + ":\t " + agendaPassagem.get(agendaPassagem.size()-1).getDestino())));
                document.add(new Paragraph(" "));
                document.add(new Phrase(new Chunk( a.getColumnName(5).toString() + ":\t " + agendaPassagem.get(agendaPassagem.size()-1).getValor())));
                
            document.add(new Paragraph(" "));
            PdfContentByte cb = writer.getDirectContent();
            BarcodeEAN codeEAN = new BarcodeEAN();
            document.add(new Paragraph(" "));
            codeEAN.setCodeType(codeEAN.EAN13);
            codigo = Integer.toString((int)Math.floor(Math.random()*1000000000));
            //System.out.println("Um numero "+);
            
            //codeEAN.setCode("9070802124510"); // fazer random para cada pessoa Integer.toString((int)Math.floor(Math.random()*1000000000))
            codeEAN.setCode(codigo+"4510"); // fazer random para cada pessoa Integer.toString((int)Math.floor(Math.random()*1000000000))
            Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
            document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
            
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro: " + ex.toString());
        } finally {
            document.close();
        }
        
        //abre o pdf gerado
        try {
            Desktop.getDesktop().open(new File(agendaPassagem.size() +"passagem.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
        }
        Mandaarq novo=new Mandaarq();
        try {
            novo.mandapdf(agendaPassagem.size() + "passagem.pdf");
        } catch (Exception ex) {
            Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //txtIDVOOPASSAGEM.setText("");
        disc.salvarPassagem();
        txtSelecaoPoltronaCPF.setText("");
        txtSelecaoPoltronaNome.setText("");
    }//GEN-LAST:event_btnComprarPoltronaActionPerformed

    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed

        if(A1.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A1");
            poltx = 0;
            polty = 0;
        }
            
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed

        if(A2.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A2");
            poltx = 0;
            polty = 1;
        }
        
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed

        if(A3.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A3");
            poltx = 0;
            polty = 2;
        }

    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        if(A4.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A4");
            poltx = 0;
            polty = 3;
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        if(A5.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A5");
            poltx = 0;
            polty = 4;
        }
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        if(A6.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A6");
            poltx = 0;
            polty = 5;
        }
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        if(A7.getIcon().toString().contains("VerdeG.png")){  
            resetAllbtn();
            A7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A7");
            poltx = 0;
            polty = 6;
        }
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
    if(A8.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A8");
            poltx = 0;
            polty = 7;
    }
    }//GEN-LAST:event_A8ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if(B1.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B1");
            poltx = 1;
            polty = 0;
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(B2.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B2");
            poltx = 1;
            polty = 1;
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if(B3.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B3");
            poltx = 1;
            polty = 2;
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if(B4.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B4");
            poltx = 1;
            polty = 3;
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if(B5.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B5");
            poltx = 1;
            polty = 4;
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if(B6.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B6");
            poltx = 1;
            polty = 5;
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        if(B7.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B7");
            poltx = 1;
            polty = 6;
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if(B8.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B8");
            poltx = 1;
            polty = 7;
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        if(C1.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C1");
            poltx = 2;
            polty = 0;
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        if(C2.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C2");
            poltx = 2;
            polty = 1;
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        if(C3.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C3");
            poltx = 2;
            polty = 2;
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        if(C4.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C4");
            poltx = 2;
            polty = 3;
        }
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        if(C5.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C5");
            poltx = 2;
            polty = 4;
        }
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        if(C6.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C6");
            poltx = 2;
            polty = 5;
        }
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        if(C7.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C7");
            poltx = 2;
            polty = 6;
        }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        if(C8.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C8");
            poltx = 2;
            polty = 7;
        }
    }//GEN-LAST:event_C8ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        if(D1.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D1.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D1");
            poltx = 3;
            polty = 0;
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        if(D2.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D2.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D2");
            poltx = 3;
            polty = 1;
        }
        
    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        if(D3.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D3.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D3");
            poltx = 3;
            polty = 2;
        }
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        if(D4.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D4.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D4");
            poltx = 3;
            polty = 3;
        }
    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        if(D5.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D5.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D5");
            poltx = 3;
            polty = 4;
        }
    }//GEN-LAST:event_D5ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        if(D6.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D6.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D6");
            poltx = 3;
            polty = 5;
        }
    }//GEN-LAST:event_D6ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        if(D7.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D7.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D7");
            poltx = 3;
            polty = 6;
        }
    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        if(D8.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D8.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D8");
            poltx = 3;
            polty = 7;
        }
    }//GEN-LAST:event_D8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        if(A9.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A9.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A9");
            poltx = 0;
            polty = 8;
        }
    }//GEN-LAST:event_A9ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        if(A10.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A10.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A10");
            poltx = 0;
            polty = 9;
        }
    }//GEN-LAST:event_A10ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        if(A11.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A11.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A11");
            poltx = 0;
            polty = 10;
        }
    }//GEN-LAST:event_A11ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        if(A12.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A12.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A12");
            poltx = 0;
            polty = 11;
        }
    }//GEN-LAST:event_A12ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        if(A13.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A13.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A13");
            poltx = 0;
            polty = 12;
        }
    }//GEN-LAST:event_A13ActionPerformed

    private void A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A14ActionPerformed
        if(A14.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A14.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A14");
            poltx = 0;
            polty = 13;
        }
    }//GEN-LAST:event_A14ActionPerformed

    private void A15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A15ActionPerformed
        if(A15.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A15.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A15");
            poltx = 0;
            polty = 14;
        }
    }//GEN-LAST:event_A15ActionPerformed

    private void A16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A16ActionPerformed
        if(A16.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            A16.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("A16");
            poltx = 0;
            polty = 15;
        }

    }//GEN-LAST:event_A16ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
         if(B9.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B9.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B9");
            poltx = 1;
            polty = 8;
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
                 if(B10.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B10.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B10");
            poltx = 1;
            polty = 9;
        }
    }//GEN-LAST:event_B10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
                 if(B11.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B11.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B11");
            poltx = 1;
            polty = 10;
        }
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
                if(B12.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B12.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B12");
            poltx = 1;
            polty = 11;
        }
    }//GEN-LAST:event_B12ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
                if(B13.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B13.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B13");
            poltx = 1;
            polty = 12;
        }
    }//GEN-LAST:event_B13ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
                 if(B14.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B14.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B14");
            poltx = 1;
            polty = 13;
        }
    }//GEN-LAST:event_B14ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
                 if(B15.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B15.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B15");
            poltx = 1;
            polty = 14;
        }
    }//GEN-LAST:event_B15ActionPerformed

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B16ActionPerformed
                 if(B16.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            B16.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("B6");
            poltx = 1;
            polty = 15;
        }
    }//GEN-LAST:event_B16ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        if(C9.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C9.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C9");
            poltx = 2;
            polty = 8;
        }
    }//GEN-LAST:event_C9ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        if(C10.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C10.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C10");
            poltx = 2;
            polty = 9;
        }
    }//GEN-LAST:event_C10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        if(C11.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C11.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C11");
            poltx = 2;
            polty = 10;
        }
    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        if(C12.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C12.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C12");
            poltx = 2;
            polty = 11;
        }
    }//GEN-LAST:event_C12ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
        if(C13.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C13.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C13");
            poltx = 2;
            polty = 12;
        }
    }//GEN-LAST:event_C13ActionPerformed

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14ActionPerformed
        if(C14.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C14.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C14");
            poltx = 2;
            polty = 13;
        }
    }//GEN-LAST:event_C14ActionPerformed

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C15ActionPerformed
        if(C15.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C15.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C15");
            poltx = 2;
            polty = 14;
        }
    }//GEN-LAST:event_C15ActionPerformed

    private void C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C16ActionPerformed
       if(C16.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            C16.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("C16");
            poltx = 2;
            polty = 15;
        }
    }//GEN-LAST:event_C16ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
        if(D9.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D9.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D9");
            poltx = 3;
            polty = 8;
        }
    }//GEN-LAST:event_D9ActionPerformed

    private void D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D10ActionPerformed
        // TODO add your handling code here:
        if(D10.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D10.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D10");
            poltx = 3;
            polty = 9;
        }
    }//GEN-LAST:event_D10ActionPerformed

    private void D11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D11ActionPerformed
        // TODO add your handling code here:
        if(D11.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D11.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D11");
            poltx = 3;
            polty = 10;
        }
    }//GEN-LAST:event_D11ActionPerformed

    private void D12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D12ActionPerformed
        // TODO add your handling code here:
        if(D12.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D12.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D12");
            poltx = 3;
            polty = 11;
        }
    }//GEN-LAST:event_D12ActionPerformed

    private void D13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D13ActionPerformed
        // TODO add your handling code here:
        if(D13.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D13.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D13");
            poltx = 3;
            polty = 12;
        }
    }//GEN-LAST:event_D13ActionPerformed

    private void D14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D14ActionPerformed
        // TODO add your handling code here:
        if(D14.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D14.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D14");
            poltx = 3;
            polty = 13;
        }
    }//GEN-LAST:event_D14ActionPerformed

    private void D15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D15ActionPerformed
        if(D15.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D15.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D15");
            poltx = 3;
            polty = 14;
        }
    }//GEN-LAST:event_D15ActionPerformed

    private void D16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D16ActionPerformed
        if(D16.getIcon().toString().contains("VerdeG.png")){
            resetAllbtn();
            D16.setIcon(  new ImageIcon(("PoltronaAmarelaG.png")));
            lblNumPoltrona.setText("D16");
            poltx = 3;
            polty = 15;
        }

    }//GEN-LAST:event_D16ActionPerformed

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
                try {
                    /*
                    
                    try {
                    Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                    Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    */
                    new AppInicio().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AppInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A10;
    private javax.swing.JButton A11;
    private javax.swing.JButton A12;
    private javax.swing.JButton A13;
    private javax.swing.JButton A14;
    private javax.swing.JButton A15;
    private javax.swing.JButton A16;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C13;
    private javax.swing.JButton C14;
    private javax.swing.JButton C15;
    private javax.swing.JButton C16;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JButton D1;
    private javax.swing.JButton D10;
    private javax.swing.JButton D11;
    private javax.swing.JButton D12;
    private javax.swing.JButton D13;
    private javax.swing.JButton D14;
    private javax.swing.JButton D15;
    private javax.swing.JButton D16;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton D9;
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
    private javax.swing.JButton btnComprarPassagem;
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
    private javax.swing.JButton btnSairComprarPassagem;
    private javax.swing.JPanel btnverVendas;
    private javax.swing.JLabel iconeGerar;
    private javax.swing.JLabel iconeVendas;
    private javax.swing.JLabel iconesai;
    private javax.swing.JFormattedTextField jFormattedData;
    private javax.swing.JLabel jIconCheckIn;
    private javax.swing.JLabel jIconNovidades;
    private javax.swing.JLabel jIconRepresentante;
    private javax.swing.JLabel jIconVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JFormattedTextField txtSelecaoPoltronaCPF;
    private javax.swing.JTextField txtSelecaoPoltronaNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 77, 128));
    }
    private void setUnavaible(JPanel panel){
        panel.setBackground(new Color(117, 124, 130));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(SidePanel.getBackground());
    }
    private void resetAllbtn(){
        if(A1.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A2.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A3.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A4.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A5.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A6.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A7.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A7.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A8.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A8.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A9.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A9.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A10.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A10.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A11.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A11.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A12.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A12.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A13.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A13.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A14.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A14.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A15.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A15.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(A16.getIcon().toString().contains("PoltronaAmarelaG.png"))
            A16.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B1.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B2.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B3.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B4.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B5.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B6.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B7.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B7.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B8.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B8.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B9.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B9.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B10.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B10.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B11.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B11.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B12.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B12.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B13.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B13.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B14.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B14.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B15.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B15.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(B16.getIcon().toString().contains("PoltronaAmarelaG.png"))
            B16.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));        
        if(C1.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C2.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C3.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C4.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C5.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C6.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C7.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C7.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C8.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C8.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C9.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C9.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C10.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C10.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C11.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C11.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C12.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C12.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C13.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C13.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C14.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C14.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C15.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C15.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(C16.getIcon().toString().contains("PoltronaAmarelaG.png"))
            C16.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D1.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D1.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D2.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D2.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D3.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D3.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D4.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D4.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D5.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D5.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D6.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D6.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D7.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D7.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D8.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D8.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D9.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D9.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D10.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D10.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D11.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D11.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D12.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D12.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D13.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D13.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D14.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D14.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D15.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D15.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
        if(D16.getIcon().toString().contains("PoltronaAmarelaG.png"))
            D16.setIcon(  new ImageIcon(("PoltronaVerdeG.png")));
    }
    
}
