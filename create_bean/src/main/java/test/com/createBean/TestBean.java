package test.com.createBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean {
	private static final Logger logger = 
			LoggerFactory.getLogger(TestBean.class);

	private String name;
	private String tel;

	public TestBean() {
		logger.info("TestBean()");
		name = "kim";
		tel = "010";
	}

	public TestBean(String name, String tel) {
		logger.info("TestBean(String name,String tel)");
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
