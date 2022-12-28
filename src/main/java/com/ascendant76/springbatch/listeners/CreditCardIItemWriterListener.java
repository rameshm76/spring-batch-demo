package com.ascendant76.springbatch.listeners;

import com.ascendant76.springbatch.domain.CreditCardRisk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

public class CreditCardIItemWriterListener implements ItemWriteListener<CreditCardRisk> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreditCardIItemWriterListener.class);

    @Override
    public void beforeWrite(List<? extends CreditCardRisk> list) {
        LOGGER.info("beforeWrite:{}", list);
    }


    @Override
    public void afterWrite(List<? extends CreditCardRisk> list) {
        for (CreditCardRisk creditCardRisk : list) {
            LOGGER.info("afterWrite:{}", creditCardRisk);
        }
    }

    @Override
    public void onWriteError(Exception e, List<? extends CreditCardRisk> list) {
        LOGGER.error("onWriteError", e);
    }
}
