package ananabhi;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * FXML Controller class
 *
 * @author ananabhi
 */
public class FXMLA5Controller implements Initializable {

    @FXML
    private Button btnOkay;
    @FXML
    private TextArea txt;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private RadioButton radio1;
    @FXML
    private RadioButton radio2;
    @FXML
    private RadioButton radio3;
    @FXML
    private RadioButton radio4;
    @FXML
    private RadioButton radio5;
    @FXML
    private RadioButton radio6;
    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private VBox centerPane1;
    @FXML
    private VBox centerPane3;
    PizzaOrder order = new PizzaOrder();
    ArrayList<Toppings> toppings = new ArrayList<>();

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnOkay.setOnAction(new EventHandler<ActionEvent>() {
            int numOfDrinks = 0;
            int numOfPizza = 0;

            @Override
            public void handle(ActionEvent t) {
                order.setToppings(toppings);
                try {
                    numOfPizza = Integer.valueOf(txt1.getText());
                    numOfDrinks = Integer.valueOf(txt2.getText());
                } catch (Exception e) {
                    txt.setText("Enter valid input in the text area");
                    numOfDrinks = 0;
                    numOfPizza = 0;
                }
                if (numOfDrinks != 0 || numOfPizza != 0) {
                    order.setNumOfDrinks(numOfDrinks);
                    order.setNumOfPizza(numOfPizza);
                    txt.setText(order.toString());
                }
            }
        });
    }

    @FXML
    private void getActions(ActionEvent event) {
        if (radio1.isSelected()) {
            for (Node node : centerPane1.getChildren()) {
                order.setSize(PizzaSize.LARGE);
            }
        }
        if (radio2.isSelected()) {
            for (Node node : centerPane1.getChildren()) {
                order.setSize(PizzaSize.MEDIUM);
            }
        }
        if (radio3.isSelected()) {
            for (Node node : centerPane1.getChildren()) {
                order.setSize(PizzaSize.SMALL);
            }
        }
    }

    @FXML
    private void getAction(ActionEvent event) {
        if (radio4.isSelected()) {
            for (Node node : centerPane3.getChildren()) {
                order.setDrinks(Drinks.COKE);
            }
        }
        if (radio5.isSelected()) {
            for (Node node : centerPane3.getChildren()) {
                order.setDrinks(Drinks.JUICE);
            }
        }
        if (radio6.isSelected()) {
            for (Node node : centerPane3.getChildren()) {
                order.setDrinks(Drinks.CHOCOLATE_MILK);
            }
        }
    }

    @FXML
    private void action(ActionEvent event) {
        if (checkBox1.isSelected()) {
            if (!toppings.contains(Toppings.CHEESE)) {
                toppings.add(Toppings.CHEESE);
            }
        }
        if (checkBox2.isSelected()) {
            if (!toppings.contains(Toppings.PEPPERONI)) {
                toppings.add(Toppings.PEPPERONI);
            }
        }
        if (checkBox3.isSelected()) {
            if (!toppings.contains(Toppings.MUSHROOMS)) {
                toppings.add(Toppings.MUSHROOMS);
            }
        }
        if (checkBox4.isSelected()) {
            if (!toppings.contains(Toppings.OLIVES)) {
                toppings.add(Toppings.OLIVES);
            }
        }
    }

    @FXML
    private void cancel(ActionEvent event) {
        txt.clear();
        txt1.clear();
        txt2.clear();
        radio1.setSelected(false);
        radio2.setSelected(false);
        radio3.setSelected(false);
        radio4.setSelected(false);
        radio5.setSelected(false);
        radio6.setSelected(false);
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
        order.setNumOfDrinks(0);
        order.setNumOfPizza(0);
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
}
