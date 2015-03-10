package chess;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.json.JSONObject;
import org.json.XML;

import com.temboo.Library.FilesAnywhere.AccountLogin;
import com.temboo.Library.FilesAnywhere.AccountLogin.AccountLoginInputSet;
import com.temboo.Library.FilesAnywhere.AccountLogin.AccountLoginResultSet;
import com.temboo.Library.FilesAnywhere.DeleteItem;
import com.temboo.Library.FilesAnywhere.DeleteItem.DeleteItemInputSet;
import com.temboo.Library.FilesAnywhere.DownloadBase64EncodedFile;
import com.temboo.Library.FilesAnywhere.DownloadBase64EncodedFile.DownloadBase64EncodedFileInputSet;
import com.temboo.Library.FilesAnywhere.ListItems;
import com.temboo.Library.FilesAnywhere.ListItems.ListItemsInputSet;
import com.temboo.Library.FilesAnywhere.ListItems.ListItemsResultSet;
import com.temboo.Library.FilesAnywhere.UploadFile;
import com.temboo.Library.FilesAnywhere.UploadFile.UploadFileInputSet;
import com.temboo.core.TembooException;
import com.temboo.core.TembooSession;

@SuppressWarnings("serial")
public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	static MainMenu frame;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, final String username) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainMenu(username);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public MainMenu(final String username) throws TembooException, UnsupportedEncodingException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		final TembooSession session = new TembooSession("aa3268", "myFirstApp", "522716fffec34ab1961d61113bea0f34");
		
		AccountLogin accountLoginChoreo = new AccountLogin(session);
		AccountLoginInputSet accountLoginInputs = accountLoginChoreo.newInputSet();

		// Set inputs
		accountLoginInputs.set_APIKey("F9C7C969-540D-43DD-B03E-2982BC411237");
		accountLoginInputs.set_OrgID("50");
		accountLoginInputs.set_Username("aa3268");
		accountLoginInputs.set_Password("05192904");

		// Execute Choreo
		final AccountLoginResultSet accountLoginResults = accountLoginChoreo.execute(accountLoginInputs);
		
		
		DownloadBase64EncodedFile downloadBase64EncodedFileChoreo = new DownloadBase64EncodedFile(session);

		// Get an InputSet object for the choreo
		DownloadBase64EncodedFileInputSet downloadBase64EncodedFileInputs = downloadBase64EncodedFileChoreo.newInputSet();
		// Set inputs
		downloadBase64EncodedFileInputs.set_APIKey("F9C7C969-540D-43DD-B03E-2982BC411237");
		downloadBase64EncodedFileInputs.set_OrgID("50");
		downloadBase64EncodedFileInputs.set_Token(accountLoginResults.get_Token());
		downloadBase64EncodedFileInputs.set_Path("AA3268\\user_data.txt");

		// Execute Choreo
		//DownloadBase64EncodedFileResultSet downloadBase64EncodedFileResults = downloadBase64EncodedFileChoreo.execute(downloadBase64EncodedFileInputs);
		//byte[] decoded= Base64.decodeBase64(downloadBase64EncodedFileResults.get_Response());
		//System.out.println(downloadBase64EncodedFileResults.get_Response());
		//System.out.println(new String(decoded, "UTF-8") + "\n");
		
		UploadFile uploadFileChoreo = new UploadFile(session);

		// Get an InputSet object for the choreo
		UploadFileInputSet uploadFileInputs = uploadFileChoreo.newInputSet();

		// Set inputs
		uploadFileInputs.set_APIKey("F9C7C969-540D-43DD-B03E-2982BC411237");
		uploadFileInputs.set_OrgID("50");
		uploadFileInputs.set_Token(accountLoginResults.get_Token());
		
		String path = "AA3268\\users\\";
		path += username + ".txt";
		uploadFileInputs.set_FileContents(username);
		uploadFileInputs.set_Path(path);

		// Execute Choreo
		uploadFileChoreo.execute(uploadFileInputs);
		//System.out.println(uploadFileResults.getCompletionStatus());
		//String encode = Base64.encodeBase64(username.getBytes());
	
		
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Invite");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				ButtonBorder k = new ButtonBorder();
				String[] args = null;
				k.main(args);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(277, 27, 89, 49);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteItem deleteItemChoreo = new DeleteItem(session);
				
				// Get an InputSet object for the choreo
				DeleteItemInputSet deleteItemInputs = deleteItemChoreo.newInputSet();

				// Set credential to use for execution
				deleteItemInputs.set_APIKey("F9C7C969-540D-43DD-B03E-2982BC411237");
				deleteItemInputs.set_OrgID("50");
				deleteItemInputs.set_Token(accountLoginResults.get_Token());
				
				String path = "AA3268\\users\\";
				path += username + ".txt";
				deleteItemInputs.set_Path(path);
				// Set inputs

				// Execute Choreo
				try {
					deleteItemChoreo.execute(deleteItemInputs);
				} catch (TembooException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String[] args = null;
				LogIn.main(args);
				frame.dispose();
			}
		});
		
		
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		ListItems listItemsChoreo = new ListItems(session);

		// Get an InputSet object for the choreo
		ListItemsInputSet listItemsInputs = listItemsChoreo.newInputSet();

		// Set inputs
		listItemsInputs.set_APIKey("F9C7C969-540D-43DD-B03E-2982BC411237");
		listItemsInputs.set_OrgID("50");
		listItemsInputs.set_Token(accountLoginResults.get_Token());
		listItemsInputs.set_Path("\\AA3268\\");

		// Execute Choreo
		ListItemsResultSet listItemsResults = listItemsChoreo.execute(listItemsInputs);
		listItemsResults.get_Response();
		System.out.println(listItemsResults.get_Response());
		
		
		//Convert XML to JSON
		 int PRETTY_PRINT_INDENT_FACTOR = 4;
		 String XML_STRING = listItemsResults.get_Response();
		 try{
			JSONObject xmlJSONObj = XML.toJSONObject(XML_STRING);
        	String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
        	System.out.println(jsonPrettyPrintString);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		      		
		Vector<String> headers = new Vector<String>();
		
		headers.add("Username");
		headers.add("Wins");
		headers.add("Losses");
		headers.add("In Game");
		
		DefaultTableModel t = new DefaultTableModel(data, headers);
		
		btnNewButton_1.setBounds(277, 87, 89, 49);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 257, 239);
		contentPane.add(scrollPane);
		
		table = new JTable(t);
		scrollPane.setViewportView(table);
	}
}
