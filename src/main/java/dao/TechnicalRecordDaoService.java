package dao;

import model.TechnicalRecord;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindException;

import javax.validation.Valid;

public class TechnicalRecordDaoService {

    @Transactional
    public void saveService(@Valid TechnicalRecord record, BindException result) {

        if (result.hasErrors())
            throw new NullPointerException("");

    }
}
