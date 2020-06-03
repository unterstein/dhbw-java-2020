package kapitel5;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class LiveCoding2 {

    public static void main(String[] args) {
        Button button = new Button();
        button.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                System.out.println("hi!");
            }
        });
        button.setOnAction(event -> {
            System.out.println("Hi!");
        });
    }
}
