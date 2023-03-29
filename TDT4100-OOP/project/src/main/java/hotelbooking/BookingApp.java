package hotelbooking;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BookingApp extends Application {

	@Override
    public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("App.fxml"));
	    primaryStage.setTitle("Hotel Booking System");
	    primaryStage.setScene(new Scene(parent));
	    primaryStage.show();
	}

	public static void main(String[] args) {
		launch(BookingApp.class, args);
	}

}