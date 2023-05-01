package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.TypeVoie;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.TypeVoie;
import java.util.List;


@Repository
public interface TypeVoieDao extends AbstractRepository<TypeVoie,Long>  {
    TypeVoie findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeVoie(item.id,item.libelle) FROM TypeVoie item")
    List<TypeVoie> findAllOptimized();
}
