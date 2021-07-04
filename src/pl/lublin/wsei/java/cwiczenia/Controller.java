
public void btnPokazOnAction(ActionEvent actionEvent) {
        try
        {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ImgViewer.fxml"));
        Parent root = loader.load();
        ImgViewer viewer = loader.getController();
        if(selInfografika != null)
        {
        Image img = new Image(selInfografika.adresGrafiki);
        viewer.imgView.setFitWidth(img.getWidth());
        viewer.imgView.setFitHeight(img.getHeight());
        viewer.imgView.setImage(img);

        }
        Stage stage =  new Stage();
        stage.setTitle("Podgląd infografiki");
        stage.setScene(new Scene(root, 900, 800));
        stage.show();
        }
        catch (IOException e)
        {
        e.printStackTrace();
        }

        }