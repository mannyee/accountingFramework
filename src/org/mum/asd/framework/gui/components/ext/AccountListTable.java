/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.gui.components.ext;


import javax.swing.table.TableModel;
import org.mum.asd.framework.common.gui.components.asd.ASDTable;

/**
 *
 * @author james
 */
public class AccountListTable extends ASDTable {

    private static final String NAME = "ACCOUNT_LIST_TABLE";

    public AccountListTable(TableModel dm) {
        super(dm);
    }


}
