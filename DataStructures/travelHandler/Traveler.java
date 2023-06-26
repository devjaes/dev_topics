public class Traveler {
    private String id;
    private int idType;
    // 1. Cedula de ciudadania
    // 2. Pasaporte
    public String fullName;
    private int phoneNumber;
    private boolean isTraveling;

    public Traveler(String id, int idType, String fullName, int phoneNumber) {
        this.id = id;
        this.idType = idType;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.isTraveling = false;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public boolean isTraveling() {
        return isTraveling;
    }

    public void setTraveling(boolean isTravelihg) {
        this.isTraveling = isTravelihg;
    }

}