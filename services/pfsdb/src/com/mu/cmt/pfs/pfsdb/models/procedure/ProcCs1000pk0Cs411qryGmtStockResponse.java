/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcCs1000pk0Cs411qryGmtStockResponse implements Serializable {


    @ColumnAlias("pOutgmtstock")
    private List<ProcCs1000pk0Cs411qryGmtStockResponsePoutgmtstock> poutgmtstock;

    public List<ProcCs1000pk0Cs411qryGmtStockResponsePoutgmtstock> getPoutgmtstock() {
        return this.poutgmtstock;
    }

    public void setPoutgmtstock(List<ProcCs1000pk0Cs411qryGmtStockResponsePoutgmtstock> poutgmtstock) {
        this.poutgmtstock = poutgmtstock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcCs1000pk0Cs411qryGmtStockResponse)) return false;
        final ProcCs1000pk0Cs411qryGmtStockResponse procCs1000pk0cs411qryGmtStockResponse = (ProcCs1000pk0Cs411qryGmtStockResponse) o;
        return Objects.equals(getPoutgmtstock(), procCs1000pk0cs411qryGmtStockResponse.getPoutgmtstock());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoutgmtstock());
    }
}