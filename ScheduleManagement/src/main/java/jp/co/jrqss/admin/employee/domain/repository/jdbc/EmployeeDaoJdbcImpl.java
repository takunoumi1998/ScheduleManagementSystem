package jp.co.jrqss.admin.employee.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.employee.domain.model.Employee;
import jp.co.jrqss.admin.employee.domain.repository.EmployeeDao;
import jp.co.jrqss.admin.employee.form.SearchForm;

@Repository
public class EmployeeDaoJdbcImpl implements EmployeeDao{

	@Autowired
	JdbcTemplate jdbc;

	//名前検索
	@Override
	public List<Employee> findByName(SearchForm searchForm){
		//employeeテーブルからデータを取得
				List<Map<String,Object>>getList=jdbc.queryForList("select * from employee where employee_name like ?","%"+searchForm.getSearchName()+"%");
				//結果返却用の変数
				List<Employee>employeeList=new ArrayList<>();

				for(Map<String,Object>map:getList) {

					Employee employee=new Employee();

					employee.setEmployee_Id((int)map.get("employee_id"));
					employee.setEmployee_Name((String)map.get("employee_name"));
					employee.setDesire_Days((int)map.get("desire_days"));
					employee.setEmployee_Monday((boolean)map.get("employee_monday"));
					employee.setEmployee_Tuesday((boolean)map.get("employee_tuesday"));
					employee.setEmployee_Wednesday((boolean)map.get("employee_wednesday"));
					employee.setEmployee_Thursday((boolean)map.get("employee_thursday"));
					employee.setEmployee_Friday((boolean)map.get("employee_friday"));
					employee.setEmployee_Saturday((boolean)map.get("employee_saturday"));
					employee.setEmployee_Sunday((boolean)map.get("employee_sunday"));
					employee.setEmployee_Ad_Number((String)map.get("employee_ad_number"));
					employee.setEmployee_Address((String)map.get("employee_address"));
					employee.setEmployee_Phone_Number((String)map.get("employee_phone_number"));
					employee.setEmployee_Mail((String)map.get("employee_mail"));

					//結果返却用のリストに返却
					employeeList.add(employee);
				}

				return employeeList;
	}

	//住所検索
	public List<Employee> findByAddress(SearchForm searchForm){

		List<Map<String,Object>>getList=jdbc.queryForList("select * from employee where employee_address like ?","%"+searchForm.getSearchAddress()+"%");

		List<Employee>employeeList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			Employee employee=new Employee();

			employee.setEmployee_Id((int)map.get("employee_id"));
			employee.setEmployee_Name((String)map.get("employee_name"));
			employee.setDesire_Days((int)map.get("desire_days"));
			employee.setEmployee_Monday((boolean)map.get("employee_monday"));
			employee.setEmployee_Tuesday((boolean)map.get("employee_tuesday"));
			employee.setEmployee_Wednesday((boolean)map.get("employee_wednesday"));
			employee.setEmployee_Thursday((boolean)map.get("employee_thursday"));
			employee.setEmployee_Friday((boolean)map.get("employee_friday"));
			employee.setEmployee_Saturday((boolean)map.get("employee_saturday"));
			employee.setEmployee_Sunday((boolean)map.get("employee_sunday"));
			employee.setEmployee_Ad_Number((String)map.get("employee_ad_number"));
			employee.setEmployee_Address((String)map.get("employee_address"));
			employee.setEmployee_Phone_Number((String)map.get("employee_phone_number"));
			employee.setEmployee_Mail((String)map.get("employee_mail"));

			//結果返却用のリストに返却
			employeeList.add(employee);
		}

		return employeeList;
	}

	//1件登録
	@Override
	public int insertOne(Employee employee)throws DataAccessException{

		int rowNumber=jdbc.update("insert into employee(employee_name,"

				+"employee_adana,"
				+"desire_days,"
				+"employee_monday,"
				+"employee_tuesday,"
				+"employee_wednesday,"
				+"employee_thursday,"
				+"employee_friday,"
				+"employee_saturday,"
				+"employee_sunday,"
				+"employee_ad_number,"
				+"employee_address,"
				+"employee_phone_number,"
				+"employee_mail,"
				+"employee_bikou)"
				+"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
				,employee.getEmployee_Name()
				,employee.getEmployee_Adana()
				,employee.getDesire_Days()
				,employee.isEmployee_Monday()
				,employee.isEmployee_Tuesday()
				,employee.isEmployee_Wednesday()
				,employee.isEmployee_Thursday()
				,employee.isEmployee_Friday()
				,employee.isEmployee_Saturday()
				,employee.isEmployee_Sunday()
				,employee.getEmployee_Ad_Number()
				,employee.getEmployee_Address()
				,employee.getEmployee_Phone_Number()
				,employee.getEmployee_Mail()
				,employee.getEmployee_Bikou());

		//System.out.println("DaoImplからのすうちは"+rowNumber+"です");
		return rowNumber;
	}

	@Override
	public List<Employee>selectMany()throws DataAccessException{
		//employeeテーブルからデータを取得
		List<Map<String,Object>>getList=jdbc.queryForList("select * from employee");
		//結果返却用の変数
		List<Employee>employeeList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			Employee employee=new Employee();

			employee.setEmployee_Id((int)map.get("employee_id"));
			employee.setEmployee_Name((String)map.get("employee_name"));
			employee.setEmployee_Adana((String)map.get("employee_adana"));
			employee.setDesire_Days((int)map.get("desire_days"));
			employee.setEmployee_Monday((boolean)map.get("employee_monday"));
			employee.setEmployee_Tuesday((boolean)map.get("employee_tuesday"));
			employee.setEmployee_Wednesday((boolean)map.get("employee_wednesday"));
			employee.setEmployee_Thursday((boolean)map.get("employee_thursday"));
			employee.setEmployee_Friday((boolean)map.get("employee_friday"));
			employee.setEmployee_Saturday((boolean)map.get("employee_saturday"));
			employee.setEmployee_Sunday((boolean)map.get("employee_sunday"));
			employee.setEmployee_Ad_Number((String)map.get("employee_ad_number"));
			employee.setEmployee_Address((String)map.get("employee_address"));
			employee.setEmployee_Phone_Number((String)map.get("employee_phone_number"));
			employee.setEmployee_Mail((String)map.get("employee_mail"));
			employee.setEmployee_Bikou((String)map.get("employee_bikou"));

			//結果返却用のリストに返却
			employeeList.add(employee);
		}

		//System.out.println(employeeList);
		return employeeList;

	}

	//1件取得　queryForMapを使う
	@Override
	public Employee selectOne(int employee_Id)throws DataAccessException{
		Map<String,Object>map=jdbc.queryForMap("select*from employee "+" where employee_id=? ",employee_Id);


		//結果返却用の変数
		Employee employee=new Employee();



		//結果返却用の変数にセットする　1件なのでリストは使わない
		employee.setEmployee_Id((int)map.get("employee_id"));
		employee.setEmployee_Name((String)map.get("employee_name"));
		employee.setEmployee_Adana((String)map.get("employee_adana"));
		employee.setDesire_Days((int)map.get("desire_days"));
		employee.setEmployee_Monday((boolean)map.get("employee_monday"));
		employee.setEmployee_Tuesday((boolean)map.get("employee_tuesday"));
		employee.setEmployee_Wednesday((boolean)map.get("employee_wednesday"));
		employee.setEmployee_Thursday((boolean)map.get("employee_thursday"));
		employee.setEmployee_Friday((boolean)map.get("employee_friday"));
		employee.setEmployee_Saturday((boolean)map.get("employee_saturday"));
		employee.setEmployee_Sunday((boolean)map.get("employee_sunday"));
		employee.setEmployee_Ad_Number((String)map.get("employee_ad_number"));
		employee.setEmployee_Address((String)map.get("employee_address"));
		employee.setEmployee_Phone_Number((String)map.get("employee_phone_number"));
		employee.setEmployee_Mail((String)map.get("employee_mail"));
		employee.setEmployee_Bikou((String)map.get("employee_bikou"));


		return employee;
	}

	/*1件更新*/
	@Override
	public int updateOne(Employee employee)throws DataAccessException{

		int rowNumber=jdbc.update("update employee "
				+" set "
				+" employee_name=?, "
				+" employee_adana=?, "
				+" desire_days=?,"
				+" employee_monday=?,"
				+" employee_tuesday=?,"
				+" employee_wednesday=?,"
				+" employee_thursday=?,"
				+" employee_friday=?,"
				+" employee_saturday=?,"
				+" employee_sunday=?,"
				+" employee_ad_number=?,"
				+" employee_address=?,"
				+" employee_phone_number=?,"
				+" employee_mail = ?,"
				+" employee_bikou=? "
				+" where employee_id = ? "
				,employee.getEmployee_Name()
				,employee.getEmployee_Adana()
				,employee.getDesire_Days()
				,employee.isEmployee_Monday()
				,employee.isEmployee_Tuesday()
				,employee.isEmployee_Wednesday()
				,employee.isEmployee_Thursday()
				,employee.isEmployee_Friday()
				,employee.isEmployee_Saturday()
				,employee.isEmployee_Sunday()
				,employee.getEmployee_Ad_Number()
				,employee.getEmployee_Address()
				,employee.getEmployee_Phone_Number()
				,employee.getEmployee_Mail()
				,employee.getEmployee_Bikou()
				,employee.getEmployee_Id()
				);

		return rowNumber;
	}

	/*1件削除*/
	@Override
	public int deleteOne(int employee_Id)throws DataAccessException{

		int rowNumber=jdbc.update("delete from work where employee_id=?",employee_Id);
		rowNumber=jdbc.update("delete from desire where employee_id=?",employee_Id);
		rowNumber=jdbc.update("delete from employee where employee_id=?",employee_Id);

		return rowNumber;
	}


}








