package service;

import mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnicalResourceService {

    @Autowired
    private Mapper m;

    public void technicalResourceEntity() {
        String s = "Hello word";
        List<String> s1 = new ArrayList<>();
        s1.add(s);

    }

}
