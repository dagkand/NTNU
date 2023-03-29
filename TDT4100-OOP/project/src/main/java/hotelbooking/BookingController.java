package hotelbooking;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class BookingController {
	
	private Booking booking;	
	
	private BookingFile fileSupport = new BookingFileSupport();
	
	@FXML
	private TextField name, email;
	
	@FXML
	private DatePicker checkIn, checkOut;
	
	@FXML
	private ComboBox<Integer> numberOfRooms;
	
	@FXML
	private ComboBox<String> room1, room2, room3, room4;
	
	@FXML 
	private Text error;
	
	@FXML
	private TextField filename;
	
	@FXML
	private Text fileNotFoundMessage;
	
	@FXML
	private TextArea receipt;
	
	@FXML
	private Button submit;
	
	
	
	@FXML
	private void initialize() {
		
		booking = new Booking();
		
		//begrensning på 4 rom som kan bookes
		numberOfRooms.setItems(FXCollections.observableArrayList(1, 2, 3, 4));
		
		for (String i: Room.roomTypes) {
			room1.getItems().add(i);
			room2.getItems().add(i);
			room3.getItems().add(i);
			room4.getItems().add(i);
		}
		
		
		/*
		 * Brian (2018) "How to disable past dates in DatePicker for JavaFX (Scenebuilder)" [Source code].
		 * https://stackoverflow.com/questions/48238855/how-to-disable-past-dates-in-datepicker-of-javafx-scene-builder
		 */
		
		//deaktiverer datoer i fortiden for DatePicker
		checkIn.setDayCellFactory(picker -> new DateCell() {
		        public void updateItem(LocalDate date, boolean empty) {
		            super.updateItem(date, empty);
		            LocalDate today = LocalDate.now();
		            setDisable(empty || date.compareTo(today) < 0 );
		        }
		    });
		
		checkOut.setDayCellFactory(picker -> new DateCell() {
	        public void updateItem(LocalDate date, boolean empty) {
	            super.updateItem(date, empty);
	            LocalDate today = LocalDate.now();
	            setDisable(empty || date.compareTo(today) < 0 );
	        }
	    });
		
	}
	
	//antall felter for å velge type rom
	@FXML
	private void selectNumberOfRooms() {
		int n  = numberOfRooms.getValue(); 
		
		if (n == 1) {
			room1.setVisible(true);
			room2.setVisible(false);
			room3.setVisible(false);
			room4.setVisible(false);
		}
		else if (n == 2) {
			room1.setVisible(true);
			room2.setVisible(true);
			room3.setVisible(false);
			room4.setVisible(false);
		}
		else if (n == 3) {
			room1.setVisible(true);
			room2.setVisible(true);
			room3.setVisible(true);
			room4.setVisible(false);
		}
		else if (n == 4) {
			room1.setVisible(true);
			room2.setVisible(true);
			room3.setVisible(true);
			room4.setVisible(true);
		}
	}

    //henter filnavn skrevet i feltet 
    private String getFilename() {
    	return filename.getText();
    }
    
    //skriver booking til fil
	@FXML 
    void saveBooking() {
	   	try {
    		fileSupport.save(getFilename(), booking);
    		fileNotFoundMessage.setVisible(false);
    	} 
	   	catch (FileNotFoundException e) {
    		fileNotFoundMessage.setVisible(true);
    	} 
	   	catch (NullPointerException e) {
    		fileNotFoundMessage.setVisible(true);
    	}
    }
	
	//leser booking fra fil og viser denne på siden
	@FXML
    void loadBooking() {
		try {
			if ("".equals(getFilename())) {
				fileNotFoundMessage.setVisible(true);
			}
			booking = fileSupport.load(getFilename());
	   		fileNotFoundMessage.setVisible(false);
	   		receipt.setText(
	   				"Name: " + booking.getName() 
	   				+ "\nEmail: " + booking.getEmail() 
	   				+ "\nCheck in: " + booking.getCheckIn()
	   				+ "\nCheck out: " + booking.getCheckOut()
	   				+ "\nRooms: " + booking.getBookedRooms() 
	   				+ "\nTotal price: " + booking.getTotalPrice(booking.getCheckIn(), booking.getCheckOut()) + "kr"
	   				);
		}
	   	catch (FileNotFoundException e) {
	   		fileNotFoundMessage.setVisible(true);
		}
	
    }
	
	
	//gjennomfører booking med passende feilhåndtering
	@FXML
	private void confirmBooking(ActionEvent event) throws IOException {
   
    	try {
    	
    	//antall rom er ikke valgt
    	if (numberOfRooms.getValue() == null) {
			error.setText("Must select room for booking");
		}
    	else {
    		error.setText("");
    	}
    		
    	//validerer input for navn, e-post, dato for innsjekk og utsjekk
    	booking.setName(name.getText());
    	booking.setEmail(email.getText()); 
    	booking.setCheckIn(checkIn.getValue());
    	booking.setCheckOut(checkOut.getValue());
    	
    	
     	//legger til valgte rom i listen over rom som er booket
		if (numberOfRooms.getValue() >= 1) {
			booking.addRoom(new Room(room1.getValue()));
		}
		if (numberOfRooms.getValue() >= 2) {
			booking.addRoom(new Room(room2.getValue()));
    	}
    	if (numberOfRooms.getValue() >= 3) {
    		booking.addRoom(new Room(room3.getValue()));
    	}
    	if (numberOfRooms.getValue() >= 4) {
    		booking.addRoom(new Room(room4.getValue()));
    	}
		
    	
    	
		//kvittering 
		receipt.setText(
				"Name: " + name.getText() 
				+ "\nEmail: " + email.getText() 
				+ "\nCheck in: " + checkIn.getValue()
				+ "\nCheck out: " + checkOut.getValue()
				+ "\nRooms: " + booking.getBookedRooms() 
				+ "\nTotal price: " + booking.getTotalPrice(checkIn.getValue(), checkOut.getValue()) + "kr"
				);
		
		
		//felter kan ikke endres etter vellykket booking
		submit.setDisable(true);
		name.setDisable(true);
		email.setDisable(true);
		checkIn.setDisable(true);
		checkOut.setDisable(true);
		numberOfRooms.setDisable(true);
		room1.setDisable(true);
		room2.setDisable(true);
		room3.setDisable(true);
		room4.setDisable(true);
		
		
		}
    	
		catch(IllegalArgumentException e) {
			//passende feilmelding ved ugyldig brukerinput
			error.setText("" + e.getMessage() + "");	
		}
	}
	
	//laster inn siden på nytt 
	@FXML
	private void newBooking(ActionEvent event) throws IOException {
		Parent bookingReceiptParent = FXMLLoader.load(getClass().getResource("HotelBooking.fxml"));
		Scene bookingReceiptScene = new Scene(bookingReceiptParent);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(bookingReceiptScene);
		window.show();
	}
	


}