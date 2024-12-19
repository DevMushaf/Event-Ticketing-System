module com.example.eventticketingsystem {
    // Declares that this module requires JavaFX Controls, JavaFX FXML, and the Gson library for JSON parsing
    requires javafx.controls; // JavaFX controls for UI elements
    requires javafx.fxml; // JavaFX FXML for defining UI layout
    requires com.google.gson; // Gson for working with JSON data

    opens com.example.eventticketingsystem to javafx.fxml; // Allows JavaFX to access the main package
    opens com.example.eventticketingsystem.controller to javafx.fxml; // Allows JavaFX to access the controller package
    opens com.example.eventticketingsystem.config to com.google.gson; // Allows Gson to access the config package for JSON serialization/deserialization

    exports com.example.eventticketingsystem; // Exports the main package for use by other modules
    exports com.example.eventticketingsystem.gui; // Exports the GUI package
    exports com.example.eventticketingsystem.config; // Exports the config package
    exports com.example.eventticketingsystem.model; // Exports the model package
    exports com.example.eventticketingsystem.thread; // Exports the thread package
    exports com.example.eventticketingsystem.util; // Exports the utility package
    exports com.example.eventticketingsystem.controller; // Exports the controller package
}