package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainController {
	private Main main;
	@FXML
	private Button inventory;
	@FXML
	private Button sales;
	@FXML
	private Button employees;
	@FXML
	private Button customers;
	@FXML
	private Button projections;
	@FXML
	private TextField Search;
	@FXML
	private Label lblStartDate;
	@FXML
	private Label lblEndDate;
	@FXML
	private DatePicker DPStartDate;
	@FXML
	private DatePicker DPEndDate;
	@FXML
	private SplitMenuButton Timeframe;
	@FXML
	private ImageView Report;
	@FXML
	public void handle(ActionEvent event) {
		if (event.getSource() == inventory) {
			

		}

		if (event.getSource() == sales) {

		}

		if (event.getSource() == employees) {

		}

		if (event.getSource() == customers) {

		}

		if (event.getSource() == projections) {

		}

	}
	@FXML
	private void goInventory() throws IOException{
		main.showInventoryScene();
	}

}
