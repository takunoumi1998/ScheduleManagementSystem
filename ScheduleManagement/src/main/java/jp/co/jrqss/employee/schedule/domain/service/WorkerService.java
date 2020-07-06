package jp.co.jrqss.employee.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.repository.jdbc.WorkDaoJdbcImpl;

@Service
public class WorkerService {

	@Autowired
	WorkDaoJdbcImpl workDaoJdbcImpl;


	public List<Work> getWorkInfo() {
		return workDaoJdbcImpl.selectMany();
	}


	public List<Work> selectMany() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
