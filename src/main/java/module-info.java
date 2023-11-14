module com.example.sep1test {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.example.sep1test to javafx.fxml;
  exports com.example.sep1test;
}