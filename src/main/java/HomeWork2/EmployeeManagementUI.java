package HomeWork2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeManagementUI {

    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("The Employee Information System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        // Background Color and Layout
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(60, 198, 241));
        panel.setBounds(0, 0, 800, 600);
        frame.add(panel);

        // Title
        JLabel title = new JLabel("The Employee Information System", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setForeground(Color.RED);
        title.setBounds(150, 10, 500, 30);
        panel.add(title);

        // Load Data Button
        JButton loadDataButton = new JButton("Load Data");
        loadDataButton.setForeground(Color.blue);
        loadDataButton.setBounds(30, 50, 120, 30);
        panel.add(loadDataButton);

        // ComboBox for Search
        JComboBox<String> searchComboBox = new JComboBox<>(new String[]{"EID", "Name"});
        searchComboBox.setBounds(170, 50, 80, 30);
        panel.add(searchComboBox);

        // Search Field and Button
        JTextField searchField = new JTextField();
        searchField.setBackground(new Color(17, 234, 20));
        searchField.setBounds(260, 50, 300, 30);
        panel.add(searchField);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(580, 50, 100, 30);
        panel.add(searchButton);

        // Table for Data
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel(new String[]{"EID", "Name", "Surname", "Age"}, 0);
        table.setModel(model);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setBounds(30, 100, 650, 200);
        panel.add(tableScrollPane);

        // Input Fields
        JLabel eidLabel = new JLabel("EID:");
        eidLabel.setBounds(30, 320, 50, 30);
        panel.add(eidLabel);

        JTextField eidField = new JTextField();
        eidField.setBounds(80, 320, 150, 30);
        panel.add(eidField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 360, 50, 30);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(80, 360, 150, 30);
        panel.add(nameField);

        JLabel surnameLabel = new JLabel("Surname:");
        surnameLabel.setBounds(30, 400, 70, 30);
        panel.add(surnameLabel);

        JTextField surnameField = new JTextField();
        surnameField.setBounds(100, 400, 150, 30);
        panel.add(surnameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(30, 440, 50, 30);
        panel.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(80, 440, 150, 30);
        panel.add(ageField);

        // Buttons
        JButton newButton = new JButton("New");
        newButton.setForeground(Color.blue);
        newButton.setBounds(300, 320, 100, 30);
        panel.add(newButton);

        JButton saveButton = new JButton("Save");
        saveButton.setForeground(Color.blue);
        saveButton.setBounds(300, 360, 100, 30);
        panel.add(saveButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setForeground(Color.red);
        deleteButton.setBounds(300, 400, 100, 30);
        panel.add(deleteButton);

        JButton updateButton = new JButton("Update");
        updateButton.setForeground(Color.blue);
        updateButton.setBounds(300, 440, 100, 30);
        panel.add(updateButton);



        // Show Frame
        frame.setVisible(true);

        // Action Listeners
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Example Action: Add row to table
                String eid = eidField.getText();
                String name = nameField.getText();
                String surname = surnameField.getText();
                String age = ageField.getText();

                if (!eid.isEmpty() && !name.isEmpty() && !surname.isEmpty() && !age.isEmpty()) {
                    model.addRow(new Object[]{eid, name, surname, age});
                    eidField.setText("");
                    nameField.setText("");
                    surnameField.setText("");
                    ageField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Example Action: Delete selected row from table
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Example Action: Update selected row in the table
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.setValueAt(eidField.getText(), selectedRow, 0);
                    model.setValueAt(nameField.getText(), selectedRow, 1);
                    model.setValueAt(surnameField.getText(), selectedRow, 2);
                    model.setValueAt(ageField.getText(), selectedRow, 3);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to update!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
