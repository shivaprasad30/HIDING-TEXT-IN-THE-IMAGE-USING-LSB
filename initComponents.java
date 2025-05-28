import java.awt.*;
import javax.swing.*;

public class MenuFrame extends JFrame {

    private JButton encodeButton;
    private JButton decodeButton;
    private JLabel titleLabel;
    private JLabel footerLabel;
    private JPanel headerPanel, buttonPanel, footerPanel;

    public MenuFrame() {
        initComponents();
    }

    private void initComponents() {
        // Set frame properties
        setTitle("Image Steganography");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(720, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false);

        // Header Panel
        headerPanel = new JPanel();
        headerPanel.setBackground(new Color(33, 33, 33));
        headerPanel.setPreferredSize(new Dimension(getWidth(), 90));
        titleLabel = new JLabel("Image Steganography", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
        titleLabel.setForeground(Color.WHITE);
        headerPanel.setLayout(new BorderLayout());
        headerPanel.add(titleLabel, BorderLayout.CENTER);

        // Button Panel
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(245, 245, 245));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50, 150, 50, 150));

        encodeButton = new JButton("🔒 ENCODE");
        decodeButton = new JButton("🔓 DECODE");

        styleButton(encodeButton, new Color(0, 153, 204), new Color(0, 123, 180));
        styleButton(decodeButton, new Color(0, 204, 153), new Color(0, 170, 130));

        encodeButton.addActionListener(evt -> new Encryption().setVisible(true));
        decodeButton.addActionListener(evt -> new Decryption().setVisible(true));

        buttonPanel.add(encodeButton);
        buttonPanel.add(Box.createVerticalStrut(30)); // Spacer
        buttonPanel.add(decodeButton);

        // Footer Panel
        footerPanel = new JPanel();
        footerPanel.setBackground(new Color(60, 63, 65));
        footerLabel = new JLabel("Designed and Developed by \"PAVAN SP\"", SwingConstants.CENTER);
        footerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        footerLabel.setForeground(Color.LIGHT_GRAY);
        footerPanel.setPreferredSize(new Dimension(getWidth(), 50));
        footerPanel.setLayout(new BorderLayout());
        footerPanel.add(footerLabel, BorderLayout.CENTER);

        // Add panels to frame
        add(headerPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
    }

    private void styleButton(JButton button, Color bgColor, Color hoverColor) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 24));
        button.setForeground(Color.WHITE);
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Hover effect
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(hoverColor);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(bgColor);
            }
        });
    }

    public static void main(String[] args) {
        // Optional: Set a nicer look and feel
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // default L&F will be used
        }

        SwingUtilities.invokeLater(() -> {
            new MenuFrame().setVisible(true);
        });
    }
}
