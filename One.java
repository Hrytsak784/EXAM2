public class One {
    private String carModel;
    private int carYear;

    public One(String model, int year) {
        this.carModel = model;
        this.carYear = year;
    }
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
}
