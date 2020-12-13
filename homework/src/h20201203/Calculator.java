package h20201203;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
/**
 * @ahthor : cxyxh
 * @date : 2020/12/12 10:43
 * @describetion : swing计算器
 */
public class Calculator {

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();

		MyPanel myPanel = new MyPanel();
	}
}

class MyFrame extends JFrame {

	public MyPanel myPanel = new MyPanel();

	public MyFrame() {
		this.setVisible(true);
		this.setTitle("计算器");
		this.setLayout(null);
		this.setSize(450, 300);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		myPanel.setBounds(0, 0, 450, 300);
		this.add(myPanel);
		// 是否确认退出
		this.setLocationRelativeTo(null);
	}
}

class MyPanel extends JPanel {

	private JTextArea text1Area = new JTextArea();
	private JTextArea text2Area = new JTextArea();
	private JTextArea text3Area = new JTextArea();

	private JRadioButton add = new JRadioButton("+");
	private JRadioButton del = new JRadioButton("-");
	private JRadioButton multiplication = new JRadioButton("*");
	private JRadioButton division = new JRadioButton("/");
	private ButtonGroup buttonGroup = new ButtonGroup();

	private JLabel equalLabel = new JLabel("=");

	public MyPanel() {
		this.setLayout(null);

		text1Area.setBounds(10, 60, 100, 30);
		this.add(text1Area);
		text2Area.setBounds(165, 60, 100, 30);
		this.add(text2Area);
		text3Area.setBounds(300, 60, 100, 30);
		this.add(text3Area);

		add.setBounds(120, 25, 40, 30);
		this.add(add);
		buttonGroup.add(add);
		del.setBounds(120, 50, 40, 30);
		this.add(del);
		buttonGroup.add(del);
		multiplication.setBounds(120, 75, 40, 30);
		this.add(multiplication);
		buttonGroup.add(multiplication);
		division.setBounds(120, 100, 40, 30);
		this.add(division);
		buttonGroup.add(division);

		equalLabel.setBounds(275, 60, 20, 30);
		this.add(equalLabel);

		add(new Button("EAST"),BorderLayout.EAST);
		add(new Button("WEST"),BorderLayout.WEST);
		add(new Button("NORTH"),BorderLayout.NORTH);
		add(new Button("SOUTH"),BorderLayout.SOUTH);
		add(new Button("CENTER"),BorderLayout.CENTER);
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text1 = text1Area.getText();
				String text2 = text2Area.getText();
				String text3 = text3Area.getText();
				boolean flag = false;
				try {
					flag = checkInput(text1, text2, text3);
				} catch (Exception e1) {
					showDialog();
				}
				if (flag) {
					if (isNotEmpty(text1) && isNotEmpty(text2)) {
						Integer result = addFuntion(Integer.valueOf(text1), Integer.valueOf(text2));
						text3Area.setText(result + "");
					} else if (isNotEmpty(text1) && isNotEmpty(text3)) {
						Integer result = delFuntion(Integer.valueOf(text3), Integer.valueOf(text1));
						text2Area.setText(result + "");
					} else if (isNotEmpty(text2) && isNotEmpty(text3)) {
						Integer result = delFuntion(Integer.valueOf(text3), Integer.valueOf(text2));
						text1Area.setText(result + "");
					}
				}
			}
		});

		del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text1 = text1Area.getText();
				String text2 = text2Area.getText();
				String text3 = text3Area.getText();
				boolean flag = false;
				try {
					flag = checkInput(text1, text2, text3);
				} catch (Exception e1) {
					showDialog();
				}
				if (flag) {
					if (isNotEmpty(text1) && isNotEmpty(text2)) {
						Integer result = delFuntion(Integer.valueOf(text1), Integer.valueOf(text2));
						text3Area.setText(result + "");
					} else if (isNotEmpty(text1) && isNotEmpty(text3)) {
						Integer result = delFuntion(Integer.valueOf(text1), Integer.valueOf(text3));
						text2Area.setText(result + "");
					} else if (isNotEmpty(text2) && isNotEmpty(text3)) {
						Integer result = addFuntion(Integer.valueOf(text2), Integer.valueOf(text3));
						text1Area.setText(result + "");
					}
				}
			}
		});

		multiplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text1 = text1Area.getText();
				String text2 = text2Area.getText();
				String text3 = text3Area.getText();
				boolean flag = false;
				try {
					flag = checkInput(text1, text2, text3);
				} catch (Exception e1) {
					showDialog();
				}
				if (flag) {
					if (isNotEmpty(text1) && isNotEmpty(text2)) {
						Integer result = mulFuntion(Integer.valueOf(text1), Integer.valueOf(text2));
						text3Area.setText(result + "");
					} else if (isNotEmpty(text1) && isNotEmpty(text3)) {
						Double result = divFuntion(Double.valueOf(text3), Double.valueOf(text1));
						text2Area.setText(result + "");
					} else if (isNotEmpty(text2) && isNotEmpty(text3)) {
						Double result = divFuntion(Double.valueOf(text3), Double.valueOf(text2));
						text1Area.setText(result + "");
					}
				}
			}
		});

		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text1 = text1Area.getText();
				String text2 = text2Area.getText();
				String text3 = text3Area.getText();
				boolean flag = false;
				try {
					flag = checkInput(text1, text2, text3);
					if (flag) {
						if (isNotEmpty(text1) && isNotEmpty(text2)) {
							if (Integer.valueOf(text2) == 0) {
								throw new Exception();
							}
							Double result = divFuntion(Double.valueOf(text1), Double.valueOf(text2));
							text3Area.setText(result + "");
						} else if (isNotEmpty(text1) && isNotEmpty(text3)) {
							Double result = divFuntion(Double.valueOf(text1), Double.valueOf(text3));
							text2Area.setText(result + "");
						} else if (isNotEmpty(text2) && isNotEmpty(text3)) {
							if (Integer.valueOf(text2) == 0) {
								throw new Exception();
							}
							Integer result = mulFuntion(Integer.valueOf(text2), Integer.valueOf(text3));
							text1Area.setText(result + "");
						}
					}
				} catch (Exception e1) {
					showDialog();
				}
				
			}
		});
	}

	public void showDialog() {
		text1Area.setText("");
		text2Area.setText("");
		text3Area.setText("");
		JOptionPane.showMessageDialog(null, "请输入正确的内容", "提示", JOptionPane.INFORMATION_MESSAGE);
	}

	public boolean isNotEmpty(String str) {
		if (str == null || str.trim().length() == 0) {
			return false;
		}
		return true;
	}

	public boolean checkInput(String str1, String str2, String str3) throws Exception {
		int emptyNum = 0;
		if (isNotEmpty(str1) == true) {
			Integer.valueOf(str1);
		} else {
			emptyNum++;
		}
		if (isNotEmpty(str2) == true) {
			Integer.valueOf(str1);
		} else {
			emptyNum++;
		}
		if (isNotEmpty(str3) == true) {
			Integer.valueOf(str1);
		} else {
			emptyNum++;
		}
		if (emptyNum != 1) {
			throw new Exception();
		}
		return true;
	}

	public Integer addFuntion(Integer num1, Integer num2) {
		return num1 + num2;
	}

	public Integer delFuntion(Integer num1, Integer num2) {
		return num1 - num2;
	}

	public Integer mulFuntion(Integer num1, Integer num2) {
		return num1 * num2;
	}

	public double divFuntion(double num1, double num2) {
		return num1 / num2;
	}
}
