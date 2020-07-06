package jp.co.jrqss.employee.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.employee.schedule.domain.model.Desire;
import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.repository.WorkDao;

@Service
public class WorkerService {

	@Autowired
	WorkDao workdao;

	//全件取得
	public List<Work> selectMany() {
		return workdao.selectMany();
	}

	//1件取得
	public Work selectOne(String workDate) {
		return workdao.selectOne(workDate);
	}

	//1件insert
	public boolean insert(Desire desire) {
		int rowNumber = workdao.insertOne(desire);
		boolean result = false;
		if(rowNumber>0) {
			result = true;
		}

		return result;

	}

}
