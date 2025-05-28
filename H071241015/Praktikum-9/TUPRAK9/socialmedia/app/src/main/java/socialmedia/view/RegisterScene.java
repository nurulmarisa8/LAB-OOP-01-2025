package socialmedia.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import socialmedia.model.User;

import java.io.File;
import java.util.prefs.Preferences;

public class RegisterScene {
    private Stage stage;
    private Scene scene;
    private TextField nicknameField, fullnameField;
    private ImageView profileImageView;
    private String imagePath;
    private File lastDirectory = null;
    private Preferences prefs = Preferences.userNodeForPackage(RegisterScene.class); 

    public RegisterScene(Stage stage) {
        this.stage = stage;
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("Input User Account");
        Label nickLabel = new Label("Nick Name");
        Label fullLabel = new Label("Full Name");

        nicknameField = new TextField();
        fullnameField = new TextField();

        Button uploadButton = new Button("Upload Foto Profil");
        profileImageView = new ImageView();
        profileImageView.setFitWidth(150);
        profileImageView.setFitHeight(150);
        profileImageView.setStyle("-fx-border-radius: 75; -fx-background-radius: 75; -fx-effect: innershadow(two-pass-box, black, 8, 0.0, 0, 0);");
        profileImageView.setClip(new javafx.scene.shape.Circle(75, 75, 75));


        String lastDirPath = prefs.get("lastDirectory", null);
        if (lastDirPath != null) {
            File dir = new File(lastDirPath);
            if (dir.exists() && dir.isDirectory()) {
                lastDirectory = dir;
                System.out.println("Loaded last directory from prefs: " + lastDirectory.getAbsolutePath());
            } else {
                lastDirectory = null;
                System.out.println("Last directory in prefs is invalid, fallback to null.");
            }
        }

        uploadButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
            );
            // Debug print
            System.out.println("Initial directory before open: " + (lastDirectory != null ? lastDirectory.getAbsolutePath() : "null"));
            if (lastDirectory != null && lastDirectory.exists() && lastDirectory.isDirectory()) {
                fileChooser.setInitialDirectory(lastDirectory);
            } else {
                fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
            }
            File file = fileChooser.showOpenDialog(stage);
            if (file != null) {
                imagePath = file.toURI().toString();
                profileImageView.setImage(new Image(imagePath));
                File parent = file.getParentFile();
                if (parent != null && parent.exists() && parent.isDirectory()) {
                    lastDirectory = parent;
                    prefs.put("lastDirectory", lastDirectory.getAbsolutePath());
                    System.out.println("Saved new last directory: " + lastDirectory.getAbsolutePath());
                }
            }
        });

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            User user = new User(
                    nicknameField.getText(),
                    fullnameField.getText(),
                    imagePath
            );
            new HomeScene(stage, user).show();
        });

        layout.getChildren().addAll(titleLabel, nickLabel, nicknameField, fullLabel, fullnameField, uploadButton, profileImageView, submitButton);
        scene = new Scene(layout, 400, 600);
    }

    public void show() {
        stage.setScene(scene);
        stage.setTitle("MyMoment");
        stage.show();
    }
}