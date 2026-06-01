package GridPane;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;


public class GridPaneDemo extends Application {
	public void start(Stage stage)
	{
		GridPane gp=new GridPane();
		Button b1=new Button("one");
		Button b2=new Button("two");
		gp.add(b1, 1, 1);
		gp.add(b2, 1, 2);
		b1.setOnAction(e->{
			
		});
		Scene sc=new Scene(gp,240,100);
		stage.setScene(sc);
		stage.show();
	}
	public static void main(String a[])
	{
		launch(a);
	}

}
