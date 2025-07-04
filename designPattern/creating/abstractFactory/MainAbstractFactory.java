package designPattern.creating.abstractFactory;

public class MainAbstractFactory {
		public static void main(String[] args) {
		GUIFactory factoryWindow;
		GUIFactory factoryMac;
		
		// Let's say we're on Windows
		factoryWindow = new WindowsFactory();
		Client appWindow = new Client(factoryWindow);
		appWindow.render();
		
		System.out.println(); // Pula linha
		
		// Let's say we're on Mac
		factoryMac = new MacFactory();
		Client appMac = new Client(factoryMac);
		appMac.render();
		
	}
}


// Abstract Factory
class Client {
	private Button button;
	private Checkbox checkbox;
	private Slider slider;
	
	public Client(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
		slider = factory.createSlider();
	}
	
	public void render() {
		button.paint();
		checkbox.paint();
		slider.paint();
	}
}

/*
 * Interfaces for Products
 */
// Product A
interface Button {
	void paint();
}
// Product B
interface Checkbox {
	void paint();
}
// Product C
interface Slider {
    void paint();
}


/*
 *  Concrete Products for Windows
 */
class WindowsButton implements Button {
	public void paint() {
		System.out.println("Rendering a Windows button.");
	}
}
class WindowsCheckbox implements Checkbox {
	public void paint() {
		System.out.println("Rendering a Windows checkbox.");
	}
}
class WindowsSlider implements Slider {
	public void paint() {
		System.out.println("Rendering a Windows slider.");
	}
	
}

/*
 * Concrete Products for Mac 
*/
class MacButton implements Button {
	public void paint() {
		System.out.println("Rendering a Mac button.");
	}
}
class MacCheckbox implements Checkbox {
	public void paint() {
		System.out.println("Rendering a Mac checkbox.");
	}
}
class MacSlider implements Slider {
	public void paint() {
		System.out.println("Rendering a Mac slider.");
	}
}

/*
 * Abstract Factory
 */
interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
	Slider createSlider();
}

/*
 * Concrete Factories
 */
class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
	
	public Slider createSlider() {
		return new WindowsSlider();
	}
}
class MacFactory implements GUIFactory {
	public Button createButton() {
		return new MacButton();
	}
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
	public Slider createSlider() {
		return new WindowsSlider();
	}
}








