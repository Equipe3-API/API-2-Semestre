package projeto.GUI.menu;

import projeto.GUI.mensagem.ConsultarMensagem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import projeto.GUI.mensagem.CadastrarMensagem;
import projeto.GUI.projetos.CadastrarProjeto;
import projeto.GUI.projetos.ProjetosCadastrados;
import projeto.GUI.usuario.TelaCadastrarUsuario;
import projeto.GUI.usuario.TelaCadastrarUsuarioAdmin;
import projeto.GUI.usuario.TelaUsuariosCadastrados;
import projeto.Main;
import projeto.model.tipos.FuncaoUsuario;

public class MenuPrincipalSuporte extends javax.swing.JFrame {

    public MenuPrincipalSuporte() {
        initComponents();
        setTitle("Pro4Tech");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e){
            Main.getConnectionFactory().closeConnection();
            System.exit(0);
        }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuMensagens = new javax.swing.JMenu();
        botaoAdicionarMensagem = new javax.swing.JMenuItem();
        botaoConsultarMensagens = new javax.swing.JMenuItem();
        menuGerenciar = new javax.swing.JMenu();
        botaoAdicionarProjeto = new javax.swing.JMenuItem();
        botaoConsultarProjetos = new javax.swing.JMenuItem();
        botaoCadastrarUsuario = new javax.swing.JMenuItem();
        botaoConsultarUsuarios = new javax.swing.JMenuItem();
        menuPerfil = new javax.swing.JMenu();
        menuSobre1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/pro4tech.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(204, 204, 204));

        menuMensagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/email_attach.png"))); // NOI18N
        menuMensagens.setText("Mensagens");
        menuMensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMensagensActionPerformed(evt);
            }
        });

        botaoAdicionarMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/+.png"))); // NOI18N
        botaoAdicionarMensagem.setText("Adicionar");
        botaoAdicionarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarMensagemActionPerformed(evt);
            }
        });
        menuMensagens.add(botaoAdicionarMensagem);

        botaoConsultarMensagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/Lupa.png"))); // NOI18N
        botaoConsultarMensagens.setText("Consultar");
        botaoConsultarMensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarMensagensActionPerformed(evt);
            }
        });
        menuMensagens.add(botaoConsultarMensagens);

        menuBar.add(menuMensagens);

        menuGerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/Engrenagem.png"))); // NOI18N
        menuGerenciar.setText("Gerenciar");
        menuGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarActionPerformed(evt);
            }
        });

        botaoAdicionarProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/+.png"))); // NOI18N
        botaoAdicionarProjeto.setText("Adicionar Projeto");
        botaoAdicionarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarProjetoActionPerformed(evt);
            }
        });
        menuGerenciar.add(botaoAdicionarProjeto);

        botaoConsultarProjetos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/Lupa.png"))); // NOI18N
        botaoConsultarProjetos.setText("Projetos Cadastrados");
        botaoConsultarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarProjetosActionPerformed(evt);
            }
        });
        menuGerenciar.add(botaoConsultarProjetos);

        botaoCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/+.png"))); // NOI18N
        botaoCadastrarUsuario.setText("Cadastrar Usuários");
        botaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarUsuarioActionPerformed(evt);
            }
        });
        menuGerenciar.add(botaoCadastrarUsuario);

        botaoConsultarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/Lupa.png"))); // NOI18N
        botaoConsultarUsuarios.setText("Usuários Cadastrados");
        botaoConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarUsuariosActionPerformed(evt);
            }
        });
        menuGerenciar.add(botaoConsultarUsuarios);

        menuBar.add(menuGerenciar);

        menuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/User.png"))); // NOI18N
        menuPerfil.setText("Perfil");
        menuPerfil.setToolTipText("");
        menuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPerfilMouseClicked(evt);
            }
        });
        menuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerfilActionPerformed(evt);
            }
        });
        menuBar.add(menuPerfil);

        menuSobre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/exclamation.png"))); // NOI18N
        menuSobre1.setText("Sobre");
        menuSobre1.setIconTextGap(2);
        menuSobre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobre1ActionPerformed(evt);
            }
        });
        menuBar.add(menuSobre1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarMensagemActionPerformed
        new CadastrarMensagem().setVisible(true); 
    }//GEN-LAST:event_botaoAdicionarMensagemActionPerformed

    private void menuMensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMensagensActionPerformed

    }//GEN-LAST:event_menuMensagensActionPerformed

    private void botaoConsultarMensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarMensagensActionPerformed
        new ConsultarMensagem().setVisible(true);
    }//GEN-LAST:event_botaoConsultarMensagensActionPerformed

    private void menuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerfilActionPerformed
        //new ExibirPerfil().setVisible(true);   
    }//GEN-LAST:event_menuPerfilActionPerformed

    private void menuGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarActionPerformed

    }//GEN-LAST:event_menuGerenciarActionPerformed

    private void botaoAdicionarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarProjetoActionPerformed
        new CadastrarProjeto().setVisible(true);
    }//GEN-LAST:event_botaoAdicionarProjetoActionPerformed

    private void botaoConsultarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarProjetosActionPerformed
        new ProjetosCadastrados().setVisible(true);
    }//GEN-LAST:event_botaoConsultarProjetosActionPerformed

    private void botaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarUsuarioActionPerformed
        if(Main.getManager().getUsuarioLogado().getFuncaoUsuario() == FuncaoUsuario.SUPORTE.getId()) new TelaCadastrarUsuario().setVisible(true);
        else new TelaCadastrarUsuarioAdmin().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarUsuarioActionPerformed

    private void botaoConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarUsuariosActionPerformed
        new TelaUsuariosCadastrados().setVisible(true);
    }//GEN-LAST:event_botaoConsultarUsuariosActionPerformed

    private void menuSobre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSobre1ActionPerformed

    private void menuPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPerfilMouseClicked
        //new ExibirPerfil().setVisible(true);
    }//GEN-LAST:event_menuPerfilMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botaoAdicionarMensagem;
    private javax.swing.JMenuItem botaoAdicionarProjeto;
    private javax.swing.JMenuItem botaoCadastrarUsuario;
    private javax.swing.JMenuItem botaoConsultarMensagens;
    private javax.swing.JMenuItem botaoConsultarProjetos;
    private javax.swing.JMenuItem botaoConsultarUsuarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuGerenciar;
    private javax.swing.JMenu menuMensagens;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuSobre1;
    // End of variables declaration//GEN-END:variables
}
