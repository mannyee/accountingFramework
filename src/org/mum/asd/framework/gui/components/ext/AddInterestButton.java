/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.gui.components.ext;

import javax.swing.JButton;
import org.mum.asd.framework.mediator.Mediator;

/**
 *
 * @author james
 */
public class AddInterestButton extends JButton {

    private static final String NAME = "ADD_INTEREST_BUTTON";
    private Mediator mediator;

    public AddInterestButton(Mediator mediator) {
        this.mediator = mediator;
    }

}
