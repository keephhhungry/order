package h20201201;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @ahthor : admin
 * @date : 2020/11/17 23:13
 * @describetion : JavaFX作业，生成名片
 */
public class Main extends Application {

	public static void main(String[] args) {
        Application.launch(args);
    }
	
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = new AnchorPane();

        root.setStyle("-fx-background-color: #D2B48C;");

        Label companyName = new Label("Indigo Software Solutions Inc");
        companyName.setLayoutX(100);
        companyName.setLayoutY(15);
        companyName.setFont(Font.font(20));

        Image image = new Image("/main/photo.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setLayoutX(40);
        imageView.setFitWidth(120);
        imageView.setLayoutY(60);
        imageView.setFitHeight(140);


        Label username = new Label("Jane Doe");
        username.setLayoutX(72);
        username.setLayoutY(220);
        username.setFont(Font.font(14));

        Label title = new Label("Sr. Software Engineer");
        title.setLayoutX(35);
        title.setLayoutY(250);
        title.setFont(Font.font(14));

        Label telephone = new Label("tel: 973-321-5500");
        telephone.setLayoutX(220);
        telephone.setLayoutY(210);
        telephone.setFont(Font.font(14));

        Label email = new Label("email: jdoe@indigo.com");
        email.setLayoutX(220);
        email.setLayoutY(240);
        email.setFont(Font.font(14));

        Label addr = new Label("addr: 123 Main Street, Big City, NJ07279");
        addr.setLayoutX(220);
        addr.setLayoutY(270);
        addr.setFont(Font.font(14));

        Label label1 = new Label("Break down problems");
        label1.setLayoutX(220);
        label1.setLayoutY(110);
        label1.setFont(Font.font(14));
        Label label2 = new Label("Design solutions");
        label2.setLayoutX(220);
        label2.setLayoutY(140);
        label2.setFont(Font.font(14));
        Label label3 = new Label("Implement codes");
        label3.setLayoutX(220);
        label3.setLayoutY(170);
        label3.setFont(Font.font(14));

        Label label4 = new Label("Payment System");
        label4.setLayoutX(370);
        label4.setLayoutY(110);
        label4.setFont(Font.font(14));
        Label label5 = new Label("Supply Chain");
        label5.setLayoutX(370);
        label5.setLayoutY(140);
        label5.setFont(Font.font(14));
        Label label6 = new Label("Upgrade legacy system");
        label6.setLayoutX(370);
        label6.setLayoutY(170);
        label6.setFont(Font.font(14));
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);

        Button button1 = new Button("Expertise");
        button1.setLayoutX(220);
        button1.setLayoutY(60);
        button1.setPrefWidth(80);
        button1.setPrefHeight(30);
        button1.setCursor(Cursor.CLOSED_HAND);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label1.setVisible(true);
                label2.setVisible(true);
                label3.setVisible(true);
                label4.setVisible(false);
                label5.setVisible(false);
                label6.setVisible(false);
            }
        });

        Button button2 = new Button("Experience");
        button2.setLayoutX(370);
        button2.setLayoutY(60);
        button2.setPrefWidth(80);
        button2.setPrefHeight(30);
        button2.setCursor(Cursor.CLOSED_HAND);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label1.setVisible(false);
                label2.setVisible(false);
                label3.setVisible(false);
                label4.setVisible(true);
                label5.setVisible(true);
                label6.setVisible(true);
            }
        });

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(companyName);
        root.getChildren().add(username);
        root.getChildren().add(title);
        root.getChildren().add(telephone);
        root.getChildren().add(email);
        root.getChildren().add(addr);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);
        root.getChildren().add(label4);
        root.getChildren().add(label5);
        root.getChildren().add(label6);
        root.getChildren().add(imageView);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Business card");
        stage.setResizable(false);
        stage.setHeight(350);
        stage.setWidth(580);
        stage.show();
    }
}
