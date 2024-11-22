package com.example.fun;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.io.FileInputStream;

public class HelloController {
    public ImageView Background;
    public MenuBar MenuBar;
    public Menu PhotoPicker;
    public Menu PhotoAdder;
    public MenuItem Image1;
    public MenuItem Image2;
    public MenuItem Image3;
    public MenuItem Image4;
    public MenuItem Image5;
    public MenuItem Image6;
    public MenuItem AddPic;
    public RadioButton Button1;
    public RadioButton Button2;
    public RadioButton Button3;
    public RadioButton Button4;
    public RadioButton Button5;
    public RadioButton Button6;
    public RadioButton ButtonAdd;
    public ChoiceBox ChoiceBox;
    Image image3;
    Image imageExtra;
    Image image2;
    Image image4;
    Image image5;
    Image image6;


    public void initialize() throws Exception {
        FileInputStream input = new FileInputStream("src/main/resources/Welcome.png");
        Image image = new Image(input);
        Background.setImage(image);

        FileInputStream input3 = new FileInputStream("src/main/resources/Image1.jpg");
        image3 = new Image(input3);
        FileInputStream input4 = new FileInputStream("src/main/resources/Image2.jpg");
         image2 = new Image(input4);
        FileInputStream input5 = new FileInputStream("src/main/resources/Image3.jpg");
         image4 = new Image(input5);
        FileInputStream input6 = new FileInputStream("src/main/resources/Image4.jpg");
         image5 = new Image(input6);
        FileInputStream input7 = new FileInputStream("src/main/resources/Image5.jpg");
         image6 = new Image(input7);


        ChoiceBox.getItems().add("Image 1");
        ChoiceBox.getItems().add("Image 2");
        ChoiceBox.getItems().add("Image 3");
        ChoiceBox.getItems().add("Image 4");
        ChoiceBox.getItems().add("Image 5");
        ChoiceBox.getItems().add("Image 6");
        ChoiceBox.setOnAction((event) -> {
            int selectedIndex = ChoiceBox.getSelectionModel().getSelectedIndex();
            if (selectedIndex == 0) {
                Background.setImage(image3);
            }
            if (selectedIndex == 1) {
                Background.setImage(image2);
            }
            if (selectedIndex == 2) {
                Background.setImage(image4);
            }
            if (selectedIndex == 3) {
                Background.setImage(image5);
            }
            if (selectedIndex == 4) {
                Background.setImage(image6);
            }
            if (selectedIndex == 5) {
                Background.setImage(imageExtra);
            }

            Object selectedItem = ChoiceBox.getSelectionModel().getSelectedItem();

            System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
            System.out.println("   ChoiceBox.getValue(): " + ChoiceBox.getValue());
        });
    }

    public void updateImage1() throws Exception {
        Background.setImage(image3);
    }

    public void updateImage2() throws Exception {
        Background.setImage(image2);
    }

    public void updateImage3() throws Exception {
        Background.setImage(image4);
    }

    public void updateImage4() throws Exception {
        Background.setImage(image5);
    }

    public void updateImage5() throws Exception {
        Background.setImage(image6);
    }
    public void updateImage6() throws Exception {
        Background.setImage(imageExtra);
    }

    public void updateFile() throws Exception {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(Background.getScene().getWindow());
        FileInputStream input8 = new FileInputStream(selectedFile);
        imageExtra = new Image(input8);

        Background.setImage(imageExtra);
    }

    public void updateButton1() throws Exception {
        Background.setImage(image3);
    }

    public void updateButton2() throws Exception {
        Background.setImage(image2);
    }

    public void updateButton3() throws Exception {
        Background.setImage(image4);
    }

    public void updateButton4() throws Exception {
        Background.setImage(image5);
    }

    public void updateButton5() throws Exception {
        Background.setImage(image6);
    }
    public void updateButton6() throws Exception {
        Background.setImage(imageExtra);
    }

    public void updateButtonAdd() throws Exception {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(Background.getScene().getWindow());
        FileInputStream input8 = new FileInputStream(selectedFile);
        imageExtra = new Image(input8);
        Background.setImage(imageExtra);
    }


}


