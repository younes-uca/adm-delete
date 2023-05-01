package ma.adm.easyeve.zynerator.repository;

import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractHistoryRepository<H extends HistBusinessObject, ID> extends JpaRepository<H, ID>, JpaSpecificationExecutor<H> {
}
