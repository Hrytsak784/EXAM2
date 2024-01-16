public class Two extends One {
    private String additionalFeature;

    public Two(String model, int year, String additionalFeature) {
        super(model, year);

        this.additionalFeature = additionalFeature;
    }
    public String getAdditionalFeature() {
        return additionalFeature;
    }
    public void setAdditionalFeature(String additionalFeature) {
        this.additionalFeature = additionalFeature;
    }
}
