package jp.co.jrqss.admin.schedule.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.schedule.Form.SelectForm;
import jp.co.jrqss.admin.schedule.domain.model.Work;
import jp.co.jrqss.admin.schedule.domain.repository.WorkDao;

@Repository
public class WorkDaoImpl implements WorkDao{
	@Autowired
	JdbcTemplate jdbc;

	List<Work> workList = new ArrayList<Work>();
	List<Map<String,Object>> getList = null;

	@Override
	public List<Work> selectAll(){
		workList = new ArrayList<Work>();
		getList = null;

		try {
			//SQL発行
			getList = jdbc.queryForList("SELECT * FROM work");

			//取得したカラム数だけ繰り返し処理を行う
			for(Map<String,Object> map : getList) {
				//Workのインスタンス生成（初期化）
				Work work = new Work();
				work.setWorkId((int)map.get("work_id"));
				work.setBuildingId((int)map.get("building_id"));
				work.setEmployeeId((int)map.get("employee_id"));
				work.setWorkNumber((int)map.get("work_number"));
				work.setWorkWeek((int)map.get("work_week"));
				work.setWorkDay((int)map.get("work_day"));
				work.setWorkDate((Date)map.get("work_date"));

				workList.add(work);
			}
		}catch(Exception e) {

		}

		return workList;
	}

	public List<Work> getNextMonthDate(){

		workList = new ArrayList<Work>();
		getList = null;

		//カレンダー生成
		Calendar calendar = Calendar.getInstance();

		//カレンダーに今月に2を足した月の初日を設定
		calendar.set(calendar.get(Calendar.YEAR),(calendar.get(Calendar.MONTH)+2),1);
		//2か月後の初日から1を引いて1か月後の末日を設定
		calendar.add(Calendar.DATE, -1);

		//次月の末日と初日をString変数に格納する
		String nextMonthLastDay = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DATE);
		String nextMonthFirstDay = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+1;

		//カレンダーに1か月後の初日を設定
		calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),1);
		//次月の初日から1を引いて今月の末日を設定
		calendar.add(Calendar.DATE, -1);

		//今月の末日と初日をString変数に格納する
		String thisMonthLastDay = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DATE);
		String thisMonthFirstDay = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+1;

		try {
			//SQL発行
			getList = jdbc.queryForList("SELECT * FROM work WHERE work_date BETWEEN ? AND ?",nextMonthFirstDay,nextMonthLastDay);


			int count = 0;
			//取得したカラム数だけ繰り返し処理を行う
			for(Map<String,Object> map : getList) {
				count++;
				//Workのインスタンス生成（初期化）
				Work work = new Work();
				work.setBuildingId((int)map.get("building_id"));
				work.setEmployeeId((int)map.get("employee_id"));
				work.setWorkNumber((int)map.get("work_number"));
				work.setWorkWeek((int)map.get("work_week"));
				work.setWorkDay((int)map.get("work_day"));
				work.setWorkDate((Date)map.get("work_date"));

				workList.add(work);
			}

			if(count == 0) {
				workList = new ArrayList<Work>();
				//SQL発行
				getList = jdbc.queryForList("SELECT * FROM work WHERE work_date BETWEEN ? AND ?",thisMonthFirstDay,thisMonthLastDay);

				//取得したカラム数だけ繰り返し処理を行う
				for(Map<String,Object> map : getList) {
					//Workのインスタンス生成（初期化）
					Work work = new Work();
					work.setBuildingId((int)map.get("building_id"));
					work.setEmployeeId((int)map.get("employee_id"));
					work.setWorkNumber((int)map.get("work_number"));
					work.setWorkWeek((int)map.get("work_week"));
					work.setWorkDay((int)map.get("work_day"));
					work.setWorkDate((Date)map.get("work_date"));

					workList.add(work);
				}
			}
		}catch(Exception e) {

		}

		return workList;
	}

	public void insert(SelectForm selectForm) {
		for(String selected : selectForm.getSelected()) {
			String contents[] = selected.split(",",0);

			if(contents[1].equals("none")) {
				try {
					int rowNumber = jdbc.update("DELETE FROM work WHERE building_id = ? AND work_number = ?  AND work_date = ? ",
							contents[0],contents[2],contents[5]);
					if(rowNumber > 0) {
						System.out.println("通過"+rowNumber);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				try {
					int rowNumber = jdbc.update("INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(?,?,?,?,?,?)",
							contents[0],contents[1],contents[2],contents[3],contents[4],contents[5]);
				}catch(ArrayIndexOutOfBoundsException e) {

				}catch(Exception e) {
					try {
						int number = jdbc.update("UPDATE work SET employee_id = ? WHERE building_id = ? AND work_number = ? AND work_date = ?",contents[1],contents[0],contents[2],contents[5]);
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		}
	}
}
