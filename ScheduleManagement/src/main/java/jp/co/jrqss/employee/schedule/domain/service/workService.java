package jp.co.jrqss.employee.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.repository.WorkDao;

@Service
public class WorkService {

	@Autowired
	@Qualifier("WorkDaoJdbcImpl")
	WorkDao dao;

	public List<Work> selectMany(){
		return dao.selectMany();
	}



/*	削除申請用メソッド(使わなければ削除)
 * public boolean deleteOne(int workDate) {
		int rowNumber = dao.deleteOne(workDate);
		boolean result = false;
		if(rowNumber > 0) {
			result = true;
		}
		return result;
	}
*/
}

