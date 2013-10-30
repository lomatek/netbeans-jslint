/*
 *  The MIT License
 * 
 *  Copyright (c) 2011 by Stanislav Lomadurov <lord.rojer@gmail.com>
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.lomatek.jslint.ui;

import com.sun.java.swing.plaf.windows.resources.windows;
import javax.swing.JPanel;
import org.lomatek.jslint.JSLintOptions;

final class JSLintPanel extends javax.swing.JPanel {

    private final JSLintOptionsPanelController controller;

    JSLintPanel(JSLintOptionsPanelController controller) {
	this.controller = controller;
	initComponents();
	// TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        devel = new javax.swing.JCheckBox();
        browser = new javax.swing.JCheckBox();
        node = new javax.swing.JCheckBox();
        rhino = new javax.swing.JCheckBox();
        passfail = new javax.swing.JCheckBox();
        bitwise = new javax.swing.JCheckBox();
        newcap = new javax.swing.JCheckBox();
        tContinue = new javax.swing.JCheckBox();
        debug = new javax.swing.JCheckBox();
        eqeq = new javax.swing.JCheckBox();
        evil = new javax.swing.JCheckBox();
        forin = new javax.swing.JCheckBox();
        nomen = new javax.swing.JCheckBox();
        plusplus = new javax.swing.JCheckBox();
        regexp = new javax.swing.JCheckBox();
        unparam = new javax.swing.JCheckBox();
        sloppy = new javax.swing.JCheckBox();
        sub = new javax.swing.JCheckBox();
        vars = new javax.swing.JCheckBox();
        white = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jUnselectAll = new javax.swing.JButton();
        jSelectAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        indent = new javax.swing.JTextField();
        maxlen = new javax.swing.JTextField();
        maxerr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        preDef = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        couch = new javax.swing.JCheckBox();
        ass = new javax.swing.JCheckBox();
        closure = new javax.swing.JCheckBox();
        stupid = new javax.swing.JCheckBox();
        todo = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(devel, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.devel.text")); // NOI18N
        devel.setToolTipText(org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.devel.toolTipText")); // NOI18N
        devel.setName("devel"); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browser, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.browser.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(node, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.node.text")); // NOI18N
        node.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(rhino, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.rhino.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(passfail, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.passfail.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(bitwise, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.bitwise.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(newcap, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.newcap.text")); // NOI18N
        newcap.setToolTipText(org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.newcap.toolTipText")); // NOI18N
        newcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcapActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(tContinue, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.tContinue.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(debug, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.debug.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(eqeq, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.eqeq.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(evil, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.evil.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(forin, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.forin.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(nomen, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.nomen.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(plusplus, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.plusplus.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(regexp, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.regexp.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(unparam, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.unparam.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(sloppy, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.sloppy.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(sub, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.sub.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(vars, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.vars.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(white, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.white.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jUnselectAll, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.jUnselectAll.text")); // NOI18N
        jUnselectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUnselectAllActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jSelectAll, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.jSelectAll.text")); // NOI18N
        jSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectAllActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.jLabel1.text")); // NOI18N

        indent.setText(org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.indent.text")); // NOI18N
        indent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indentActionPerformed(evt);
            }
        });

        maxlen.setText(org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.maxlen.text")); // NOI18N

        maxerr.setText(org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.maxerr.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.jLabel3.text")); // NOI18N

        preDef.setColumns(20);
        preDef.setRows(5);
        jScrollPane1.setViewportView(preDef);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(couch, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.couch.text")); // NOI18N
        couch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couchActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(ass, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.ass.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(closure, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.closure.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(stupid, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.stupid.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(todo, org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.todo.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jUnselectAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSelectAll))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(browser)
                                            .addComponent(devel)
                                            .addComponent(node)
                                            .addComponent(rhino)
                                            .addComponent(passfail)
                                            .addComponent(couch))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomen)
                                            .addComponent(tContinue)
                                            .addComponent(debug)
                                            .addComponent(eqeq)
                                            .addComponent(evil)
                                            .addComponent(forin)
                                            .addComponent(closure)
                                            .addComponent(ass)
                                            .addComponent(bitwise))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(newcap)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plusplus)
                                    .addComponent(regexp)
                                    .addComponent(unparam)
                                    .addComponent(sloppy)
                                    .addComponent(sub)
                                    .addComponent(vars)
                                    .addComponent(white)
                                    .addComponent(stupid)
                                    .addComponent(todo))))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(maxerr, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxlen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(indent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jLabel4)))
                            .addComponent(jSeparator1))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(devel)
                            .addComponent(ass)
                            .addComponent(plusplus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(node)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rhino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(couch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passfail)
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUnselectAll)
                            .addComponent(jSelectAll)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bitwise)
                            .addComponent(regexp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closure)
                            .addComponent(unparam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tContinue)
                            .addComponent(sloppy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(debug)
                            .addComponent(stupid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eqeq)
                            .addComponent(sub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(evil)
                            .addComponent(todo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(forin)
                            .addComponent(vars))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newcap)
                            .addComponent(white))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomen)))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxlen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxerr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        couch.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.couch.AccessibleContext.accessibleName")); // NOI18N
        couch.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JSLintPanel.class, "JSLintPanel.couch.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void indentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indentActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_indentActionPerformed

    private void jUnselectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUnselectAllActionPerformed
	devel.setSelected(false);
	bitwise.setSelected(false);
	regexp.setSelected(false);
	browser.setSelected(false);
	node.setSelected(false);
	tContinue.setSelected(false);
	unparam.setSelected(false);
	rhino.setSelected(false);
	debug.setSelected(false);
	sloppy.setSelected(false);
	eqeq.setSelected(false);
	sub.setSelected(false);
	vars.setSelected(false);
	evil.setSelected(false);
	white.setSelected(false);
	passfail.setSelected(false);
	forin.setSelected(false);
	newcap.setSelected(false);
	nomen.setSelected(false);
	plusplus.setSelected(false);
        couch.setSelected(false);
        ass.setSelected(false);
	closure.setSelected(false);
	stupid.setSelected(false);
        todo.setSelected(false);
    }//GEN-LAST:event_jUnselectAllActionPerformed

    private void jSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectAllActionPerformed
	devel.setSelected(true);
	bitwise.setSelected(true);
	regexp.setSelected(true);
	browser.setSelected(true);
	node.setSelected(true);
	tContinue.setSelected(true);
	unparam.setSelected(true);
	rhino.setSelected(true);
	debug.setSelected(true);
	sloppy.setSelected(true);
	eqeq.setSelected(true);
	sub.setSelected(true);
	vars.setSelected(true);
	evil.setSelected(true);
	white.setSelected(true);
	passfail.setSelected(true);
	forin.setSelected(true);
	newcap.setSelected(true);
	nomen.setSelected(true);
	plusplus.setSelected(true);
        couch.setSelected(false);
        ass.setSelected(true);
	closure.setSelected(true);
	stupid.setSelected(true);
        todo.setSelected(false);
    }//GEN-LAST:event_jSelectAllActionPerformed

    private void newcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newcapActionPerformed

    private void nodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeActionPerformed

    private void couchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couchActionPerformed

    void load() {
	devel.setSelected(JSLintOptions.getInstance().getOption("devel"));
	bitwise.setSelected(JSLintOptions.getInstance().getOption("bitwise"));
	regexp.setSelected(JSLintOptions.getInstance().getOption("regexp"));
	browser.setSelected(JSLintOptions.getInstance().getOption("browser"));
	node.setSelected(JSLintOptions.getInstance().getOption("node"));
	tContinue.setSelected(JSLintOptions.getInstance().getOption("continue"));
	unparam.setSelected(JSLintOptions.getInstance().getOption("unparam"));
	rhino.setSelected(JSLintOptions.getInstance().getOption("rhino"));
	debug.setSelected(JSLintOptions.getInstance().getOption("debug"));
	sloppy.setSelected(JSLintOptions.getInstance().getOption("sloppy"));
	eqeq.setSelected(JSLintOptions.getInstance().getOption("eqeq"));
	sub.setSelected(JSLintOptions.getInstance().getOption("sub"));
	vars.setSelected(JSLintOptions.getInstance().getOption("vars"));
	evil.setSelected(JSLintOptions.getInstance().getOption("evil"));
	white.setSelected(JSLintOptions.getInstance().getOption("white"));
	passfail.setSelected(JSLintOptions.getInstance().getOption("passfail"));
	forin.setSelected(JSLintOptions.getInstance().getOption("forin"));
	newcap.setSelected(JSLintOptions.getInstance().getOption("newcap"));
	nomen.setSelected(JSLintOptions.getInstance().getOption("nomen"));
	plusplus.setSelected(JSLintOptions.getInstance().getOption("plusplus"));
        couch.setSelected(JSLintOptions.getInstance().getOption("couch"));
        ass.setSelected(JSLintOptions.getInstance().getOption("ass"));
        closure.setSelected(JSLintOptions.getInstance().getOption("closure"));
        stupid.setSelected(JSLintOptions.getInstance().getOption("stupid"));
        todo.setSelected(JSLintOptions.getInstance().getOption("todo"));
        
	preDef.setText(JSLintOptions.getInstance().getOption("predef", ""));
	try {
	    maxerr.setText(Integer.toString(JSLintOptions.getInstance().getOption("maxerr",50)));
	    indent.setText(Integer.toString(JSLintOptions.getInstance().getOption("indent",4)));
	    maxlen.setText(Integer.toString(JSLintOptions.getInstance().getOption("maxlen",0)));   
	} catch (NumberFormatException e) {
            e.printStackTrace();
        } 
    }

    void store() {
	JSLintOptions.getInstance().setOption("bitwise", bitwise.isSelected());
	JSLintOptions.getInstance().setOption("browser", browser.isSelected());
	JSLintOptions.getInstance().setOption("debug", debug.isSelected());
	JSLintOptions.getInstance().setOption("devel", devel.isSelected());
	JSLintOptions.getInstance().setOption("eqeq", eqeq.isSelected());
	JSLintOptions.getInstance().setOption("evil", evil.isSelected());
	JSLintOptions.getInstance().setOption("forin", forin.isSelected());
	JSLintOptions.getInstance().setOption("newcap", newcap.isSelected());
	JSLintOptions.getInstance().setOption("node", node.isSelected());
	JSLintOptions.getInstance().setOption("nomen", nomen.isSelected());
	JSLintOptions.getInstance().setOption("passfail", passfail.isSelected());
	JSLintOptions.getInstance().setOption("plusplus", plusplus.isSelected());
	JSLintOptions.getInstance().setOption("regexp", regexp.isSelected());
	JSLintOptions.getInstance().setOption("rhino", rhino.isSelected());
	JSLintOptions.getInstance().setOption("sloppy", sloppy.isSelected());
	JSLintOptions.getInstance().setOption("sub", sub.isSelected());
	JSLintOptions.getInstance().setOption("continue", tContinue.isSelected());
	JSLintOptions.getInstance().setOption("unparam", unparam.isSelected());
	JSLintOptions.getInstance().setOption("vars", vars.isSelected());
	JSLintOptions.getInstance().setOption("white", white.isSelected());
        JSLintOptions.getInstance().setOption("couch", couch.isSelected());
        JSLintOptions.getInstance().setOption("ass", ass.isSelected());
        JSLintOptions.getInstance().setOption("closure", closure.isSelected());
        JSLintOptions.getInstance().setOption("stupid", stupid.isSelected());
        JSLintOptions.getInstance().setOption("todo", todo.isSelected());
	JSLintOptions.getInstance().setOption("predef", preDef.getText());
	try {
	    JSLintOptions.getInstance().setOption("maxerr", Integer.parseInt(maxerr.getText()));
	    JSLintOptions.getInstance().setOption("indent", Integer.parseInt(indent.getText()));
	    JSLintOptions.getInstance().setOption("maxlen", Integer.parseInt(maxlen.getText()));
	} catch (NumberFormatException e) {
            e.printStackTrace();
        }
	
	//JSLintOptions.getInstance().getOptions();
	JSLintOptions.getInstance().removeOptions();
    }

    boolean valid() {
	// TODO check whether form is consistent and complete
	return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ass;
    private javax.swing.JCheckBox bitwise;
    private javax.swing.JCheckBox browser;
    private javax.swing.JCheckBox closure;
    private javax.swing.JCheckBox couch;
    private javax.swing.JCheckBox debug;
    private javax.swing.JCheckBox devel;
    private javax.swing.JCheckBox eqeq;
    private javax.swing.JCheckBox evil;
    private javax.swing.JCheckBox forin;
    private javax.swing.JTextField indent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSelectAll;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jUnselectAll;
    private javax.swing.JTextField maxerr;
    private javax.swing.JTextField maxlen;
    private javax.swing.JCheckBox newcap;
    private javax.swing.JCheckBox node;
    private javax.swing.JCheckBox nomen;
    private javax.swing.JCheckBox passfail;
    private javax.swing.JCheckBox plusplus;
    private javax.swing.JTextArea preDef;
    private javax.swing.JCheckBox regexp;
    private javax.swing.JCheckBox rhino;
    private javax.swing.JCheckBox sloppy;
    private javax.swing.JCheckBox stupid;
    private javax.swing.JCheckBox sub;
    private javax.swing.JCheckBox tContinue;
    private javax.swing.JCheckBox todo;
    private javax.swing.JCheckBox unparam;
    private javax.swing.JCheckBox vars;
    private javax.swing.JCheckBox white;
    // End of variables declaration//GEN-END:variables
}
