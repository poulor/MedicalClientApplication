import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class loginPage extends Application 
{
	private TextField un = new TextField();
	private TextField pw = new TextField();
	private Button signIn = new Button("Sign In");
	
	@Override
	
	public void start (Stage primaryStage)
	{
		GridPane pane = new GridPane();
		pane.setHgap(5);
		pane.setVgap(5);
		pane.setAlignment(Pos.CENTER);
		pane.add(new Label("Username: "), 0, 0);
		pane.add(un, 1, 0);
		pane.add(new Label("Password: "), 0, 1);
		pane.add(pw, 1, 1);
		pane.add(signIn, 1, 5);
	    GridPane.setHalignment(signIn, HPos.RIGHT);
	    
	    Scene scene = new Scene(pane, 600, 400);
		primaryStage.setTitle("Sign In");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}	
			
}