package irm.cm.swpbackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import irm.cm.swpbackend.Entity.Sensitiveword;
import irm.cm.swpbackend.Repository.SensitivewordRepository;


@Service
public class SensitivewordService {

    @Autowired
    SensitivewordRepository sensitivewordRepository;

    public boolean isExist(String Wordname,String Wordpartofspeech){
        //入库匹配算法
        Sensitiveword sensitiveword = sensitivewordRepository.findByWordnameAndWordpartofspeech(Wordname, Wordpartofspeech);
        return null!=sensitiveword;
    }

    public Sensitiveword saveSensitiveword(Sensitiveword s){
        return sensitivewordRepository.save(s);
    }
    
}
