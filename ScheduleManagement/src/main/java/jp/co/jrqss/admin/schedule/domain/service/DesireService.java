package jp.co.jrqss.admin.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.schedule.domain.model.Desire;
import jp.co.jrqss.admin.schedule.domain.repository.jdbc.DesireDaoImpl;

@Service
public class DesireService {

	@Autowired
	DesireDaoImpl desireDaoImpl;

	public List<Desire> getDesireInfo(){
		return desireDaoImpl.selectAll();
	}
}

