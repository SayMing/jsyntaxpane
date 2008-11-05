/*
 * Copyright 2008 Ayman Al-Sairafi ayman.alsairafi@gmail.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License 
 *       at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.  
 */
package jsyntaxpane;

import java.awt.event.ItemEvent;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.BadLocationException;
import jsyntaxpane.actions.CaretMonitor;
import jsyntaxpane.actions.SyntaxActions;

public class SyntaxTester extends javax.swing.JFrame {

    /** Creates new form Tester */
    public SyntaxTester() {
        initComponents();
        DefaultSyntaxKit.initKit();
        jCmbLangs.setModel(new DefaultComboBoxModel(DefaultSyntaxKit.getContentTypes()));
        // jEdtTest.setContentType(jCmbLangs.getItemAt(0).toString());
        jCmbLangs.setSelectedItem("text/java");
        new CaretMonitor(jEdtTest, lblCaretPos);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCaretPos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEdtTest = new javax.swing.JEditorPane();
        lblToken = new javax.swing.JLabel();
        jCmbLangs = new javax.swing.JComboBox();
        jBtnGetLine = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBtnPos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JSyntaxPane Tester");

        lblCaretPos.setText("Caret Position");

        jEdtTest.setContentType("text/java");
        jEdtTest.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jEdtTest.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jEdtTestCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(jEdtTest);

        lblToken.setFont(new java.awt.Font("Courier New", 0, 12));
        lblToken.setText("Token under cursor");

        jCmbLangs.setMaximumRowCount(20);
        jCmbLangs.setFocusable(false);
        jCmbLangs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCmbLangsItemStateChanged(evt);
            }
        });

        jBtnGetLine.setText("Get Line");
        jBtnGetLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGetLineActionPerformed(evt);
            }
        });

        jButton1.setText("Del");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Repl");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jBtnPos.setText("Pos");
        jBtnPos.setFocusable(false);
        jBtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblToken, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCmbLangs, 0, 231, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnGetLine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCaretPos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(lblToken, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbLangs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaretPos, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jBtnGetLine)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jBtnPos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jEdtTestCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jEdtTestCaretUpdate
    if (jEdtTest.getDocument() instanceof SyntaxDocument) {
        SyntaxDocument sDoc = (SyntaxDocument) jEdtTest.getDocument();
        Token t = sDoc.getTokenAt(evt.getDot());
        if (t != null) {
            try {
                String tData = sDoc.getText(t.start, Math.min(t.length, 40));
                if (t.length > 40) {
                    tData += "...";
                }
                lblToken.setText(t.toString() + ": " + tData);
            } catch (BadLocationException ex) {
                // should not happen.. and if it does, just ignore it
                System.err.println(ex);
                ex.printStackTrace();
            }
        }
    }

}//GEN-LAST:event_jEdtTestCaretUpdate

private void jCmbLangsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbLangsItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
        String lang = jCmbLangs.getSelectedItem().toString();

        // save the state of the current JEditorPane, as it's Document is about
        // to be replaced.
        String t = jEdtTest.getText();
        int caretPosition = jEdtTest.getCaretPosition();
        Rectangle visibleRectangle = jEdtTest.getVisibleRect();

        // install a new DefaultSyntaxKit on the JEditorPane for the requested language.
        jEdtTest.setContentType(lang);

        // restore the state of the JEditorPane - note that installing a new
        // EditorKit causes the Document to be recreated.
        SyntaxDocument sDoc = (SyntaxDocument) jEdtTest.getDocument();
        jEdtTest.setText(t);
        sDoc.clearUndos();
        jEdtTest.setCaretPosition(caretPosition);
        jEdtTest.scrollRectToVisible(visibleRectangle);
    }
}//GEN-LAST:event_jCmbLangsItemStateChanged

private void jBtnGetLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGetLineActionPerformed
    SyntaxDocument sDoc = (SyntaxDocument) jEdtTest.getDocument();
    try {
        String line = sDoc.getLineAt(jEdtTest.getCaretPosition());
        System.out.printf("Line = <%s>\n", line);
    } catch (BadLocationException ex) {
        Logger.getLogger(SyntaxTester.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jBtnGetLineActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        SyntaxDocument sDoc = (SyntaxDocument) jEdtTest.getDocument();
        int pos = jEdtTest.getCaretPosition();
        sDoc.replaceLineAt(pos, "New lines\ninserted\n");
    } catch (BadLocationException ex) {
        Logger.getLogger(SyntaxTester.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        SyntaxDocument sDoc = (SyntaxDocument) jEdtTest.getDocument();
        int pos = jEdtTest.getCaretPosition();
        sDoc.removeLineAt(pos);
    } catch (BadLocationException ex) {
        Logger.getLogger(SyntaxTester.class.getName()).log(Level.SEVERE, null, ex);
    }

}//GEN-LAST:event_jButton1ActionPerformed

private void jBtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPosActionPerformed
    int pos = SyntaxActions.getDocumentPosition(jEdtTest, 10, 10);
    jEdtTest.setCaretPosition(pos);
}//GEN-LAST:event_jBtnPosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SyntaxTester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGetLine;
    private javax.swing.JButton jBtnPos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jCmbLangs;
    private javax.swing.JEditorPane jEdtTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaretPos;
    private javax.swing.JLabel lblToken;
    // End of variables declaration//GEN-END:variables
}
