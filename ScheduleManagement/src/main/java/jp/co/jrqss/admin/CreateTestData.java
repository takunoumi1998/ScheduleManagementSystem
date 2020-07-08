package jp.co.jrqss.admin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateTestData {

	@Autowired
	JdbcTemplate jdbc;

	@GetMapping("/test")
	public String getTest() {
		BufferedReader br = null;
		String str;
		List<String[]> jushoList = new ArrayList<String[]>();
		Random rd = new Random();
		int count = 0;
		int count2 = 0;

		try {
			//住所CSVの読み込み
			InputStream is = new ClassPathResource("static/csv/jusho.csv").getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			while((str = br.readLine()) != null) {
				String[] jusho  = str.split(",");
				jushoList.add(jusho);
				count++;
			}

			//従業員CSVの読み込み
			is = new ClassPathResource("static/csv/employee.csv").getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);


			jdbc.update("delete from employee where employee_role = 'ROLE_USER'");

			while((str = br.readLine()) != null) {
				String[] employee  = str.split(",");
				String[] jusho = jushoList.get(rd.nextInt(count));
				int rowNumber = jdbc.update("insert into employee(employee_name,"
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
						,employee[0]
						,employee[1]
						,rd.nextInt(10)
						,rd.nextInt(2)
						,rd.nextInt(2)
						,rd.nextInt(2)
						,rd.nextInt(2)
						,rd.nextInt(2)
						,rd.nextInt(2)
						,rd.nextInt(2)
						,jusho[4]
						,jusho[7]+jusho[9]
						,employee[3]
						,employee[2]
						,""
						);
				System.out.println(rowNumber);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}

		return "/admin/top";
	}
}
