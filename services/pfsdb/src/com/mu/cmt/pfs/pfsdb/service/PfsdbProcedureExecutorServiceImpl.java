/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

import com.mu.cmt.pfs.pfsdb.models.procedure.*;

@Service
public class PfsdbProcedureExecutorServiceImpl implements PfsdbProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PfsdbProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("pfsdbWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;

    @Transactional(value = "pfsdbTransactionManager")
    @Override
    public ProcCs1000pk0GetGmtReservQtyResponse executeProcCS1000PK0_GetGmtReservQty(String pprgid, String psourceOrdnum, String pdestOrdnum, String ptrnnum) {
        Map<String, Object> params = new HashMap<>(5);

        params.put("pPrgid", pprgid);
        params.put("pSourceOrdnum", psourceOrdnum);
        params.put("pDestOrdnum", pdestOrdnum);
        params.put("pTrnnum", ptrnnum);

        return procedureExecutor.executeNamedProcedure("procCS1000PK0_GetGmtReservQty", params, ProcCs1000pk0GetGmtReservQtyResponse.class);
    }

    @Transactional(value = "pfsdbTransactionManager")
    @Override
    public ProcCs1000pk0Cs411qryReservationResponse executeProcCS1000PK0_CS411QryReservation(String pordnum, String pgmtseq, Integer pclrseq, Integer pszeseq) {
        Map<String, Object> params = new HashMap<>(5);

        params.put("pOrdnum", pordnum);
        params.put("pGMTSEQ", pgmtseq);
        params.put("pCLRSEQ", pclrseq);
        params.put("pSZESEQ", pszeseq);

        return procedureExecutor.executeNamedProcedure("procCS1000PK0_CS411QryReservation", params, ProcCs1000pk0Cs411qryReservationResponse.class);
    }

    @Transactional(value = "pfsdbTransactionManager")
    @Override
    public ProcCs1000pk0Cs411qryGmtStockResponse executeProcCS1000PK0_CS411QryGmtStock(String pprgid, String pordnum) {
        Map<String, Object> params = new HashMap<>(3);

        params.put("pPrgid", pprgid);
        params.put("pOrdnum", pordnum);

        return procedureExecutor.executeNamedProcedure("procCS1000PK0_CS411QryGmtStock", params, ProcCs1000pk0Cs411qryGmtStockResponse.class);
    }

}