package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.Evenement;
import ma.adm.easyeve.bean.history.EvenementHistory;
import ma.adm.easyeve.dao.criteria.core.EvenementCriteria;
import ma.adm.easyeve.dao.criteria.history.EvenementHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.EvenementDao;
import ma.adm.easyeve.dao.facade.history.EvenementHistoryDao;
import ma.adm.easyeve.dao.specification.core.EvenementSpecification;
import ma.adm.easyeve.service.facade.admin.EvenementAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.adm.easyeve.service.facade.admin.StationAdminService ;
import ma.adm.easyeve.service.facade.admin.VoieAdminService ;
import ma.adm.easyeve.service.facade.admin.EventTypeAdminService ;
import ma.adm.easyeve.service.facade.admin.TelePeayageAdminService ;
import ma.adm.easyeve.service.facade.admin.AnomalieAdminService ;
import ma.adm.easyeve.service.facade.admin.MessageTypeAdminService ;
import ma.adm.easyeve.service.facade.admin.TypeEquipementAdminService ;


import java.util.List;
@Service
public class EvenementAdminServiceImpl extends AbstractServiceImpl<Evenement,EvenementHistory, EvenementCriteria, EvenementHistoryCriteria, EvenementDao,
EvenementHistoryDao> implements EvenementAdminService {


    public Evenement findByReferenceEntity(Evenement t){
        return  dao.findByCode(t.getCode());
    }

    public List<Evenement> findByVoieId(Long id){
        return dao.findByVoieId(id);
    }
    public int deleteByVoieId(Long id){
        return dao.deleteByVoieId(id);
    }
    public List<Evenement> findByMessageTypeId(Long id){
        return dao.findByMessageTypeId(id);
    }
    public int deleteByMessageTypeId(Long id){
        return dao.deleteByMessageTypeId(id);
    }
    public List<Evenement> findByTelePeayageId(Long id){
        return dao.findByTelePeayageId(id);
    }
    public int deleteByTelePeayageId(Long id){
        return dao.deleteByTelePeayageId(id);
    }
    public List<Evenement> findByTypeEquipementId(Long id){
        return dao.findByTypeEquipementId(id);
    }
    public int deleteByTypeEquipementId(Long id){
        return dao.deleteByTypeEquipementId(id);
    }
    public List<Evenement> findByEventTypeId(Long id){
        return dao.findByEventTypeId(id);
    }
    public int deleteByEventTypeId(Long id){
        return dao.deleteByEventTypeId(id);
    }
    public List<Evenement> findByStationId(Long id){
        return dao.findByStationId(id);
    }
    public int deleteByStationId(Long id){
        return dao.deleteByStationId(id);
    }
    public List<Evenement> findByAnomalieId(Long id){
        return dao.findByAnomalieId(id);
    }
    public int deleteByAnomalieId(Long id){
        return dao.deleteByAnomalieId(id);
    }

    public void configure() {
        super.configure(Evenement.class,EvenementHistory.class, EvenementHistoryCriteria.class, EvenementSpecification.class);
    }

    @Autowired
    private StationAdminService stationService ;
    @Autowired
    private VoieAdminService voieService ;
    @Autowired
    private EventTypeAdminService eventTypeService ;
    @Autowired
    private TelePeayageAdminService telePeayageService ;
    @Autowired
    private AnomalieAdminService anomalieService ;
    @Autowired
    private MessageTypeAdminService messageTypeService ;
    @Autowired
    private TypeEquipementAdminService typeEquipementService ;
    public EvenementAdminServiceImpl(EvenementDao dao, EvenementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}