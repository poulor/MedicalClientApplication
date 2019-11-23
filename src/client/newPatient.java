package client;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class newPatient extends Application
{
	private TextField firstName = new TextField();
	private TextField middleInitial = new TextField();
	private TextField lastName = new TextField();
	private TextField eMail = new TextField();
	private DatePicker dob = new DatePicker();
	ObservableList<String> genders = 
			FXCollections.observableArrayList(
					"Female",
					"Male",
					"Other"
					);
	private ComboBox gender = new ComboBox(genders);
	private TextField address = new TextField();
	private TextField city = new TextField();
	private TextField state = new TextField();
	private TextField zip = new TextField();
	private TextField phone = new TextField();
	
	private Button newPatient = new Button("Create New Patient");
	
	
	@Override
	
	public void start(Stage primaryStage)
	{
		
		middleInitial.setPrefWidth(30);
		middleInitial.setMaxWidth(30); 
		
		GridPane pane = new GridPane();
		pane.setHgap(5);
		pane.setVgap(5);
		pane.setAlignment(Pos.CENTER);
		pane.add(new Label("First Name: "), 0, 0);
		pane.add(firstName, 1, 0);
		pane.add(new Label("MI: "), 2, 0);
		pane.add(middleInitial, 3, 0);
		pane.add(new Label("Last Name: "), 0, 1);
		pane.add(lastName, 1, 1);
		pane.add(new Label("Gender: "), 0, 2);
		pane.add(gender, 1, 2);
		pane.add(new Label("Date of Birth: "), 0, 3);
		pane.add(dob, 1, 3);
		pane.add(new Label("Email: "), 0, 4);
		pane.add(eMail, 1, 4);
		pane.add(new Label("Address: "), 0, 5);
		pane.add(address, 1, 5);
		pane.add(new Label("City: "), 0, 6);
		pane.add(city, 1, 6);
		pane.add(new Label("Zip: "), 0, 7);
		pane.add(zip, 1, 7);
		pane.add(new Label("State: "), 0, 8);
		pane.add(state, 1, 8);
		pane.add(new Label("Phone#: "), 0, 9);
		pane.add(phone, 1, 9);
		pane.add(newPatient, 1,10);
	    GridPane.setHalignment(newPatient, HPos.RIGHT);
	    
	    Scene scene = new Scene(pane, 600, 400);
		primaryStage.setTitle("New Patient Form");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}

