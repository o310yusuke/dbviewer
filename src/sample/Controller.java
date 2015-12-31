package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * 参考URL：
 * http://kokuzawa.github.io/blog/2013/12/08/javafx-on-intellij-idea/
 */
public class Controller {

    @FXML
    private Label label;

    @FXML
    private Button button;

    public void click() {
        label.setText("ボタンをクリックしたよ！");
    }
}
