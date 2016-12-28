public class Browser extends Application {
 
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      launch(args);
  }
 
  @Override
  public void start(Stage primaryStage) {
     
      primaryStage.setTitle("mybrowser");
     
      WebView myBrowser = new WebView();
      WebEngine myWebEngine = myBrowser.getEngine();
      myWebEngine.load("https://www.google.com");
      StackPane root = new StackPane();
     root.getChildren().add(myBrowser);
      primaryStage.setScene(new Scene(root, 640, 480));
      primaryStage.show();
  }
}