/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.mediator;

/**
 *
 * @author sudell
 */
public interface IMediator {

    public void send(Message message);

    public void addColleague(IColleague colleague);
}
