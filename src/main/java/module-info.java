module com.example.cartanav {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires org.kordamp.bootstrapfx.core;

  opens com.example.cartanav to javafx.fxml;
  exports com.example.cartanav;
}