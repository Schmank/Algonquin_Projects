package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


//Can add more style to it with CSS sheet
//Just early prototype

/* -Need to go over design more thoroughly with what fields we need exactly
 * -Still need to integrate CSS into design
 * -Need a results tab for report
 * -Results tab should have button for graph generation [If needed]
 * -TextFields should have prompt messages
 * -Make a "Clear" button that erases all text entered into field
 * -Search history?
 * -Make it far less ugly*/

public class Main extends Application {


	public void start(Stage primaryStage) {
		primaryStage.setTitle("Report");

		BorderPane root = new BorderPane();

		GridPane grid=new GridPane();
		//grid.setAlignment(Pos.CENTER);
		grid.setHgap(10); //Hgap sets horizontal space between
		grid.setHgap(10);
		grid.setVgap(10); //Vgap sets vertical space between
		grid.setPadding(new Insets(25,25,25,25));

		Label custAccouont=new Label("Customer Account:");
		grid.add(custAccouont,0,1);
		TextField custAccountField=new TextField();
		grid.add(custAccountField,1,1);

		Label inventory=new Label("Inventory:");
		grid.add(inventory,0,2);
		TextField inventoryField=new TextField();
		grid.add(inventoryField,1,2);

		Label Query3=new Label("Query 3:");
		grid.add(Query3,0,3);
		TextField Query3Field=new TextField();
		grid.add(Query3Field,1,3);

		Label Query4=new Label("Query 4:");
		grid.add(Query4,0,4);
		TextField Query4Field=new TextField();
		grid.add(Query4Field,1,4);


		//Create buttons and horizontal box. (Done after fields so actionEvents work)
		HBox hbox=new HBox();
		hbox.setPadding(new Insets(15,12,15,12));
		hbox.setSpacing(10);
		hbox.setStyle("-fx-background-color: #336699");

		Button submit=new Button("Submit");
		submit.setPrefSize(100,20);
		submit.setOnAction(new EventHandler<ActionEvent>(){ //Search through database
			public void handle(ActionEvent e){
				SQLconnect query=new SQLconnect();
				String custAccount=custAccountField.getText();
				String inventory=inventoryField.getText();
				String query3=Query3Field.getText();
				String query4=Query3Field.getText();
				query.search(custAccount,inventory,query3,query4);
			}
		});

		Button cancel=new Button("Cancel");
		submit.setPrefSize(100,20);
		cancel.setOnAction(new EventHandler<ActionEvent>() {  //Sets action event for cancel button to exit w/status of 0
			public void handle(ActionEvent e){
				System.exit(0);
			}
		});

		hbox.getChildren().addAll(submit,cancel);




		root.setBottom(hbox);
		root.setLeft(grid);
//		addStackPane(hbox); //add stack to HBox in top region
//		root.setCenter(addGridPane);
//		root.setRight(addFlowPane);

		Scene scene = new Scene(root,450,300);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}




}
