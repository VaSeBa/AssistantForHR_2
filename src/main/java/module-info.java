module ru.vaseba.assistantforhr_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.vaseba.assistantforhr_2 to javafx.fxml;
    exports ru.vaseba.assistantforhr_2;
}