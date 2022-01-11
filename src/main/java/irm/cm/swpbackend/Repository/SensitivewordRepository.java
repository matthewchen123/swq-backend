package irm.cm.swpbackend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import irm.cm.swpbackend.Entity.Sensitiveword;

@Repository
public interface SensitivewordRepository extends JpaRepository<Sensitiveword,Integer> {

    Sensitiveword findBySensitivewordid(Integer sensitivewordid);
    List<Sensitiveword> findAll();

    Sensitiveword findByWordname(String wordname);
    Sensitiveword findByWordpartofspeech(String Wordpartofspeech);
    Sensitiveword findByDescription(String description);
    Sensitiveword findBySynonym(String synonym); 
    Sensitiveword findByHomoionym(String homoionym);

    Sensitiveword findByWordnameAndWordpartofspeech(String wordname,String Wordpartofspeech);


}
