class FitnessMember {
    private String name;
    private int age;
    private String gender;
    private String membershipType;
    private String phoneNumber;

    public FitnessMember(String name, int age, String gender, String membershipType, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.membershipType = membershipType;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

