package hust.soict.globalict.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class CartScreen extends JFrame {
	private Cart cart;

	public CartScreen(Cart cart) {
		super();
		
		this.cart = cart;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/globalict/aims/screen/Cart.fxml"));
					CartScreenController controller = new CartScreenController(cart);

					loader.setController(controller);
					
					Parent root = loader.load();	
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass()
				.getResource("/hust/soict/globalict/aims/screen/Cart.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Painter");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		
	    // Create a new Cart
	    Cart cart = new Cart();

	    // Add some media items to the cart
	    DigitalVideoDisc dvd = new DigitalVideoDisc("Harry Potter", "Animation", "Roger Allers", 87, 19.95f);
	    cart.addMedia(dvd);

	    Book book = new Book("Harry Potter", "Science Fiction", 9.9f);
	    cart.addMedia(book);

	    CompactDisc cd = new CompactDisc("Greatest Hits", "Rock", 11f, "Journey", "Michael Jackson");
	    cart.addMedia(cd);
	    
	    
	    new CartScreen(cart);
        
	    
	}
}