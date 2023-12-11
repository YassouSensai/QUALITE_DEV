public enum Wood {
    ALDER,INDIAN_ROSEWOOD, SITKA, MAHOGANY, ADIRONDACK, BRAZILIAN_ROSEWOOD, CEDAR, COCOBOLO, MAPLE;

    public String toString() {
        switch (this) {
            case ALDER: return "ALDER";
            case INDIAN_ROSEWOOD: return "INDIAN_ROSEWOOD";
            case SITKA: return "SITKA";
            case MAHOGANY: return "MAHOGANY";
            case ADIRONDACK: return "ADIRONDACK";
            case BRAZILIAN_ROSEWOOD: return "BRAZILIAN_ROSEWOOD";
            case CEDAR: return "CEDAR";
            case COCOBOLO: return "COCOBOLO";
            case MAPLE: return "MAPLE";
            default: return "Unspecified";


        }
    }
}

