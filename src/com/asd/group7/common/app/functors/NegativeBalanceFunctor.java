/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asd.group7.common.app.functors;

import org.mum.asd.framework.partyPattern.IParty;


/**
 *
 * @author dhruba
 */
public class NegativeBalanceFunctor implements IFunctor<IParty> {

    @Override
    public void compute(IParty p) {
        System.out.println("Your balance is negative: " + p.getBalance());
    }
}
