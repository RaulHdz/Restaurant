import java.util.*;
import java.io.*;

public class restaurant{
  public static int e;
  public static String[]compinfo;
  public static Scanner keyboard=new Scanner(System.in);
  public static String[]product;
  public static double[]price;
  public static int[]code;
  public static double[]can;
  public static double[]total;
  public static int k=0;
  public static int a;
  public static double h=0;
  public static double m=0;
  public static String S;
  public static double u=0;
  public static int q;
  public static int n;
  public static String j;
  public static PrintWriter outputStream;
  public static PrintWriter inputStream;  
  
  public static void main(String[] args) {
    day();
    System.out.println("To see the orders of a day enter 0, if not enter any other number.");
    n = keyboard.nextInt();
    while (n==0){
      n = 1;
      q = 1;
      while (q == 1){
        q = 0;
        System.out.println("Type the date you want to view the orders of. (DayMonthYear Ex. 12052013)");
        S = keyboard.nextLine();
        inputStream = null;
        try {
          System.out.println("Reading and printing names and IDs.");
          BufferedReader in = new BufferedReader(new FileReader(S));
          j = null;
          while((j = in.readLine()) != null) {
            System.out.println(j);
          }
        }
        catch(FileNotFoundException e) {
          System.out.println("Error at trying to open the file: " + S + ".");
          q = 1;
        }
        catch (IOException x) {
          System.err.format("IOException: %s%n.", x);
          q = 1;
        }
      }
      System.out.println("To see the orders of another day enter 0, if not enter any other number.");
      n = keyboard.nextInt();
    }
  }
  public static void day() {
    q=1;
    while (q==1) {
      q=0;
      System.out.println("Enter the date to save the day. (DayMonthYear Ex. 12052013)");
      S=keyboard.nextLine();
      outputStream = null;
      try {
        outputStream = new PrintWriter(S);
      }
      catch (FileNotFoundException e) {
        System.out.println("Error at trying to save the file: " + S);
        q=1;
      }
    }
    u=0;
    client();
  }
  public static void client() //realiza el proceso para tomar orden de un cliente
  {
    System.out.println("Welcome to The Fried Corner.");
    System.out.println("The menu will be displayed below.");
    can=new double[24];
    total=new double[24];
    for (int i=0; i<24;i++){
      can[i]=0;
      total[i]=0;
    }
    k=0;
    m=0;
    menu();
    view_description();
    take_order();
  }
  public static void menu(){
    product=new String [24];
    product[0]="Plain Jane";
    product[1]="Red";
    product[2]="Diet Mix";
    product[3]="Fruit Bliss";
    product[4]="Classic Burger";
    product[5]="European Ham Loaf";
    product[6]="Crunchy Bacon";
    product[7]="Salty Kraken";
    product[8]="Hot Ranger";
    product[9]="Ol' Rancher";
    product[10]="Olive Garden";
    product[11]="Hawaiana";
    product[12]="Italian";
    product[13]="Double Cheese";
    product[14]="Soft Drink";
    product[15]="Milk";
    product[16]="Tea";
    product[17]="Water";
    product[18]="Lemonade";
    product[19]="Hot Chocolate";
    product[20]="Cupcake";
    product[21]="Apple Tart";
    product[22]="Cherry Dive";
    product[23]="Chocochip Cookie";
    
    price=new double [24];
    price[0]=3.5;
    price[1]=3.6;
    price[2]=3.2;
    price[3]=3.0;
    price[4]=4.3;
    price[5]=4.2;
    price[6]=4.8;
    price[7]=4.5;
    price[8]=5.0;
    price[9]=4.5;
    price[10]=8.2;
    price[11]=7.8;
    price[12]=8.0;
    price[13]=8.5;
    price[14]=1.2;
    price[15]=1.2;
    price[16]=1.5;
    price[17]=0.5;
    price[18]=1.0;
    price[19]=1.3;
    price[20]=2.5;
    price[21]=2.1;
    price[22]=2.7;
    price[23]=0.8;
    
    code=new int [24];
    code[0]=116;
    code[1]=126;
    code[2]=136;
    code[3]=146;
    code[4]=118;
    code[5]=128;
    code[6]=138;
    code[7]=148;
    code[8]=158;
    code[9]=168;
    code[10]=217;
    code[11]=227;
    code[12]=237;
    code[13]=247;
    code[14]=314;
    code[15]=324;
    code[16]=334;
    code[17]=344;
    code[18]=354;
    code[19]=364;
    code[20]=419;
    code[21]=429;
    code[22]=439;
    code[23]=449;
    compinfo=new String[24];
    System.out.println("       MENU");
    System.out.println(".....Salads.....");
    System.out.println("Code     Product Name       Price");
    for (int i=0;i<4;i++){
      compinfo[i]=code[i]+"     "+product[i]+"      $"+price[i]; //DESPLIEGA ensaladas
      System.out.println(compinfo[i]);
    }
    System.out.println(".....Hamburgers and sandwiches.....");
    System.out.println("Code     Product Name       Price");
    for (int i=4;i<10;i++){
      compinfo[i]=code[i]+"     "+product[i]+"      $"+price[i]; //DESPLIEGA hamburguesas y sandwiches
      System.out.println(compinfo[i]);
    }
    System.out.println(".....Pizzas.....");
    System.out.println("Code     Product Name       Price");
    for (int i=10;i<14;i++){
      compinfo[i]=code[i]+"     "+product[i]+"      $"+price[i]; //DESPLIEGA pizzas
      System.out.println(compinfo[i]);
    }
    System.out.println(".....Beverages.....");
    System.out.println("Code     Product Name       Price");
    for (int i=14;i<20;i++){
      compinfo[i]=code[i]+"     "+product[i]+"      $"+price[i]; //DESPLIEGA bebidas
      System.out.println(compinfo[i]);
    }
    System.out.println(".....Desserts.....");
    System.out.println("Code     Product Name       Price");
    for (int i=20;i<24;i++){
      compinfo[i]=code[i]+"     "+product[i]+"      $"+price[i]; //DESPLIEGA postres
      System.out.println(compinfo[i]);
    }
  }
  public static void view_description(){ //muestra la descripcion del producto
    k=0;
    while (k==0){
      System.out.println("Type the code of the product to view its description, type 0 to continue.");
      e=keyboard.nextInt();
      switch(e){
        case 0:
          k=1;
          break;
        case 116:
          System.out.println("Plain Jane Salad: Tomato, lettuce,grated cheese, olives and cucumber (any sauce).");
          break;
        case 126:
          System.out.println("Red Salad: Red apple, lettuce, strawberry and walnut and balsamic vinegar.");
          break;
        case 136:
          System.out.println("Diet mix Salad: Lettuce and tomato with creamy sauce, with vinegar sauce.");
          break;
        case 146:
          System.out.println("Fruit Bliss Salad: Raisins, grated carrot, and pineapple with creamy sauce.");
          break;
        case 118:
          System.out.println("Classic Burger: Lettuce, cheese, beef, tomato.");
          break;
        case 128:
          System.out.println("European Ham Loaf: Cheese and ham sandwitch.");
          break;
        case 138:
          System.out.println("Crunchy bacon: Bacon, cheese, beef and tomato..");
          break;
        case 148:
          System.out.println("Salty Kraken: Sea sandwich, served with breaded fish filet or filled with salmon.");
          break;
        case 158:
          System.out.println("Hot Ranger: Beef, cheese, red chili sauce.");
          break;
        case 168:
          System.out.println("Ol' Rancher: Avocado sandwich with tomato, chicken and cheese.");
          break;
        case 217:
          System.out.println("Olive Garden: 3 types of olives, spices and pepperoni with tomato sauce.");
          break;
        case 227:
          System.out.println("Hawaiana: Pinapple and ham with tomato sauce.");
          break;
        case 237:
          System.out.println("Italian Pizza: Green pepper, pepperoni, black olives, onion and mushrooms.");
          break;
        case 247:
          System.out.println("Double Cheese: Manchego cheese besides mozzarella, pepperoni and black olives.");
          break;
        case 314:
          System.out.println("Soft Drink: Sprite, Coca Cola, etc.");
          break;
        case 324:
          System.out.println("Milk");
          break;
        case 334:
          System.out.println("Tea: Lipton, Celestial Seasonings, lemon and chamomile.");
          break;
        case 344:
          System.out.println("Water");
          break;
        case 354:
          System.out.println("Lemonade: natural or mineral water.");
          break;
        case 364:
          System.out.println("Hot chocolate: includes milk and sugar.");
          break;
        case 419:
          System.out.println("Cupcake: Can be chocolate or vanilla flavor.");
          break;
        case 429:
          System.out.println("Apple tart: Apple tart with cinnamon.");
          break;
        case 439:
          System.out.println("Cherry Dive: Chocolate cake with ice cream and a cherry on top.");
          break;
        case 449:
          System.out.println("The classic Chocochip Cookie.");
          break;
        default:
          System.out.println("Error while typing.");
      }
    }
  }
  public static void save_order(){//graba orden
    outputStream.println("Quantity.......Price............Product...........Total");
    for (int i = 0; i < 24; i++){
      if(can[i]>0){
        outputStream.println(can[i]+"            $"+price[i]+"          "+product[i]+"         $"+total[i]);
      }
    }
    outputStream.println("");
    outputStream.println("TOTAL COSTS: $"+h+" dollars");
    outputStream.println("");
    u = u + h;
  }
  public static void give_change(){ //calculates the cost and change that we need to give the client
    System.out.println("With how much money are you going to pay?");
    m=keyboard.nextDouble();
    if ((m-h) >= 0){
      System.out.println("Your change is of: $" + (m-h));
      System.out.println("ORDER DONE");
      k=0;
      while (k==0){ 
        System.out.println("Is the day done? (1 = Yes, 0 = No)");
        e=keyboard.nextInt();
        switch (e){
          case 1:
            save_order();
            outputStream.println("TOTAL COSTS OF THE DAY: $" + u + " dollars.");
            outputStream.close();
            q = 0;
            while (q == 0) {
              System.out.println("Is the month done (1 = Yes, 0 = No)");
              n = keyboard.nextInt();
              switch (n) {
                case 1:
                  q = 1;
                  break;
                case 0:
                  q = 1;
                  day();
                  break;
                default:
                  System.out.println("Error! Wrong number.");
              }
            }
            k=1;
            break;
          case 0:
            save_order();// graba en disco las ordenes del día
            client();
            k=1;
            break;
          default:
            System.out.println("Error! Incorrect number!");
            break;
        }}}
    while ((m - h) < 0){
      System.out.println("Not enough money! Missing: $" + (h-m));
      System.out.println("Enter the correct amount of money or press 0 to change order, or -1 to cancel the order.");
      m=keyboard.nextDouble();
      if (m==0){
        take_order();
      }
      if (m==-1){
        System.out.println("________________________________________________________________");
        System.out.println("                     NEW ORDER");        
        client();
      }
    }
  }    
  public static void get_quantity()
  {
    can[a]=keyboard.nextDouble();
    while(can[a]<0){
      System.out.println("Error! Write a positive quantity!");
      can[a]=keyboard.nextDouble();
    }
    total[a]=price[a]*can[a];
  }
  public static void print_costs(){
    h=0;
    System.out.println("Quantity.......Price............Product...........Total");
    for(int i=0;i<24;i++){
      if(can[i]>0){
        h=h+total[i];
        System.out.println(can[i]+"            $"+price[i]+"          "+product[i]+"         $"+total[i]);
      }
    } 
    System.out.println("");
    System.out.println("TOTAL COSTS: $"+h+" dollars");
    k=0;
    while (k==0) {
      System.out.println("Do you want to change your order? (1 = Yes, 0 = No)");
      e=keyboard.nextInt();
      switch (e){ 
        case 0:
          k=1;
          give_change();
          break;
        case 1:
          k=1;
          take_order();
          break;
        default:
          System.out.println("Error! Wrong number.");
          break;
      }
    }
  }
  public static void take_order() //toma la orden
  {
    k=0;
    while(k==0){
      System.out.println("Type the code of the product to add/change/delete it to the order, type 0 to continue.");
      e=keyboard.nextInt();
      switch(e){
        case 0:
          k=1;
          break;
        case 116: 
          System.out.println("How many Plain Jane Salads?");
          a=0;
          get_quantity();
          break;
        case 126:
          System.out.println("How many Red Salads?");
          a=1;
          get_quantity();
          break;
        case 136:
          System.out.println("How many Diet mix Salads?");
          a=2;
          get_quantity();
          break;
        case 146:
          System.out.println("How many Fruit Bliss Salads?");
          a=3;
          get_quantity();
          break;
        case 118:
          System.out.println("How many Classic Burgers?");
          a=4;
          get_quantity();
          break;
        case 128:
          System.out.println("How many European Ham Loaf?");
          a=5;
          get_quantity();
          break;
        case 138:
          System.out.println("How many Crunchy bacon?");
          a=6;
          get_quantity();
          break;
        case 148:
          System.out.println("How many Salty Kraken?");
          a=7;
          get_quantity();
          break;
        case 158:
          System.out.println("How many Hot Ranger?");
          a=8;
          get_quantity();
          break;
        case 168:
          System.out.println("How many Ol' Rancher?");
          a=9;
          get_quantity();
          break;
        case 217:
          System.out.println("How many Olive Gardens?");
          a=10;
          get_quantity();
          break;
        case 227:
          System.out.println("How many Hawaianas?");
          a=11;
          get_quantity();
          break;
        case 237:
          System.out.println("How many Italian Pizzas?");
          a=12;
          get_quantity();
          break;
        case 247:
          System.out.println("How many Double Cheeses?");
          a=13;
          get_quantity();
          break;
        case 314:
          System.out.println("How many Soft Drinks?");
          a=14;
          get_quantity();
          break;
        case 324:
          System.out.println("How many glasses of milk?");
          a=15;
          get_quantity();
          break;
        case 334:
          System.out.println("How many teas?");
          a=16;
          get_quantity();
          break;
        case 344:
          System.out.println("How many bottles of water?");
          a=17;
          get_quantity();
          break;
        case 354:
          System.out.println("How many lemonades?");
          a=18;
          get_quantity();
          break;
        case 364:
          System.out.println("How many hot chocolates?");
          a=19;
          get_quantity();
          break;
        case 419:
          System.out.println("How many cupcakes?");
          a=20;
          get_quantity();
          break;
        case 429:
          System.out.println("How many Apple tarts?");
          a=21;
          get_quantity();
          break;
        case 439:
          System.out.println("How many Cherry Dives?");
          a=22;
          get_quantity();
          break;
        case 449:
          System.out.println("How many Chocochip Cookies?");
          a=23;
          get_quantity();
          break;
        default:
          System.out.println("Error while typing.");
      }
    }
    print_costs();
  }
}