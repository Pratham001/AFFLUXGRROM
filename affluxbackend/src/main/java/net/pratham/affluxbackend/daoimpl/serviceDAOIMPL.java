package net.pratham.affluxbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.pratham.affluxbackend.dao.serviceDAO;
import net.pratham.affluxbackend.dto.services;


@Repository("serviceDAO")
public class serviceDAOIMPL implements serviceDAO {

	
	private static List<services> service =new ArrayList<>(); 
	
	
	static{
	
	services services=new services();
	
	//adding first category
	services.setId(1);
	services.setName("Haircut");
	services.setDescription("This is haircut");
	services.setImgURL("CAT_1.png");
		
	service.add(services);

	//adding second category
	services=new services();
		services.setId(2);
		services.setName("facial");
		services.setDescription("This is facial");
		services.setImgURL("CAT_2.png");
			
		service.add(services);
		
		
		//adding third category
		services=new services();
				services.setId(3);
				services.setName("spa");
				services.setDescription("This is facial");
				services.setImgURL("CAT_2.png");
					
				service.add(services);
				
				//adding fourth category
				services=new services();
				services.setId(4);
				services.setName("shaving");
				services.setDescription("This is facial");
				services.setImgURL("CAT_2.png");
					
				service.add(services);
				
				
				//adding fifth category
				services=new services();
				services.setId(5);
				services.setName("facial");
				services.setDescription("This is facial");
				services.setImgURL("CAT_2.png");
					
				service.add(services);
				
				
				//adding sixth category
				services=new services();
				services.setId(6);
				services.setName("nailart");
				services.setDescription("This is facial");
				services.setImgURL("CAT_2.png");
					
				service.add(services);

	
	
	}
	
	
	@Override
	public List<services> list() {
		// TODO Auto-generated method stub
		return service;
	}


	@Override
	public services get(int id) {
		// enhanced for loop 
		for(services services  : service)
		{
			if(services.getId() == id)  return services;
		
	}
	return null;
		}
}
