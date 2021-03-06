package pl.lublin.wsei.java.cwiczenia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main<FXMLLoader> extends Application {

    @Override
    public <Parent, Stage> void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("gusInfoGraphic.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 800, 700));
//        primaryStage.show();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("gusInfoGraphic.fxml"));
        Parent root = loader.load();
        ModuleLayer.Controller controller = loader.getController();

        controller.setHostServices(this.getHostServices());
        controller.setStage(primaryStage);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 700));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}