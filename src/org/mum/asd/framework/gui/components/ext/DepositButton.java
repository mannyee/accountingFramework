/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.gui.components.ext;

import static javafx.scene.input.KeyCode.I;
import javax.swing.JButton;
import org.mum.asd.framework.mediator.Mediator;
import org.mum.asd.framework.mediator.Message;



/**
 *
 * @author james
 */
public class DepositButton extends JButton  {

    private static final String NAME = "DEPOSIT_BUTTON";
  private Mediator mediator;

    public DepositButton(Mediator mediator) {
        this.mediator = mediator;
    }

 

    public static String getNAME() {
        return NAME;
    }
    

}