package restaurant.jpa.queries;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.domain.QUser;
import restaurant.jpa.domain.enums.Role;

public class UserPredicates {

	private UserPredicates() {
	}

	public static Predicate hasUsernameAndPassword(String username, String password) {
		return QUser.user.email.eq(username).and(QUser.user.password.eq(password));
	}

	public static Predicate hasPassword(String password) {
		return QUser.user.password.eq(password);

	}

	public static Predicate hasEmail(String email) {
		return QUser.user.email.eq(email);
	}
	
	public static Predicate hasRoles( String username, Role... role) {
		return QUser.user.email.ne(username).andAnyOf(QUser.user.role.eq(role[0]), QUser.user.role.eq(role[1]));
	}
	
}
