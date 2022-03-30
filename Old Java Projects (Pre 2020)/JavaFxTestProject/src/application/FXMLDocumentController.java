package application;
/**
 * This program controls the FXMLDocument calculateButton and tipPercentageSelider Events
 * Ian Selby
 * March 3, 2019
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

	// formatters for currency and percents
	private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent = NumberFormat.getPercentInstance();

	private BigDecimal tipPercentage = new BigDecimal(0.15);// 15% result

	// GUI controls defined in FXML and used by controller code
	@FXML
	private TextField amountTextField;

	@FXML
	private Label tipPercentageLabel;

	@FXML
	private Slider tipPercentageSlider;

	@FXML
	private TextField tipTextField;

	@FXML
	private TextField totalTextField;

	// calculates and displays the tip and total amounts
	@FXML
	private void calculateButtonPressed(ActionEvent event) {
		try {
			BigDecimal amount = new BigDecimal(amountTextField.getText());
			BigDecimal tip = amount.multiply(tipPercentage);
			BigDecimal total = amount.add(tip);

			tipTextField.setText(currency.format(tip));
			totalTextField.setText(currency.format(total));

		} catch (NumberFormatException ex) {
			amountTextField.setText("Enter amount");
			amountTextField.selectAll();
			amountTextField.requestFocus();
		}
	}
//called by FXMLLoader to initialize the controller
	public void initialize() {
		//0-4 rounds down, 5-9 rounds up
		currency.setRoundingMode(RoundingMode.HALF_UP);

		//listener for changes to tipPercentageSliders value
		tipPercentageSlider.valueProperty().addListener(
			new ChangeListener<Number>() {
				@Override
				public void changed (ObservableValue<? extends Number> ov,
					Number oldValue, Number newValue) {
					tipPercentage = 
						BigDecimal.valueOf(newValue.intValue() / 100.0);
					tipPercentageLabel.setText(percent.format(tipPercentage));
					}
				}
			);
		}
	}