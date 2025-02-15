import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border; 
class VentanaInicio extends JFrame{
	public VentanaInicio() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setTitle("Layout NULO"); 
		setSize(800, 580);  
		setLocationRelativeTo(null); 	
		JLabel txt1 = new JLabel("<html>The <b>Classic Form</b> includes all visible fields for<br>this list.<br><br><font"
				+ " size='4'><i>Form options</i></font><br><br>Include the following");
		txt1.setBounds(10, 10, 350, 100);
		add(txt1); 
		
		JCheckBox checkbox1 = new JCheckBox(" a title for your form"); 
		checkbox1.setBounds(3, 110, 160, 20); 
		add(checkbox1); 
		
		JTextField txtField1 = new JTextField(15);
		txtField1.setBounds(7, 135, 308, 30); 
		add(txtField1); 
		
		ButtonGroup gp = new ButtonGroup(); 
		JRadioButton radio1 = new JRadioButton(" only required fields"); 
		radio1.setBounds(4, 190, 158, 30); 
		add(radio1); 
		gp.add(radio1);  
		
		JRadioButton radio2 = new JRadioButton(" all fields"); 
		radio2.setBounds(4, 210, 100, 30); 
		add(radio2); 
		gp.add(radio2);
		
		JLabel txt2 = new JLabel("(edit required fields in the form builder)");
		txt2.setBounds(25, 230, 350, 20);
		add(txt2); 
		
		JCheckBox checkbox2 = new JCheckBox("interest group fields"); 
		checkbox2.setBounds(3, 300, 200, 20);
		add(checkbox2); 
	
		JCheckBox checkbox3 = new JCheckBox("required field indicators"); 
		checkbox3.setBounds(3, 320, 200, 20);
		add(checkbox3); 
		
		JLabel txt3 = new JLabel("Set form width"); 
		txt3.setBounds(11, 350, 100, 20); 
		add(txt3); 
		
		JTextField txtField2 = new JTextField(); 
		txtField2.setBounds(7, 370, 308, 30); 
		add(txtField2); 
		
		JLabel txt4 = new JLabel("Enhance your form");
		txt4.setBounds(11, 405, 150, 20); 
		add(txt4); 
		
		JCheckBox checkbox4 = new JCheckBox("<html>enlace <b>evil</b> popup mode"); 
		checkbox4.setBounds(3, 425, 200, 20);
		add(checkbox4); 
		
		JCheckBox checkbox5 = new JCheckBox("<html>disable all <b>JavaScript</b>"); 
		checkbox5.setBounds(3, 450, 200, 20);
		add(checkbox5); 
		
		JCheckBox checkbox6 = new JCheckBox("include archive link"); 
		checkbox6.setBounds(3, 475, 200, 20);
		add(checkbox6); 
		
		JCheckBox checkbox7 = new JCheckBox("include MonkeyRewards link"); 
		checkbox7.setBounds(3, 500, 300, 20);
		add(checkbox7); 
	
		JPanel panel1 = new JPanel(); 
		panel1.setLayout(null); 
		panel1.setBounds(350, 10, 400, 250); 
		panel1.setBorder(BorderFactory.createTitledBorder("Preview")); 
		
		JLabel txtemail = new JLabel("Email Address *"); 
		txtemail.setBounds(10, 30, 150, 20);  
		panel1.add(txtemail); 
		
		JTextField emailField = new JTextField(); 
		emailField.setBounds(10, 50, 280, 25); 
		panel1.add(emailField); 
		
		JLabel firstNameLabel = new JLabel("First Name"); 
	    firstNameLabel.setBounds(10, 80, 150, 20); 
	    panel1.add(firstNameLabel); 
	        
	    JTextField firstNameField = new JTextField(); 
	    firstNameField.setBounds(10, 100, 280, 25); 
	    panel1.add(firstNameField); 
	        
	    JLabel lastNameLabel = new JLabel("Last Name"); 
	    lastNameLabel.setBounds(10, 130, 150, 20); 
	    panel1.add(lastNameLabel); 
	        
	    JTextField lastNameField = new JTextField(); 
	    lastNameField.setBounds(10, 150, 280, 25); 
	    panel1.add(lastNameField); 
	    
	    ImageIcon icono = new ImageIcon("/Users/josesanchez/Desktop/subadlfjalsdf.png"); 
	    Image img = icono.getImage().getScaledInstance(145, 35, Image.SCALE_SMOOTH); 
	    ImageIcon iconoEscalado = new ImageIcon(img); 
	    JButton subscribebtn = new JButton(iconoEscalado);
	    subscribebtn.setBounds(10, 190, 140, 30);
	    panel1.add(subscribebtn);
	    
	    add(panel1); 
	    
	    JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(350, 270, 400, 250);
        panel2.setBorder(BorderFactory.createTitledBorder("Copy/pase onto your site"));
        JTextArea textArea = new JTextArea();
        textArea.setText("</form>\n</div>\n<script type='text/javascript' src='//s3.amazonaws.com/downloads.mailchimp.com/js/mc-validate.js'></script>\n"
                + "<script type='text/javsscript'>(function($){window.fnames = new\n"
                + "Array(); window.ftypes = new\n"
                + "Array(); fnames[0]='EMAIL';ftypes[0]='email',fnames[1]='FNAMW';ftypes[1]='text';fnames[2]='L\n"
                + "NAME';ftypes[2]='text';}(jQuery));var$mcj = jQuery.noConflict(true);</script>\n"
                + "<!--End mc_embed_signup-->");
        textArea.setBounds(10, 20, 375, 200);
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 8));
        panel2.add(textArea);
        add(panel2);
		
		setVisible(true); 
	}	
}
public class PruebaGuiNulo {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio(); 
			}
		}); 
	}
}