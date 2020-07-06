package jp.co.jrqss.admin.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.schedule.domain.model.Work;
import jp.co.jrqss.admin.schedule.domain.repository.jdbc.WorkDaoImpl;

@Service
public class WorkService {

	@Autowired
	WorkDaoImpl workDaoImpl;

	public List<Work> getWorkInfo(){
		return workDaoImpl.getNextMonthDate();
	}


}
