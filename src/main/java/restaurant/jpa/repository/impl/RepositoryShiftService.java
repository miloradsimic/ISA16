package restaurant.jpa.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.dto.mapper.ShiftMapper;
import restaurant.jpa.dto.response.ShiftResponseDTO;
import restaurant.jpa.queries.ShiftPredicate;
import restaurant.jpa.repository.ShiftRepository;
import restaurant.jpa.service.ShiftService;

@Service
public class RepositoryShiftService implements ShiftService {

	private ShiftRepository shiftRepository;

	//NOTE: Constructor injection
	@Autowired
	public RepositoryShiftService(ShiftRepository repository) {
		this.shiftRepository = repository;
	}

	@Transactional
	@Override
	public ShiftResponseDTO findById(long id) {

		Predicate pred = ShiftPredicate.hasId(id);
		
		return ShiftMapper.mapEntityIntoDTO(shiftRepository.findOne(pred));
	}
	
	
}
