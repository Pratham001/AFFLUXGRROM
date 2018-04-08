package net.pratham.affluxbackend.dao;

import java.util.List;

import net.pratham.affluxbackend.dto.services;

public interface serviceDAO {
	
	List<services> list();
	
	services get( int id);

}
