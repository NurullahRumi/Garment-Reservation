/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcCs1000pk0Cs411qryGmtStockResponsePoutgmtstock implements Serializable {


    @ColumnAlias("ORDNUM")
    private String ordnum;

    @ColumnAlias("GMTSEQ")
    private String gmtseq;

    @ColumnAlias("GMTDES")
    private String gmtdes;

    @ColumnAlias("CLRSEQ")
    private Byte clrseq;

    @ColumnAlias("CLRABB")
    private String clrabb;

    @ColumnAlias("SZESEQ")
    private Byte szeseq;

    @ColumnAlias("SZEDES")
    private String szedes;

    @ColumnAlias("W_AMTAVL")
    private BigInteger wamtavl;

    @ColumnAlias("W_INITIAL_SURPLUS")
    private BigInteger winitialSurplus;

    @ColumnAlias("W_QTYRESV")
    private BigInteger wqtyresv;

    @ColumnAlias("W_DECLARED_DATE")
    private LocalDateTime wdeclaredDate;

    @ColumnAlias("W_RESERVED_DATE")
    private LocalDateTime wreservedDate;

    public String getOrdnum() {
        return this.ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    public String getGmtseq() {
        return this.gmtseq;
    }

    public void setGmtseq(String gmtseq) {
        this.gmtseq = gmtseq;
    }

    public String getGmtdes() {
        return this.gmtdes;
    }

    public void setGmtdes(String gmtdes) {
        this.gmtdes = gmtdes;
    }

    public Byte getClrseq() {
        return this.clrseq;
    }

    public void setClrseq(Byte clrseq) {
        this.clrseq = clrseq;
    }

    public String getClrabb() {
        return this.clrabb;
    }

    public void setClrabb(String clrabb) {
        this.clrabb = clrabb;
    }

    public Byte getSzeseq() {
        return this.szeseq;
    }

    public void setSzeseq(Byte szeseq) {
        this.szeseq = szeseq;
    }

    public String getSzedes() {
        return this.szedes;
    }

    public void setSzedes(String szedes) {
        this.szedes = szedes;
    }

    public BigInteger getWamtavl() {
        return this.wamtavl;
    }

    public void setWamtavl(BigInteger wamtavl) {
        this.wamtavl = wamtavl;
    }

    public BigInteger getWinitialSurplus() {
        return this.winitialSurplus;
    }

    public void setWinitialSurplus(BigInteger winitialSurplus) {
        this.winitialSurplus = winitialSurplus;
    }

    public BigInteger getWqtyresv() {
        return this.wqtyresv;
    }

    public void setWqtyresv(BigInteger wqtyresv) {
        this.wqtyresv = wqtyresv;
    }

    public LocalDateTime getWdeclaredDate() {
        return this.wdeclaredDate;
    }

    public void setWdeclaredDate(LocalDateTime wdeclaredDate) {
        this.wdeclaredDate = wdeclaredDate;
    }

    public LocalDateTime getWreservedDate() {
        return this.wreservedDate;
    }

    public void setWreservedDate(LocalDateTime wreservedDate) {
        this.wreservedDate = wreservedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcCs1000pk0Cs411qryGmtStockResponsePoutgmtstock)) return false;
        final ProcCs1000pk0Cs411qryGmtStockResponsePoutgmtstock procCs1000pk0cs411qryGmtStockResponsePoutgmtstock = (ProcCs1000pk0Cs411qryGmtStockResponsePoutgmtstock) o;
        return Objects.equals(getOrdnum(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getOrdnum()) &&
                Objects.equals(getGmtseq(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getGmtseq()) &&
                Objects.equals(getGmtdes(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getGmtdes()) &&
                Objects.equals(getClrseq(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getClrseq()) &&
                Objects.equals(getClrabb(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getClrabb()) &&
                Objects.equals(getSzeseq(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getSzeseq()) &&
                Objects.equals(getSzedes(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getSzedes()) &&
                Objects.equals(getWamtavl(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getWamtavl()) &&
                Objects.equals(getWinitialSurplus(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getWinitialSurplus()) &&
                Objects.equals(getWqtyresv(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getWqtyresv()) &&
                Objects.equals(getWdeclaredDate(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getWdeclaredDate()) &&
                Objects.equals(getWreservedDate(), procCs1000pk0cs411qryGmtStockResponsePoutgmtstock.getWreservedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrdnum(),
                getGmtseq(),
                getGmtdes(),
                getClrseq(),
                getClrabb(),
                getSzeseq(),
                getSzedes(),
                getWamtavl(),
                getWinitialSurplus(),
                getWqtyresv(),
                getWdeclaredDate(),
                getWreservedDate());
    }
}