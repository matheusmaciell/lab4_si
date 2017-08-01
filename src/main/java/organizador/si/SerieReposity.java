package organizador.si;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



/**
 * Created by matheus on 20/07/17.
 */
public interface SerieReposity extends JpaRepository<SeriePOJO, Long> {

	
	
	List<SeriePOJO> findByUserId(String userId);
}
