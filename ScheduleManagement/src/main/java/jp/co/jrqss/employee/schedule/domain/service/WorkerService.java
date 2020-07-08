package jp.co.jrqss.employee.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.employee.schedule.domain.model.DesireForm;
import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.repository.WorkDao;

@Service
public class WorkerService {

	@Autowired
	WorkDao workdao;

	//全件取得
	/*
	 * IDなどに対応したデータを取得するときはselectManyの引数に記載（今回ならemployee_id）
	 * 戻り値でも最後に引数と同じものを（そこにはデータ型は不要）
	 */
	public List<Work> selectMany(int employeeId) {
		return workdao.selectMany(employeeId);
	}

	//1件取得
	/*
	 * IDなどに対応したデータを取得するときはselectManyの引数に記載（今回ならwork_date）
	 * 戻り値でも最後に引数と同じものを（そこにはデータ型は不要）
	 */
	public Work selectOne(String workDate,String employeeId) {
		return workdao.selectOne(workDate,employeeId);
	}

	//1件insert
	public boolean insert(DesireForm form) {
		int rowNumber = workdao.insertOne(form);
		boolean result = false;
		if(rowNumber>0) {
			result = true;
		}

		return result;

	}

}
