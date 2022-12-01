public class Pain {
    public enum TPain {
        CLASSIQUE, COMPLET, GRAINES, SESAME, BRIOCHE
    }
    private TPain type;

    public Pain(TPain type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pain{" +
                "type=" + type +
                '}';
    }

    public TPain getType() {
        return type;
    }

    public void setType(TPain type) {
        this.type = type;
    }

}
