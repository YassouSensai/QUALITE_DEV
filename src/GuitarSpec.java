public class GuitarSpec {
    private Builder builder;
    private String model;
    private int nbCorde;
    private Type type;
    private Wood backWood, topWood;

    public GuitarSpec(Builder builder, String model,int nbCorde, Type type, Wood backWood, Wood topWood) {
        this.model = model;
        this.builder = builder;
        this.nbCorde = nbCorde;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }


    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec guitarSpec) {
        if (this.builder != guitarSpec.getBuilder())
            return false;
        int ok = 0;
        if (this.model == guitarSpec.getModel())
            ok ++;
        if (this.topWood == guitarSpec.getTopWood())
            ok ++;
        if (this.backWood == guitarSpec.getBackWood())
            ok ++;
        if (this.type == guitarSpec.getType())
            ok ++;

        if (ok == 4)
            return true;
        return false;
    }
}
