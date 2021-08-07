import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JEditorPane;
import javax.swing.JToolBar;
import javax.swing.JPasswordField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTree;

public class SwingMain extends JFrame {
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 990, 490);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 976, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 431, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setMargin(new Insets(30, 30, 30, 30));
		menuBar.setBackground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenu = new JMenu("new ");
		mntmNewMenu.setBackground(Color.PINK);
		mnNewMenu.add(mntmNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("project");
		mntmNewMenu.add(mntmNewMenuItem);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mntmNewMenu.add(menuBar_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("open file");
		mntmNewMenuItem_2.setBackground(Color.PINK);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("save");
		mntmNewMenuItem_1.setBackground(Color.PINK);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("save as");
		mntmNewMenuItem_3.setBackground(Color.PINK);
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("edit");
		mnNewMenu_1.setForeground(Color.WHITE);
		mnNewMenu_1.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("undo");
		mntmNewMenuItem_4.setBackground(Color.PINK);
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("redo");
		mntmNewMenuItem_6.setBackground(Color.PINK);
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("cut");
		mntmNewMenuItem_7.setBackground(Color.PINK);
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("copy");
		mntmNewMenuItem_5.setBackground(Color.PINK);
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("paste");
		mntmNewMenuItem_20.setBackground(Color.PINK);
		mnNewMenu_1.add(mntmNewMenuItem_20);
		
		JMenu mnNewMenu_2 = new JMenu("source");
		mnNewMenu_2.setForeground(Color.WHITE);
		mnNewMenu_2.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("add text block");
		mntmNewMenuItem_9.setBackground(Color.PINK);
		mntmNewMenuItem_9.setForeground(Color.BLACK);
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("shift right");
		mntmNewMenuItem_8.setBackground(Color.PINK);
		mntmNewMenuItem_8.setForeground(Color.BLACK);
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("shift lelft");
		mntmNewMenuItem_11.setBackground(Color.PINK);
		mntmNewMenuItem_11.setForeground(Color.BLACK);
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("clean up");
		mntmNewMenuItem_10.setBackground(Color.PINK);
		mntmNewMenuItem_10.setForeground(Color.BLACK);
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_3 = new JMenu("project");
		mnNewMenu_3.setForeground(Color.WHITE);
		mnNewMenu_3.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("open project");
		mntmNewMenuItem_12.setBackground(Color.PINK);
		mnNewMenu_3.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("close project");
		mntmNewMenuItem_14.setBackground(Color.PINK);
		mnNewMenu_3.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("build project");
		mntmNewMenuItem_13.setBackground(Color.PINK);
		mnNewMenu_3.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("clean");
		mntmNewMenuItem_15.setBackground(Color.PINK);
		mnNewMenu_3.add(mntmNewMenuItem_15);
		
		JMenu mnNewMenu_4 = new JMenu("help");
		mnNewMenu_4.setForeground(Color.WHITE);
		mnNewMenu_4.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("welcome");
		mntmNewMenuItem_17.setBackground(Color.PINK);
		mnNewMenu_4.add(mntmNewMenuItem_17);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("help content");
		mntmNewMenuItem_16.setBackground(Color.PINK);
		mnNewMenu_4.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("search");
		mntmNewMenuItem_18.setBackground(Color.PINK);
		mnNewMenu_4.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("about webinks");
		mntmNewMenuItem_19.setBackground(Color.PINK);
		mnNewMenu_4.add(mntmNewMenuItem_19);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
