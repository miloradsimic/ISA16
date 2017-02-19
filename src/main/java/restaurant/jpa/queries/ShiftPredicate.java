package restaurant.jpa.queries;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.domain.QShift;

public class ShiftPredicate {

	private ShiftPredicate() {
	}
	
	public static Predicate hasId(long id) {
		return QShift.shift.id.eq(id);
	}

}
