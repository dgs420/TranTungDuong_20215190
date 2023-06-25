package hust.soict.globalict.aims.screen;
import java.awt.*;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;

public class MediaStore extends JPanel{
	private Media media;
	private Cart cart; 
	
	public MediaStore(Media media,Cart cart) {
		// TODO Auto-generated constructor stub
		this.media = media;
		this.cart = cart;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(""+media.getCost());
		title.setFont(new Font(title.getFont().getName(),Font.PLAIN,20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton addBtn = new JButton("Add to cart");
		
		addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
					cart.addMedia(media);
				
            }
        });
		container.add(addBtn);
		
		if(media instanceof Playable) {
			JButton playBtn = new JButton("Play");
			playBtn.addActionListener(new btnListener());
			container.add(playBtn);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createHorizontalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private class btnListener implements ActionListener {

		@Override
		 public void actionPerformed(ActionEvent e) {
	        JDialog dialog = new JDialog();
	        dialog.setTitle("Playable Media");

	        JPanel panel = new JPanel();
	        panel.add(new JLabel("Playing " + media.getTitle()));
	        dialog.add(panel);

	        dialog.setSize(300, 200); 
	        dialog.setLocationRelativeTo(null); 
	        dialog.setModal(true); 
	        dialog.setVisible(true); 
	    } 
		
	}
}
