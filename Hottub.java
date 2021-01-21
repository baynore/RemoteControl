public class Hottub {
	final int MINTEMP = 80;
    final int MAXTEMP = 110;
    
    boolean on;
	int temperature;

	public Hottub() {
	    temperature = 105;
    }

	public void on() {
		on = true;
        //temperature = 105;
	}

	public void off() {
		on = false;
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Hottub is not bubbling");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}
    
    public int getTemperature() {
        return temperature;
    }
	
    public void setTemperature(int temperature) {
        if (on) {
            if (temperature <= MINTEMP)
                temperature = MINTEMP;
            else if (temperature >= MAXTEMP)
                temperature = MAXTEMP;
            this.temperature = temperature;
            System.out.println("The temperature has been set to " + temperature);
        }
        else
            System.out.println("The hottub is off!");
	}
    
    public void incrementTemperature() {
        if (on) {
            if (temperature + 1 <= MAXTEMP) {
                temperature++;
                System.out.println("The temperature has been incremented by 1. " +
                                   "The new temperature is " + temperature); 
            }
            else
                System.out.println("The temperature cannot be raised above " + MAXTEMP);
        }
        else
            System.out.println("The hottub is off!");
    }
	
    public void decrementTemperature() {
        if (on) {
            if (temperature - 1 >= MINTEMP) {
                temperature--;
                System.out.println("The temperature has been decremented by 1. " +
                                   "The new temperature is " + temperature); 
            }
            else
                System.out.println("The temperature cannot be lowered below " + MINTEMP);
        }
        else
            System.out.println("The hottub is off!");
   
    }
        
    public void heat() {
		temperature = 105;
		System.out.println("Hottub is heating to a steaming 105 degrees");
	}

	public void cool() {
		temperature = 98;
		System.out.println("Hottub is cooling to 98 degrees");
	}

}
