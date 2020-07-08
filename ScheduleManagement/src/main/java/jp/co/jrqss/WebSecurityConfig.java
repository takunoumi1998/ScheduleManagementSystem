package jp.co.jrqss;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;

	//ユーザーのIDとパスワードを取得するSQL文
	private static final String USER_SQL = "SELECT employee_id , employee_password , true FROM employee WHERE employee_id = ?";

	//ユーザーIDをもとにユーザーの権限を取得する。
	private static final String ROLE_SQL = "SELECT employee_id , employee_role FROM employee WHERE employee_id = ?";

	/**
	 * 静的リソースのアクセスはセキュリティ対象から除外
	 */
	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/webjars/**","/css/**","/console/**");
//		web.ignoring().antMatchers("/**");
	}

	/**
	 * 直リンクの禁止
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.authorizeRequests()
		.antMatchers("/admin/**").permitAll()//hasRole("ADMIN")
		.antMatchers("/webjars/**").permitAll()
		.antMatchers("/console/**").permitAll()
		.antMatchers("/css/**").permitAll()
		.antMatchers("/login").permitAll()
		.antMatchers("/test").permitAll()
//		.antMatchers("/**").permitAll();
		.anyRequest().authenticated();

		http.exceptionHandling().accessDeniedPage("/accessdeniedpage");

		http
		.formLogin()
			.loginProcessingUrl("/login")
			.loginPage("/login")
			.failureUrl("/login")
			.usernameParameter("id")
			.passwordParameter("password")
			.defaultSuccessUrl("/top",true)
			.and()
			.rememberMe()
			.rememberMeCookieName("login_info")
            .rememberMeParameter("login_keep")
			.tokenValiditySeconds(31536000)
			.and()
			.logout()
			.logoutUrl("/logout")
			.logoutSuccessUrl("/login").permitAll();


		//CSRFとはクロスサイトリクエストフォージェリ対策状態の設定 [無効 Disable : 有効 Enable]
		http.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery(USER_SQL)
			.authoritiesByUsernameQuery(ROLE_SQL)
			.passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
