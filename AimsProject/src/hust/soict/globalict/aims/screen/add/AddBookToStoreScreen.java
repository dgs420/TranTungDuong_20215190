package hust.soict.globalict.aims.screen.add;


import java.util.ArrayList;
import java.util.Arrays;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.globalict.aims.screen.StoreScreen;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.Book;


public class AddBookToStoreScreen extends AddItemToStoreScreen {
    public AddBookToStoreScreen(Store store) {
        super(store);
    }

    protected JPanel createCenter() {
    	JPanel center = new JPanel();
        center.setLayout(new GridLayout(6, 2));

        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField();
        JLabel categoryLabel = new JLabel("Category:");
        JTextField categoryField = new JTextField();
        JLabel costLabel = new JLabel("Cost:");
        JTextField costField = new JTextField();
        JLabel authorsLabel = new JLabel("Authors (comma-separated):");
        JTextField authorsField = new JTextField();

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String category = categoryField.getText();
                float cost = Float.parseFloat(costField.getText());
                ArrayList<String> authors = new ArrayList<>(Arrays.asList(authorsField.getText().split(",")));

                Book newBook;

				newBook = new Book(title, category, authors, cost);
				store.addMedia(newBook);
				JOptionPane.showMessageDialog(null, "Book added successfully!");

               
            }
        });

        center.add(titleLabel);
        center.add(titleField);
        center.add(categoryLabel);
        center.add(categoryField);
        center.add(costLabel);
        center.add(costField);
        center.add(authorsLabel);
        center.add(authorsField);
        center.add(new JLabel()); // Empty label to align the button to the right
        center.add(addButton);

        return center;

    }
}
