package mapper;

import model.TechnicalRecord;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

@Component
public class Mapper {

    public List<TechnicalRecord> mapDatatoEntity(List<String> s) {
        if (null != s && !CollectionUtils.isEmpty(s)) {
            throw new NullPointerException("List should not be empty");
        }
        List<TechnicalRecord> r = s.stream()
                .map(mapToCustomerStatement)
                .collect(toList());
        return r;
    }

    private static Function<String, TechnicalRecord> mapToCustomerStatement = (line) -> {
        TechnicalRecord record = new TechnicalRecord();
        String[] customerStatementFunction = line.split(",");
        record.setSourceId(customerStatementFunction[0]);
        record.setFirstName(customerStatementFunction[1]);
        record.setMiddleInitial(customerStatementFunction[2]);
        record.setLastName(customerStatementFunction[3]);
        record.setCity(customerStatementFunction[4]);
        record.setEmailAddress(customerStatementFunction[5]);
        return record;
    };
}
