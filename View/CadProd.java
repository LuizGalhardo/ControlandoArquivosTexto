/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerArquivoTextoProduto;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Galhardo
 */
public class CadProd extends javax.swing.JFrame {
    
    private static CadProd cadProdUnico;
    int indice = 0;
    ControllerArquivoTextoProduto controler = new ControllerArquivoTextoProduto();
    Produto prodaux;
   

    /**
     * Creates new form CadProd
     */
    public CadProd() {
        initComponents();
    }
    
    
    // Inicio Singleton
    public static CadProd getCadProd(){
        if(cadProdUnico == null){
            cadProdUnico = new CadProd();
        }
        return cadProdUnico;
    }
    //Fiim Singleton

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        butLimpar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblPrecoAvista = new javax.swing.JLabel();
        lblQuant = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtPrecoAvista = new javax.swing.JTextField();
        txtQuant = new javax.swing.JTextField();
        lblPrecoAprazo = new javax.swing.JLabel();
        txtPrecoAprazo = new javax.swing.JTextField();
        butSair = new javax.swing.JButton();
        butAbrir = new javax.swing.JButton();
        butAlterar = new javax.swing.JButton();
        butProx = new javax.swing.JButton();
        butLimpar2 = new javax.swing.JButton();
        butSalvar = new javax.swing.JButton();
        butAnterior = new javax.swing.JButton();
        butExcluir = new javax.swing.JButton();
        lblCons = new javax.swing.JLabel();
        txtCons = new javax.swing.JTextField();
        butCons = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        butLimpar.setText("LIMPAR");
        butLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("CADASTRO PRODUTOS");

        lblDesc.setText("DESCRICAO");

        lblPrecoAvista.setText("PRECO A VISTA");

        lblQuant.setText("QUANTIDADE");

        lblPrecoAprazo.setText("PRECO A PRAZO");

        txtPrecoAprazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoAprazoActionPerformed(evt);
            }
        });

        butSair.setText("SAIR");
        butSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairActionPerformed(evt);
            }
        });

        butAbrir.setText("ABRIR");
        butAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrirActionPerformed(evt);
            }
        });

        butAlterar.setText("ALTERAR");
        butAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAlterarActionPerformed(evt);
            }
        });

        butProx.setText("PROXIMO");
        butProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butProxActionPerformed(evt);
            }
        });

        butLimpar2.setText("LIMPAR");
        butLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimpar2ActionPerformed(evt);
            }
        });

        butSalvar.setText("SALVAR");
        butSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarActionPerformed(evt);
            }
        });

        butAnterior.setText("ANTERIOR");
        butAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAnteriorActionPerformed(evt);
            }
        });

        butExcluir.setText("EXCLUIR");
        butExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluirActionPerformed(evt);
            }
        });

        lblCons.setText("PESQUISAR");

        txtCons.setText("Digite o produto");

        butCons.setText("CONSULTAR");
        butCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butAbrir)
                        .addGap(48, 48, 48)
                        .addComponent(butExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(butAlterar)
                        .addGap(40, 40, 40)
                        .addComponent(butSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPrecoAprazo)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecoAvista)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecoAvista)
                            .addComponent(txtPrecoAprazo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butLimpar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(butProx))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCons, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(butSair))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCons)
                    .addComponent(txtCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCons))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoAvista)
                    .addComponent(txtPrecoAvista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoAprazo)
                    .addComponent(txtPrecoAprazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuant)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butProx, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butLimpar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSalvar)
                    .addComponent(butAbrir)
                    .addComponent(butExcluir)
                    .addComponent(butAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecoAprazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoAprazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoAprazoActionPerformed

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
      limpaCampos();
    }//GEN-LAST:event_butLimparActionPerformed

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
        sair();
    }//GEN-LAST:event_butSairActionPerformed

    private void butAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrirActionPerformed
        controler.setArquivo("Abrir");
        controler.lerProduto();
        indice = 0;
        Navega(indice);
    }//GEN-LAST:event_butAbrirActionPerformed

    private void butAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlterarActionPerformed

        try {
            prodaux.setDesc(txtDesc.getText());
            prodaux.setQuantidade(txtQuant.getText());
            prodaux.setPavista(txtPrecoAvista.getText());
            prodaux.setPaprazo(txtPrecoAprazo.getText());
           

            controler.atualizaProduto(prodaux);

            JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO COM SUCESSO!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR O PRODUTO!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butAlterarActionPerformed

    private void butProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butProxActionPerformed
        Navega(++indice);
    }//GEN-LAST:event_butProxActionPerformed

    private void butLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimpar2ActionPerformed
       limpaCampos();
    }//GEN-LAST:event_butLimpar2ActionPerformed

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed
        controler.setArquivo("salvar");
        Produto prod = new Produto();
        prod.setDesc(txtDesc.getText());
        prod.setQuantidade(txtQuant.getText());
        prod.setPavista(txtPrecoAvista.getText());
        prod.setPaprazo(txtPrecoAprazo.getText());
        controler.getProdutos().add(prod);
        try {
            controler.escreverProd(true);
            JOptionPane.showMessageDialog(null, "ARQUIVO SALVO COM SUCESSO!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR O ARQUIVO!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_butSalvarActionPerformed

    private void butAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAnteriorActionPerformed
        Navega(--indice);
    }//GEN-LAST:event_butAnteriorActionPerformed

    private void butExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluirActionPerformed

        try {
            Produto prod = controler.getProdutos().get(indice);
            controler.removeElemento(prod);

            // Atualiza os índices dos próximos elementos
            for (int i = indice; i < controler.getProdutos().size(); i++) {
                controler.getProdutos().get(i);
            }

            controler.escreverProd(true);

            limpaCampos();
            JOptionPane.showMessageDialog(null, "PRODUTO EXCLUÍDO COM SUCESSO!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR O PRODUTO!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_butExcluirActionPerformed

    private void butConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsActionPerformed
        Produto prod = new Produto();
        prod.setDesc(txtCons.getText());

        Produto produtoConsultado = controler.consProd(prod);

        if (produtoConsultado != null) {

            txtDesc.setText(produtoConsultado.getDesc());
            txtPrecoAvista.setText(produtoConsultado.getPavista());
            txtPrecoAprazo.setText(produtoConsultado.getPaprazo());
            txtQuant.setText(produtoConsultado.getQuantidade());
        } else {
            JOptionPane.showMessageDialog(
                null,
                "CPF não encontrado!",
                "ERRO CONSULTA",
                JOptionPane.ERROR_MESSAGE
            );
        }

    }//GEN-LAST:event_butConsActionPerformed

    
    public void Navega(int indice) {

        ArrayList<Produto> produto = controler.getProdutos();

        if (indice >= 0 && indice < produto.size()) {
            Produto prod = controler.getProdutos().get(indice);
            prod.setInd(indice);
            prodaux = prod;
            txtDesc.setText(prod.getDesc());
            txtQuant.setText(prod.getQuantidade());
            txtPrecoAvista.setText(prod.getPavista());
            txtPrecoAprazo.setText(prod.getPaprazo());
        } else {
            JOptionPane.showMessageDialog(null, "INDICE INVÁLIDO \nTODOS PRODUTOS PERCORRIDOS");

        }
    }
         

    public void sair() {
        int respSair = JOptionPane.showConfirmDialog(
                null,
                "DESEJA REALMENTE SAIR?",
                "SAIR",
                JOptionPane.YES_NO_OPTION
        );

        if (respSair == 0) {
            dispose();
        }
    }
    
    public void limpaCampos() {
        txtDesc.setText("");
        txtQuant.setText("");
        txtPrecoAvista.setText("");
        txtPrecoAprazo.setText("");
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAbrir;
    private javax.swing.JButton butAlterar;
    private javax.swing.JButton butAnterior;
    private javax.swing.JButton butCons;
    private javax.swing.JButton butExcluir;
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butLimpar2;
    private javax.swing.JButton butProx;
    private javax.swing.JButton butSair;
    private javax.swing.JButton butSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCons;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblPrecoAprazo;
    private javax.swing.JLabel lblPrecoAvista;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCons;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrecoAprazo;
    private javax.swing.JTextField txtPrecoAvista;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables

}