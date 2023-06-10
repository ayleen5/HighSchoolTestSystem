/**
 * Sample Skeleton for 'addQuestion.fxml' Controller Class
 */

package il.cshaifasweng.OCSFMediatorExample.client;

import il.cshaifasweng.OCSFMediatorExample.entities.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

public class AddQuestion {

    @FXML // fx:id="correctTF"
    private TextField correctTF; // Value injected by FXMLLoader

    @FXML // fx:id="firstTF"
    private TextField firstTF; // Value injected by FXMLLoader

    @FXML // fx:id="fourthTF"
    private TextField fourthTF; // Value injected by FXMLLoader

    @FXML // fx:id="idTF"
    private TextField idTF; // Value injected by FXMLLoader

    @FXML // fx:id="pointsTF"
    private TextField pointsTF; // Value injected by FXMLLoader

    @FXML // fx:id="questionTF"
    private TextField questionTF; // Value injected by FXMLLoader

    @FXML // fx:id="secondTF"
    private TextField secondTF; // Value injected by FXMLLoader

    @FXML // fx:id="subjectCMB"
    private ComboBox<?> subjectCMB; // Value injected by FXMLLoader

    @FXML // fx:id="subjectTF1"
    private Label subjectTF1; // Value injected by FXMLLoader

    @FXML // fx:id="thirdTF"
    private TextField thirdTF; // Value injected by FXMLLoader

    void initialize() {
        EventBus.getDefault().register(this);
        sendMessage("get list of subjects", (Object)null);
    }

    private void sendMessage(String op, Object obj) {
        try {
            Message message = new Message(op, obj);
            SimpleClient.getClient().sendToServer(message);
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    @FXML
    void done(ActionEvent event) {

    }

    @FXML
    void setAnswer1(ActionEvent event) {

    }

    @FXML
    void setAnswer2(ActionEvent event) {

    }

    @FXML
    void setAnswer3(ActionEvent event) {

    }

    @FXML
    void setAnswer4(ActionEvent event) {

    }

    @FXML
    void setCorrectAnswer(ActionEvent event) {

    }

    @FXML
    void setPoints(ActionEvent event) {

    }

    @FXML
    void setQuestion(ActionEvent event) {

    }

    @FXML
    void setSubject(ActionEvent event) {

    }

}