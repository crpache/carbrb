import java.util.ArrayList;

public abstract class Vehicle {

    // Atributes

    protected static int idCount = 0;
    private int id;
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String licensePlate;
    private double rentFee;
    private Client owner;
    private boolean isAvailable;
    private boolean isRented;



    //Constructors

    public Vehicle(String brand, String model, int year, int mileage, String licensePlate, double rentFee, Client owner) {
        setId(idCount++);
        setBrand(brand);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setLicensePlate(licensePlate);
        setRentFee(rentFee);
        setOwner(owner);
        setAvailable(false);
        setRented(false);
    }


    //Methods


    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getRentFee() {
        return rentFee;
    }

    public Client getOwner() {
        return owner;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", licensePlate='" + licensePlate + '\'' +
                ", rentFee=" + rentFee +
                ", owner=" + owner +
                ", isAvailable=" + isAvailable +
                ", isRented=" + isRented +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Vehicle)) return false;
        if (!super.equals(object)) return false;
        Vehicle vehicle = (Vehicle) object;
        return getYear() == vehicle.getYear() &&
                java.util.Objects.equals(getBrand(), vehicle.getBrand()) &&
                java.util.Objects.equals(getModel(), vehicle.getModel()) &&
                java.util.Objects.equals(getLicensePlate(), vehicle.getLicensePlate());
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getBrand(), getModel(), getYear(), getLicensePlate());
    }
}