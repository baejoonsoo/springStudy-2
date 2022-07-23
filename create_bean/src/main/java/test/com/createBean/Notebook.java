package test.com.createBean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Notebook {
	private static final Logger logger = LoggerFactory.getLogger(Notebook.class);

	private String model_name;
	private int price;

	public Notebook() {
		logger.info("NoteBook()");
		model_name = "samSong998";
		price = 50000;
	}

	public Notebook(String model_name, int price) {
		logger.info("NoteBook()");
		this.model_name = model_name;
		this.price = price;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

