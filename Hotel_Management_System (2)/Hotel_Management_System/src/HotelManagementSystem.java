
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

class Customer {
    String name;
    String cnic;
    String phone;
    int days;

    public Customer(String name, String cnic, String phone, int days) {
        this.name = name;
        this.cnic = cnic;
        this.phone = phone;
        this.days = days;
    }
}

public class HotelManagementSystem extends JFrame implements ActionListener {

    JLabel lblTitle;
    JLabel lblName, lblCNIC, lblPhone, lblDays, lblRoom;

    JTextField txtName, txtCNIC, txtPhone, txtDays, txtRoom;

    JButton btnReserve, btnCheck, btnCancel;

    JTextArea outputArea;

    HashMap<Integer, Customer> rooms = new HashMap<>();

    public HotelManagementSystem() {

        setTitle("Hotel Management System");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Fonts
        Font titleFont = new Font("Segoe UI", Font.BOLD, 28);
        Font labelFont = new Font("Segoe UI", Font.BOLD, 20);
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 20);
        Font buttonFont = new Font("Segoe UI", Font.BOLD, 20);

        // Title
        lblTitle = new JLabel("HOTEL MANAGEMENT SYSTEM");
        lblTitle.setFont(titleFont);
        lblTitle.setForeground(new Color(0, 102, 204));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);

        // Labels
        lblName = new JLabel("Customer Name:");
        lblCNIC = new JLabel("CNIC:");
        lblPhone = new JLabel("Phone Number:");
        lblDays = new JLabel("Number of Days:");
        lblRoom = new JLabel("Room Number:");

        lblName.setFont(labelFont);
        lblCNIC.setFont(labelFont);
        lblPhone.setFont(labelFont);
        lblDays.setFont(labelFont);
        lblRoom.setFont(labelFont);

        // Text Fields
        txtName = new JTextField();
        txtCNIC = new JTextField();
        txtPhone = new JTextField();
        txtDays = new JTextField();
        txtRoom = new JTextField();

        txtName.setFont(fieldFont);
        txtCNIC.setFont(fieldFont);
        txtPhone.setFont(fieldFont);
        txtDays.setFont(fieldFont);
        txtRoom.setFont(fieldFont);

        txtName.setPreferredSize(new Dimension(250, 40));
        txtCNIC.setPreferredSize(new Dimension(250, 40));
        txtPhone.setPreferredSize(new Dimension(250, 40));
        txtDays.setPreferredSize(new Dimension(250, 40));
        txtRoom.setPreferredSize(new Dimension(250, 40));

        // Form Panel
        JPanel formPanel = new JPanel();
        formPanel.setBackground(new Color(240, 248, 255));
        formPanel.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(Color.BLUE, 2),
                        "Customer Information"));
        formPanel.setLayout(new GridLayout(5, 2, 10, 10));

        formPanel.add(lblName);
        formPanel.add(txtName);

        formPanel.add(lblCNIC);
        formPanel.add(txtCNIC);

        formPanel.add(lblPhone);
        formPanel.add(txtPhone);

        formPanel.add(lblDays);
        formPanel.add(txtDays);

        formPanel.add(lblRoom);
        formPanel.add(txtRoom);

        // Buttons
        btnReserve = new JButton("Reserve Room");
        btnCheck = new JButton("Check Availability");
        btnCancel = new JButton("Cancel Reservation");

        btnReserve.setFont(buttonFont);
        btnCheck.setFont(buttonFont);
        btnCancel.setFont(buttonFont);

        btnReserve.setBackground(new Color(0, 153, 76));
        btnCheck.setBackground(new Color(0, 102, 204));
        btnCancel.setBackground(new Color(204, 0, 0));

        btnReserve.setForeground(Color.WHITE);
        btnCheck.setForeground(Color.WHITE);
        btnCancel.setForeground(Color.WHITE);

        btnReserve.setFocusPainted(false);
        btnCheck.setFocusPainted(false);
        btnCancel.setFocusPainted(false);

        btnReserve.addActionListener(this);
        btnCheck.addActionListener(this);
        btnCancel.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(230, 230, 230));

        buttonPanel.add(btnReserve);
        buttonPanel.add(btnCheck);
        buttonPanel.add(btnCancel);

        // Output Area
        outputArea = new JTextArea(12, 50);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 18));
        outputArea.setBackground(new Color(245, 245, 245));

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(
                BorderFactory.createTitledBorder("Reservation Status"));

        // Top Panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.WHITE);
        topPanel.add(lblTitle, BorderLayout.NORTH);
        topPanel.add(formPanel, BorderLayout.CENTER);

        // Add Components
        add(topPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            int roomNo = Integer.parseInt(txtRoom.getText());

            if (e.getSource() == btnReserve) {

                String name = txtName.getText();
                String cnic = txtCNIC.getText();
                String phone = txtPhone.getText();
                int days = Integer.parseInt(txtDays.getText());

                if (name.isEmpty() || cnic.isEmpty() ||
                        phone.isEmpty() || txtDays.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(this,
                            "Please fill all fields.");
                    return;
                }

                if (rooms.containsKey(roomNo)) {

                    outputArea.append(
                            "Room " + roomNo +
                                    " is already reserved.\n\n");

                } else {

                    Customer customer =
                            new Customer(name, cnic, phone, days);

                    rooms.put(roomNo, customer);

                    outputArea.append(
                            "=================================\n" +
                                    "Reservation Successful\n" +
                                    "=================================\n" +
                                    "Room Number : " + roomNo + "\n" +
                                    "Customer    : " + name + "\n\n");
                }
            }

            else if (e.getSource() == btnCheck) {

                if (rooms.containsKey(roomNo)) {

                    Customer c = rooms.get(roomNo);

                    outputArea.append(
                            "=================================\n" +
                                    "ROOM RESERVED\n" +
                                    "=================================\n" +
                                    "Room Number : " + roomNo + "\n" +
                                    "Name        : " + c.name + "\n" +
                                    "CNIC        : " + c.cnic + "\n" +
                                    "Phone       : " + c.phone + "\n" +
                                    "Days        : " + c.days + "\n\n");

                } else {

                    outputArea.append(
                            "Room " + roomNo +
                                    " is AVAILABLE.\n\n");
                }
            }

            else if (e.getSource() == btnCancel) {

                if (rooms.containsKey(roomNo)) {

                    rooms.remove(roomNo);

                    outputArea.append(
                            "=================================\n" +
                                    "Reservation Cancelled\n" +
                                    "=================================\n" +
                                    "Room Number : " + roomNo + "\n\n");

                } else {

                    outputArea.append(
                            "Room " + roomNo +
                                    " is not reserved.\n\n");
                }
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Room Number and Number of Days must be numeric.");
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new HotelManagementSystem());
    }
}

