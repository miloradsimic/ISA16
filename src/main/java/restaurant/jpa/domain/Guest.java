package restaurant.jpa.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_guest")
public class Guest extends User {

	@ManyToMany
	@JoinTable(name = "tbl_friends", joinColumns = @JoinColumn(name = "guest_id"), inverseJoinColumns = @JoinColumn(name = "friend_id"))
	private List<User> friends;

	@ManyToMany
	@JoinTable(name = "tbl_friends", joinColumns = @JoinColumn(name = "friend_id"), inverseJoinColumns = @JoinColumn(name = "guest_id"))
	private List<User> friendOf;

	public Guest() {
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public List<User> getFriendOf() {
		return friendOf;
	}

	public void setFriendOf(List<User> friendOf) {
		this.friendOf = friendOf;
	}

}
