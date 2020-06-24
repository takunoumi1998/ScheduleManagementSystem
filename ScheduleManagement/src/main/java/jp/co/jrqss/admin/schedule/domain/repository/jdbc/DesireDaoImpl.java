package jp.co.jrqss.admin.schedule.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.schedule.domain.model.Desire;
import jp.co.jrqss.admin.schedule.domain.repository.DesireDao;

@Repository
public class DesireDaoImpl implements DesireDao {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Desire> selectAll() throws DataAccessException {
		//取得した結果を受け取るためのリスト
		List<Map<String,Object>> getList = null;

		//返却用のworkリスト
		List<Desire> desireList = new ArrayList<>();

		//
		Calendar calendar = Calendar.getInstance();

		//カレンダーに今月に2を足した月の初日を設定
		calendar.set(calendar.get(Calendar.YEAR),(calendar.get(Calendar.MONTH)+2),1);
		//2か月後の初日から1を引いて1か月後の末日を設定
		calendar.add(Calendar.DATE, -1);

		//次月の末日と初日をString変数に格納する
		String desireLimitFirst = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+"01";
		String desireLimitLast = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+15;

		try {
			//SQL発行
			getList = jdbc.queryForList("select * from desire where desire_date between ? and ?",desireLimitFirst,desireLimitLast);

			//取得したカラム数だけ繰り返し処理を行う
			for(Map<String,Object> map : getList) {
				//Workのインスタンス生成（初期化）
				Desire desire = new Desire();
				desire.setBuildingId((int)map.get("building_id"));
				desire.setWorkDate((Date)map.get("work_date"));
				desire.setWorkNumber((int)map.get("work_number"));
				desire.setEmployeeId((int)map.get("employee_id"));

				desireList.add(desire);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		return desireList;
	}


}
