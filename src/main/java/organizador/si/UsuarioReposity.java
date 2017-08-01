package organizador.si;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by matheus on 15/07/17.
 */

public interface UsuarioReposity extends JpaRepository<UsuarioPOJO, Long> {




    List<UsuarioPOJO> findAll();

}
