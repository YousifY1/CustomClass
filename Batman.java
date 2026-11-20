public class Batman {
   // instance variables 
   private String name;
   private String category;
   private String favoritePhrase; 
   private int age;
   private double height;
   private boolean detective;
   private int gadgets;
   
   // constructors
   public Batman() {
      name = "Batman";  
      category = "Hero";
      favoritePhrase = "";
      age = 27;
      height = 6.1;
      detective = true;
      gadgets = 10;
   }
   public Batman(String name, String category, String favoritePhrase, int age, double height, boolean detective, int gadgets) {
      this.name = name;
      this.category = category;
      this.favoritePhrase = favoritePhrase;
      this.age = age; 
      this.height = height;
      this.detective = true;
      this.gadgets = 10;
   }
   
   // methods
   public void gotham() {
      System.out.println("Hero name: " + name + " Gadgets: " + gadgets);


   }
}
