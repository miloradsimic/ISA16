package restaurant.jpa.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.Role;

@Entity
@Table(name = "tbl_guest")
public class Guest extends User {

	@ManyToMany
	@JoinTable(name = "tbl_friends", joinColumns = @JoinColumn(name = "guest_id"), inverseJoinColumns = @JoinColumn(name = "friend_id"))
	private List<Guest> friends;

	@ManyToMany
	@JoinTable(name = "tbl_friends", joinColumns = @JoinColumn(name = "friend_id"), inverseJoinColumns = @JoinColumn(name = "guest_id"))
	private List<Guest> friendOf;
	

	public Guest() {
		role = Role.GUEST;
	}

	public List<Guest> getFriends() {
		return friends;
	}

	public void setFriends(List<Guest> friends) {
		this.friends = friends;
	}

	public List<Guest> getFriendOf() {
		return friendOf;
	}

	public void setFriendOf(List<Guest> friendOf) {
		this.friendOf = friendOf;
	}

}
