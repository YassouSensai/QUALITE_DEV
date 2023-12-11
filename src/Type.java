public enum Type {
    ELECTRIC, ACOUSTIC;

    public String toString() {
        switch (this) {
            case ELECTRIC: return "ELECTRIC";
            case ACOUSTIC: return "ACOUSTIC";
            default: return "Unspecified";

        }
    }
}