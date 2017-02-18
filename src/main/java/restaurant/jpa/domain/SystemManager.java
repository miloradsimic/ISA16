package restaurant.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "system_manager")
public class SystemManager {

	//TODO: Mislim da ne treba ID zato sto postoji samo jedan system manager u ovom informacionom sistemu
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(nullable = false)
	private String password;
	
	public SystemManager() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
