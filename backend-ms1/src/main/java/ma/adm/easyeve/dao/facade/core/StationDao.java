package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.Station;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StationDao extends AbstractRepository<Station,Long>  {


    @Query("SELECT NEW Station(item.id,item.libelle) FROM Station item")
    List<Station> findAllOptimized();
}
