package organizador.si;

import javax.persistence.*;

/**
 * Created by matheus on 15/07/17.
 */

@Entity
public class SeriePOJO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
   
    

	@Column(name = "id_imdb")
    private String id_imbdb;

    
    @Column(name = "userId")
    private String userId;	
    
    @Column(name = "estaNaWatchlist")
    private boolean estaNaWatchlist;

    public boolean isEstaNaWatchlist() {
        return estaNaWatchlist;
    }

    public void setEstaNaWatchlist(boolean estaNaWatchlist) {
        this.estaNaWatchlist = estaNaWatchlist;
    }

    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_imbdb() {
        return id_imbdb;
    }

    public void setId_imbdb(String id_imbdb) {
        this.id_imbdb = id_imbdb;
    }

    

   




}
