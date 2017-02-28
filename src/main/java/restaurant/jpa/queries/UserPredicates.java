package restaurant.jpa.queries;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.domain.QShift;
import restaurant.jpa.domain.QUser;

public class UserPredicates {

	private UserPredicates() {
	}

	public static Predicate hasUsernameAndPassword(String username, String password) {
		return QUser.user.email.eq(username).and(QUser.user.password.eq(password));

	}
	
	public static Predicate hasPassword(String password) {
		return QUser.user.password.eq(password);

	}
}
